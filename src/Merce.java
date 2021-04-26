abstract public class Merce {
    //Attributi
    private String codice;
    private double prezzoUnitario;

    //Costruttori
    public Merce(){

    }
    public Merce(String codice, double prezzoUnitario){
        setCodice(codice);
        setPrezzoUnitario(prezzoUnitario);
    }

    //Setter && Getter
    public void setCodice(String codice) {
        this.codice = codice;
    }
    public void setPrezzoUnitario(double prezzoUnitario) {
        this.prezzoUnitario = prezzoUnitario;
    }
    public String getCodice() {
        return codice;
    }
    public double getPrezzoUnitario() {
        return prezzoUnitario;
    }

    //Metodi
    abstract public double calcolaImporto();
    abstract public Merce clone();
    public String toString(){
        String s="";
        s+="|Codice: " + getCodice() + " |Prezzo: " +getPrezzoUnitario();
        return s;
    }


}
