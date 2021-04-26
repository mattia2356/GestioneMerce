public class Freschi extends Alimentare{
    //Attributi
    static private double costoSacchetto = 0.05;
    private boolean confezionato;

    //Costruttori
    public Freschi(){

    }
    public Freschi(String codice, double prezzoUnitario,String descrizione, double peso, double calorieUnitarie, boolean confezionato){
        super(codice, prezzoUnitario, descrizione, peso, calorieUnitarie);
        setConfezionato(confezionato);   
    }

    //Setter && Getter
    public void setConfezionato(boolean confezionato) {
        this.confezionato = confezionato;
    }
    public boolean isConfezionato() {
        return confezionato;
    }
    public static double getCostoSacchetto() {
        return costoSacchetto;
    }
    public static void setCostoSacchetto(double costoSacchetto) {
        Freschi.costoSacchetto = costoSacchetto;
    }

    //Metodi
    public String toString(){
        String confezione;
        if(!confezionato){
            confezione = "sfusa";
        }
        else{
            confezione = "preconfezionato";
        }
        return super.toString() + "| Confezione: " + confezione;
    }

    public double calcolaImporto(){
        double costo = super.calcolaImporto();

        if(!confezionato){
            costo += costoSacchetto;
            }
        return costo;
    }

    public Freschi clone(){
        Freschi prodotto = new Freschi(super.getCodice(), super.getPrezzoUnitario(), super.getDescrizione(), super.getPeso(), super.getCalorieUnitarie(), isConfezionato());
        return prodotto;
    }
}
