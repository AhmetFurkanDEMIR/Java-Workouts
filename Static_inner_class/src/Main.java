public class Main {

    public static void main(String[] args){

        Geometri.Daire daire = new Geometri.Daire();
        Geometri.Kare kare = new Geometri.Kare();
        Geometri.Dikdörtgen dikdörtgen = new Geometri.Dikdörtgen();

        daire.daire_alan(5);
        daire.daire_cevre(5);

        kare.kare_alan(9);
        kare.Kare_cevre(9);

        dikdörtgen.alan(8,5);
        dikdörtgen.cevre(8,5);


    }

}
