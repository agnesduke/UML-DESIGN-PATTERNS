package Devoir1_factory_factorymethod.factory.initial;


public abstract class ProduitA{

    public ProduitA getProduitA(){
        return createProduitA();
    }
    protected abstract ProduitA createProduitA();
    public void methodeA() {
    }
}

