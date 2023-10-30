package Devoir4_patron_Builder.nouveau;
/*monteurConcret Piquante*/
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