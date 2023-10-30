package Devoir2_abstract_factory.abstractFactory2;

public class client {

    public static void main(String[]args){
        IProduitFactory produitFactory1 = new ProduitFactory1();
        IProduitFactory produitFactory2 = new ProduitFactory2();
        


        ProduitA produitA = null;
        ProduitB produitB = null;
        ProduitC produitC = null;


        System.out.println("utilisation de la premiere fabrique");
        produitA = produitFactory1.getProduitA();
        produitB = produitFactory1.getProduitB();
        produitC = produitFactory1.getProduitC();
        produitA.methodeA();
        produitB.methodeB();
        produitC.methodeC();


        System.out.println("utilisation de la seconde fabrique");
        produitA = produitFactory2.getProduitA();
        produitB = produitFactory2.getProduitB();
        produitC = produitFactory2.getProduitC();
        produitA.methodeA();
        produitB.methodeB();
        produitC.methodeC();
    }
    
}
