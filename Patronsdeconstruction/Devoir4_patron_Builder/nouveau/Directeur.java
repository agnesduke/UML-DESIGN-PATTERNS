package Devoir4_patron_Builder.nouveau;

public class Directeur {
    private MonteurPizza monteurAbstrait;
   
    Directeur (MonteurPizza monteurPizza) {
        monteurAbstrait = monteurPizza;
    }
    
    public void Construire() {

        monteurAbstrait.creeNouvellePizza();
        monteurAbstrait.monterPate();
        monteurAbstrait.monterGarniture();
        monteurAbstrait.monterSauce();
        monteurAbstrait.getPizza().print();
    }

    public void setMonteurPizza(MonteurPizza monteurPizza) {
        this.monteurAbstrait = monteurPizza;
    }
    
}
