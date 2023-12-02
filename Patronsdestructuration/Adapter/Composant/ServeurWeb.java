package Patronsdestructuration.Adapter.Composant;

public class ServeurWeb {

    public static void main(String[] args, String contenu) {
        
        ComposantPdf composantPdf = new ComposantPdf();
        Document document = new DocumentPdf(composantPdf);

        document.setContenu("new contenu");
        
        document.dessine();
        document.imprime();    
    }
}
