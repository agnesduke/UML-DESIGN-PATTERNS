package Devoir3_singleton.Singleton2;

public class TestSingleton {
  


    
    public static void main(String[] args)
     {
    int som = Singleton.getInstance().somme(2, 5);
     System.out.printf("la somme est %d",som);
     Singleton s1 = Singleton.getInstance(8, 3);
     s1.affiche();
     Singleton s2 = Singleton.getInstance(5, 9);
     s2.affiche();


     int sous = Singleton.getInstance().soustraction(2, 5);
     System.out.printf("la somme est %d",sous);
     Singleton s3 = Singleton.getInstance(8, 3);
     s3.affiche();
     Singleton s4 = Singleton.getInstance(5, 9);
     s4.affiche();

    int mul = Singleton.getInstance().multiplication(2, 5);
     System.out.printf("la somme est %d",mul);
     Singleton s5 = Singleton.getInstance(8, 3);
     s5.affiche();
     Singleton s6 = Singleton.getInstance(5, 9);
     s6.affiche();


     float moy = Singleton.getInstance().moyenne(2, 5);
     System.out.printf("la somme est %d",moy);
     Singleton s7 = Singleton.getInstance(8, 3);
     s7.affiche();
     Singleton s8 = Singleton.getInstance(5, 9);
     s8.affiche();

     }
     }




