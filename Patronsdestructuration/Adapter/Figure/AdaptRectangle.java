package Patronsdestructuration.Adapter.Figure;

public class AdaptRectangle implements Icarre{
    private Rectangle rectangle;

    AdaptRectangle(){
        this.rectangle = new Rectangle();
    }

    @Override
    public float perimetre(float cote){
        rectangle.setLargeur(cote);
        rectangle.setLongueur(cote);
        return rectangle.perimetre();
    }

    @Override
    public float aire(float cote){
        rectangle.setLargeur(cote);
        rectangle.setLongueur(cote);
        return rectangle.aire();
    }
    
}
