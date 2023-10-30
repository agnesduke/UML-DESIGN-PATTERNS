package Devoir1_factory_factorymethod.factory.modifier;



public abstract class ProduitA{

    public ProduitA getProduitA(){
        return createProduitA();
    }
    protected abstract ProduitA createProduitA();
    public void methodeA() {
    }
}






