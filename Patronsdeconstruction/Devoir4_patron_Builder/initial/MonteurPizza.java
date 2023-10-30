package Devoir4_patron_Builder.initial;

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
/*monteurConcret */
class MonteurPizzaReine extends MonteurPizza{
    public void monterPate()
    {
        pizza.setPate("croisee");
    }

     public void monterSauce()
    {
        pizza.setSauce("douce");
    }

     public void monterGarniture()
    {
        pizza.setgarniture("jambon + champignon");
    }
}

/*monteurConcret */
class MonteurPizzaPiquante extends MonteurPizza{
    public void monterPate()
    {
        pizza.setPate("feuilletee");
    }

     public void monterSauce()
    {
        pizza.setSauce("piquante");
    }

     public void monterGarniture()
    {
        pizza.setgarniture("peperonie + salamanie");
    }
}