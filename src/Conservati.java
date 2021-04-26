public class Conservati extends Alimentare{
    //Attributi
    private String marca;

    //Costruttori
    public Conservati(){

    }
    public Conservati(String codice, double prezzoUnitario,String descrizione, double peso, double calorieUnitarie, String marca){
        super(codice, prezzoUnitario, descrizione, peso, calorieUnitarie);
        setMarca(marca);
    }

    //Setter && Getter
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }

    //Metodi
    public String toString(){
        return super.toString() + "| Marca: " +getMarca();
    }

    public Conservati clone(){
        Conservati cn = new Conservati(super.getCodice(), super.getPrezzoUnitario(), super.getDescrizione(), super.getPeso(), super.getCalorieUnitarie(),getMarca());
        return cn;
    }
}
