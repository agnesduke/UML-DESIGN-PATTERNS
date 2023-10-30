package Devoir2_abstract_factory.abstractFactory1;


    public class ProduitFactory2 implements IProduitFactory{
        public ProduitA getProduitA() {
            return new ProduitA1();
        }


       public ProduitB1 createProduitB() {
        return new ProduitB1();
    }


    @Override
    public ProduitB getProduitB() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProduitB'");
    }




    
    
}
