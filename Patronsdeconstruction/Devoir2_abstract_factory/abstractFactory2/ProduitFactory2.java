package Devoir2_abstract_factory.abstractFactory2;


    public class ProduitFactory2 implements IProduitFactory{
        public ProduitA getProduitA() {
            return new ProduitA1();
        }


       public ProduitB1 getProduitB() {
        return new ProduitB1();
    }

public ProduitC1 getProduitC() {
        return new ProduitC1();
    }



   




    
    
}
