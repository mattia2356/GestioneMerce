public class App {
    public static void main(String[] args) throws Exception {
        Merce abbigliamento = new Abbigliamento("Codice1", 11.2, 'F', "S", "Maglia");
        Alimentare fresco = new Freschi("Codice2", 30.2, "Pesce", 10.2, 45.1, true);
        Alimentare conservato = new Conservati("Codice3", 5.2, "Pasta", 2, 12.10, "Barilla");
        Carrello carrello = new Carrello(3);

        System.out.println("CLASSE MERCE:");
        System.out.println("\n"+"Abbigliamento: "+abbigliamento.toString());
        System.out.println("\n"+"Fresco: "+fresco.toString());
        System.out.println("\n"+"Conservato: "+conservato.toString());

        carrello.AddProdotto(abbigliamento, 0);
        carrello.AddProdotto(fresco, 1);
        carrello.AddProdotto(conservato, 2);

        //Sistemare Carrello
        System.out.println(carrello.esportaContenuto());
        
    }
}
