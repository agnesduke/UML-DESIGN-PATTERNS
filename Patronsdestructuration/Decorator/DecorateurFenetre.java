package Patronsdestructuration.Decorator;

public abstract class DecorateurFenetre implements Fenetre{
    
    protected Fenetre fenetreDecoree;

    DecorateurFenetre(Fenetre fenetre){
        this.fenetreDecoree = fenetre;
    }

    @Override
    public void dessiner(){
        this.fenetreDecoree.dessiner();
    }

    @Override
    public void decrire(){
        this.fenetreDecoree.decrire();
    }
}
