package Patronsdestructuration.Composite.Texte;

public class Client {
    
    public static void main(String[] args){
        Texte paragraph = new Paragraphe();
    paragraph.setPreambule("sub preamble");
    paragraph.setTitre("sub title");

    Section section = new Section();

    section.setTitre("main title");
    section.ajout(paragraph);
    section.setPreambule("main preambule");

    paragraph.retrait(0);
    System.out.println(section.getTitre());
    System.out.println(section.getPreambule());
    for (Texte texte : section.getSousection()){

        System.out.println(texte.getTitre());
        System.out.println(texte.getPreambule());
    }

    }
}
