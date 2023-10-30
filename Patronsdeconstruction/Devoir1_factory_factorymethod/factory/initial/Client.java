package Devoir1_factory_factorymethod.factory.initial;

/**
 * client
 */
public class Client {

    public static void main(String[] args) {
        ProduitFactory produitFactory1 = new ProduitFactory1();
        ProduitFactory produitFactory2 = new ProduitFactory2();
        

        ProduitA produitA = null;

        System.out.println("utilisation de la première fabrique");
        produitA = produitFactory1.getProduitA();
        produitA.methodeA();

        System.out.println("utilisation de la deuxième fabrique");
        produitA = produitFactory2.getProduitA();
        produitA.methodeA();

    
    }
}