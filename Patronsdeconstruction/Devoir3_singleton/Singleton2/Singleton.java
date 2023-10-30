package Devoir3_singleton.Singleton2;


public class Singleton {
    
            private static Singleton instance = null;

            private int x;
            private int y;
            private String nom;

            private Singleton()

            {

                super();

            }

             private Singleton(int x, int y)

            {

            this.x=x;

            this.y=y;

            }

            private Singleton(int x, int y, String nom)

            {

            this.x=x;

            this.y=y;

            this.nom = nom;

            }




        public static Singleton getInstance()

        {

        if (instance == null)

        {

        instance = new
        Singleton();

        }

        return instance;

        }

        public static Singleton
        getInstance(int x, int y)

        {

        if (instance == null)

        {

        instance = new
        Singleton(x, y);

        }

        return instance;

        
        }


        public int somme(int x, int y)

            {

            return x+y;

            }

            public int soustraction(int x, int y)

            {

            return x-y;

            }

            public int multiplication(int x, int y)

            {

            return x*y;

            }



            public float moyenne(int x, int y)

            {

            return somme(x, y)/2;

            }

            public static Singleton getInstance(int x, int y, String nom)

        {

                if (instance == null)

                {

                instance = new
                Singleton(x, y, nom);

                }

                return instance;

        }

            public void affiche()

            {

            System.out.println("\nJe suis une instance mes valeurs sont : x = " + this.x + " et y = " +
            this.y + this.nom + "le nom est :");

            }


            @Override

            public Object clone() throws
            CloneNotSupportedException {

            throw new CloneNotSupportedException();
            }

            }


