public class Geometri {

    public static class Kare{

        public void kare_alan(int kenar){

            System.out.println(" Kare alani : "+(kenar*kenar));

        }

        public void Kare_cevre(int kenar){

            System.out.println(" Kare cevresi : "+(kenar*4));
        }

    }

    public static class Daire{

        public void daire_alan(int yari_cap){

            System.out.println(" Daire alan : "+(Math.PI*yari_cap*yari_cap));

        }

        public void daire_cevre(int yari_cap){

            System.out.println(" Daire cevre : "+(2*Math.PI*yari_cap));

        }

    }

    public static class Dikdörtgen{

        public void alan(int uzun, int kisa){

            System.out.println(" Dikdörtgen alani : "+(uzun*kisa));

        }

        public void cevre(int uzun, int kisa){

            System.out.println(" Dikdörtgen cevresi : "+(uzun*2 + kisa*2));

        }

    }

}
