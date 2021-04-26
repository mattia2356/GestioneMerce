public class Abbigliamento extends Merce{
    //Attributi
    private static double scontoUomo=5.0;
    private static double scontoDonna=10.0;
    private char sesso;
    private String taglia;
    private String tipologia;

    //Costruttori
    public Abbigliamento(){

    }
    public Abbigliamento(String codice, double prezzoUnitario,char sesso, String taglia, String tipologia){
        super(codice, prezzoUnitario);
        setSesso(sesso);
        setTaglia(taglia);
        setTipologia(tipologia);

    }

    //Setter && Getter
    public void setScontoUomo(double scontoUomo) {
        this.scontoUomo = scontoUomo;
    }
    public void setScontoDonna(double scontoDonna) {
        this.scontoDonna = scontoDonna;
    }
    public void setSesso(char sesso) {
        this.sesso = sesso;
    }
    public void setTaglia(String taglia) {
        this.taglia = taglia;
    }
    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }
    public double getScontoUomo() {
        return scontoUomo;
    }
    public double getScontoDonna() {
        return scontoDonna;
    }
    public char getSesso() {
        return sesso;
    }
    public String getTaglia() {
        return taglia;
    }
    public String getTipologia() {
        return tipologia;
    }

    //Metodi
    @Override
    public double calcolaImporto() {
        if(sesso == 'F'){
            return getPrezzoUnitario()-getPrezzoUnitario()*getScontoDonna()/100.0;
        }
        if (sesso == 'M') {
            return getPrezzoUnitario()-getPrezzoUnitario()*getScontoUomo()/100.0;
        }
        return getPrezzoUnitario();
    }

    @Override
    public Merce clone() {
        Abbigliamento ab = new Abbigliamento(super.getCodice(), super.getPrezzoUnitario(), getSesso(), getTaglia(), getTipologia());
        return ab;
    }

    public String toString(){
        return super.toString() + "| Tipologia: " +getTipologia() + "| Sesso: " +getSesso() + "| Taglia: " +getTaglia() + "| Prezzo: " +calcolaImporto();
    }
}
