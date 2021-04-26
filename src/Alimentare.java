abstract public class Alimentare extends Merce{
    //Attributi
    private String descrizione;
    private double peso;
    private double calorieUnitarie;

    //Costruttori
    public Alimentare(){

    }
    public Alimentare(String codice, double prezzoUnitario,String descrizione, double peso, double calorieUnitarie){
        super(codice, prezzoUnitario);
        setCalorieUnitarie(calorieUnitarie);
        setDescrizione(descrizione);
        setPeso(peso);
    }

    //Setter && Getter
    public void setCalorieUnitarie(double calorieUnitarie) {
        this.calorieUnitarie = calorieUnitarie;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getCalorieUnitarie() {
        return calorieUnitarie;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public double getPeso() {
        return peso;
    }

    //Metodi
    @Override
    public double calcolaImporto() {
        return super.getPrezzoUnitario()*getPeso();
    }

    public double calcolaCalorie(){
        return getPeso()*getCalorieUnitarie();
    }

    public String toString(){
        return super.toString() + "| Descrizione: " +getDescrizione() + "| Peso: " +getPeso() + "| Importo: " +calcolaImporto() + "| calorie: " +calcolaCalorie();
    }
}
