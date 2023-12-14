package Patronsdestructuration.Decorator;

public class DecorateurCurseurHorizontal extends DecorateurFenetre{
    public DecorateurCurseurHorizontal(Fenetre fenetre){
        super(fenetre);
    }

    @Override
    public void dessiner(){
        super.dessiner();
        System.out.println("Decore dessine decorateur");
    }
    @Override
    public void decrire(){
        super.decrire();
        System.out.println("Decore decrire decorateur");
    }
    
    public void dessineCurseurHorizontal(){
        System.out.println("Dessine decorateurCurseurHorizontal");
    }
    
}