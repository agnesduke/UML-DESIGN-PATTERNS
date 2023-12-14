package Patronsdestructuration.Decorator;

public class Client {
    
    public static void main(String[] args){
        Fenetre fe = new FenetreSimple();

        DecorateurFenetre decorateurFenetreVerticale = new DecorateurCurseurVertical(fe);

        DecorateurFenetre decorateurFenetreHorizontale = new DecorateurCurseurHorizontal(decorateurFenetreVerticale);

        decorateurFenetreHorizontale.decrire();
        
    }
}
