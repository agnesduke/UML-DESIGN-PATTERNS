package Patronsdestructuration.Composite.Fichier;

public class Fichier extends Repertoire{
    
    Fichier(String nom, String type){
        super(nom, type);
    }
    @Override
    void decrire(){
        System.out.println(getNom() + " " + getType());

    }

    @Override
    void supprimer(){
        System.out.println("supprime");
    }
}
