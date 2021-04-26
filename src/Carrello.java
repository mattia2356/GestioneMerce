public class Carrello {
    private final int MAX_OGGETTI = 100;
    private int oggetti;
    private Merce[] carrello;

    //Costruttori
    public Carrello(){
        carrello = new Merce[MAX_OGGETTI];
        oggetti=0;
    }

    public Carrello(int numProdotti){
        carrello = new Merce[numProdotti];
    }

    public Carrello (Carrello c){
        for (int i = 0; i < carrello.length; i++) {
            carrello[i] = c.carrello[i];
        }
    }

    public void setCarrello(Merce[] carrello) {
        this.carrello = carrello;
    }
    public Merce[] getCarrello() {
        return carrello;
    }

    //Add
    public void AddProdotto(Merce m, int pos){
        if(oggetti < MAX_OGGETTI){
            carrello[oggetti] = m.clone();
            oggetti++;
        }
    }

    //Delete
    public void DeleteProdotto(int pos){
        if(pos >= 0 && pos < carrello.length){
            carrello[pos] = null;
        }
        carrello[carrello.length - pos] = null;
        oggetti--;
    }

    //Costo totale
    public double calcoloPrezzoTotale(){
        double prezzo=0;
        for (int i = 0; i < oggetti; i++) {
            prezzo += carrello[i].calcolaImporto();
        }
        return prezzo;
    }

    //Calcolo calorie
    public double calcolaCalorieTotali(){
        double calorie=0;
        for (int i = 0; i < oggetti; i++) {
            if (carrello[i] instanceof Alimentare) {
                calorie += ((Alimentare)carrello[i]).calcolaCalorie();
            }
        }
        return calorie;
    }

    //Esporta
    public Merce[] esportaContenuto(){
        Merce prodotto[] = new Merce[oggetti];
        for (int i = 0; i < oggetti; i++) {
            prodotto[i] = carrello[i].clone();
        }
        return prodotto;
    }
}
