package Devoir1_factory_factorymethod.factory.modifier;



public abstract class ProduitFactory {

    

    public ProduitA getProduitA() {
        return createProduitA();
        
    }

    public abstract ProduitA createProduitA() ;
}
