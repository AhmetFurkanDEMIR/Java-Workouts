public class Main {

    public static void main(String[] args){

        class Daire_Alan{
            public void daire_alan(int yaricap){
                System.out.println(" Daire alan : "+(yaricap*yaricap*Math.PI));
            }

        }

        class Daire_Cevre{

            public void daire_cevre(int yaricap){
                System.out.println(" Daire alan : "+(2*yaricap*Math.PI));
            }

        }

        class Kare_Alan{
            public void kare_alan(int kenar){
                System.out.println(" Daire alan : "+(kenar*kenar));
            }

        }

        class Kare_Cevre{

            public void kare_cevre(int kenar){
                System.out.println(" Daire alan : "+(kenar*4));
            }

        }

        Daire_Alan alan_daire = new Daire_Alan();
        Daire_Cevre cevre_daire = new Daire_Cevre();

        Kare_Alan alan_kare = new Kare_Alan();
        Kare_Cevre cevre_kare = new Kare_Cevre();

        alan_daire.daire_alan(5);
        cevre_daire.daire_cevre(5);

        System.out.println("\n\n");

        alan_kare.kare_alan(9);
        cevre_kare.kare_cevre(9);
    }



}
