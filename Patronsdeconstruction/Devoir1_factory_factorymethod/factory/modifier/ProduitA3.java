package Devoir1_factory_factorymethod.factory.modifier;


public class ProduitA3  extends ProduitA{
    
    @Override
    public void methodeA() {
        System.out.println("je suis un produit de type A3");
        System.out.println("ProduitA3.methodeA()");
    }

    @Override
    protected ProduitA createProduitA() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createProduitA'");
    }
}
