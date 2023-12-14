package Patronsdestructuration.Decorator;

public class DecorateurCurseurVertical extends DecorateurFenetre{
    public DecorateurCurseurVertical(Fenetre fenetre){
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
    
    public void dessineCurseurVertical(){
        System.out.println("Dessine decorateurCurseurVertical");
    }
}
