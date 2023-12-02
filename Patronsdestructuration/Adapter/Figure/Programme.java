package Patronsdestructuration.Adapter.Figure;

public class Programme {
    
    public static void main(String[] args){

        Icarre icarre = new AdaptRectangle();

        float perimetre = icarre.perimetre(4);
        float aire = icarre.aire(4);

        System.out.println(perimetre);
        System.out.println(aire);

    }

}