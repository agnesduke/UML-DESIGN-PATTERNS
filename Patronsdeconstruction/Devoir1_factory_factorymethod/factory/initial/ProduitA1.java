package Devoir1_factory_factorymethod.factory.initial;

public class ProduitA1 extends ProduitA {

    @Override
    public void methodeA() {
        System.out.println("je suis un produit de type A1");
        System.out.println("ProduitA1.methodeA()");
    }

    @Override
    protected ProduitA createProduitA() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createProduitA'");
    }
    
}
