package Devoir1_factory_factorymethod.factory.modifier;



public class ProduitFactory1 extends ProduitFactory {

    @Override
    public ProduitA createProduitA() {
        return new ProduitA1();
    }
    
}
