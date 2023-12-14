package Patronsdestructuration.Decorator;

public class FenetreSimple implements Fenetre{
    @Override
    public void dessiner(){
        System.out.println("Dessine fentre simple");
    }

    @Override
    public void decrire(){
        System.out.println("Decrire fenetre simple");
    }
}
