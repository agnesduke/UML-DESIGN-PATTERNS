package Devoir2_abstract_factory.abstractFactory1;


    public class ProduitFactory1 implements IProduitFactory{
        public ProduitA getProduitA() {
            return new ProduitA1();
        }


       public ProduitB1 getProduitB() {
        return new ProduitB1();
    }

 
    
}
