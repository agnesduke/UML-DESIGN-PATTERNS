package Devoir1_factory_factorymethod.factory.modifier;



public class ProduitA2 extends ProduitA{

    
    @Override
    public void methodeA() {
        System.out.println("je suis un produit de type A2");
        System.out.println("ProduitA2.methodeA()");
    }

    @Override
    protected ProduitA createProduitA() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createProduitA'");
    }
}
