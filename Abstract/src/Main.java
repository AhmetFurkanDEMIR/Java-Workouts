public class Main {

    static public void main(String[] args){

        Kare kare1 = new Kare("kare1", 50);
        Daire daire1 = new Daire("daire1", 30);

        kare1.alan_hesapla();
        kare1.cevre_hesapla();
        daire1.alan_hesapla();
        daire1.cevre_hesapla();

        Sekil sekil1;
        sekil1 = new Kare("kare2", 90);
        sekil1.alan_hesapla();
        sekil1.cevre_hesapla();
    }

}
