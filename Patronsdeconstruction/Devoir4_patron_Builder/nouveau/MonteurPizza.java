package Devoir4_patron_Builder.nouveau;

/*monteur */
abstract class MonteurPizza {
    protected Pizza pizza;
    public Pizza getPizza(){
        return pizza;
    }
    public void creeNouvellePizza(){
        pizza = new Pizza();
    }
    public abstract void monterPate();
    public abstract void monterSauce();
    public abstract void monterGarniture();
 
}


