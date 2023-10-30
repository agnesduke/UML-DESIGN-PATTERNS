package Devoir4_patron_Builder.nouveau;

/*monteurConcret pizza locale*/
class MonteurLocale extends MonteurPizza{
    public void monterPate()
    {
        pizza.setPate("feuille de macabo");
    }

     public void monterSauce()
    {
        pizza.setSauce(" sauce jaune");
    }

     public void monterGarniture()
    {
        pizza.setgarniture("escargo");
    }
}