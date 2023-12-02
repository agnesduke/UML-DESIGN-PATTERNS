package Patronsdestructuration.Adapter.Figure;

public class Rectangle {
    
    private float longueur;
    private float largeur;

    public void setLongueur(float longueur){
        this.longueur = longueur;
    }

    public void setLargeur(float largeur){
        this.largeur = largeur;
    }

    public float perimetre(){
        return(longueur + largeur)*2;
    }

    public float aire(){
        return longueur * largeur;
    }
}
