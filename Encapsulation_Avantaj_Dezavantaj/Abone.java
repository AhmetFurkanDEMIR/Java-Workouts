// Doğalgaz abonesi

public class Abone {

    public String isim;
    public int bakiye;
    public String sehir;

    public void dogalgaz_kullan(int miktar) {

        if (bakiye - miktar < 0) {
            System.out.println("Yeterli bakiye yoktur.");
        } else if (bakiye - miktar == 0) {

            System.out.println("Bakiyeniz bitmiştir.");

        } else {

            bakiye -= miktar;

            System.out.println("Kalan bakiye : " + bakiye);

        }

    }

    public void bakiye_ogren(){

        System.out.println("Bakiye = " + bakiye);

    }

}
