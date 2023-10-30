package Devoir4_patron_Builder.nouveau;
/*monteurConcret Reine */
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
