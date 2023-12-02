package Patronsdestructuration.Adapter.Composant;

public class ComposantPdf {
    
    private String contenu;

    int pdfFixeContenu (String contenu){
    this.contenu = contenu;
    return 1;
    }

    int pdfPrepareAffichage(){

        System.out.println("loading preview...");
        
        return 1;
    }
    int pdfRafraichir(){

          System.out.println("refreshing...");
          return 1;
    }

    int pdfTermineAffichage(){
          System.out.println("termine : " + "\"" + contenu + "\"");
          return 1;
    }

    int pdfEnvoieImprimante(){
        System.out.println("envoie pour impressions...");
        return 1;
    }
    public String getContenu(){
        
        return contenu;
    }
}
