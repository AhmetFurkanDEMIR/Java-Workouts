class Hayvan{

    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus(){

        return "Hayvan konusuyor";
    }

}

class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + "miyavlıyor...";
    }
}

class Köpek extends Hayvan{

    public Köpek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + "havlıyor...";
    }
}

class At extends Hayvan{

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + "kişniyor..";
    }
}

public class main {

    public static void konus(Hayvan hayvan){

        System.out.println(hayvan.konus());

    }

    public static void main(String[] args){

        Hayvan hayvan = new Hayvan("eşşek");

        System.out.println(hayvan.konus());

        // herhangi bir sorun çıkartmaz polymorphism
        // hayvan referansı kedi referansı gibi davranır.
        Hayvan kedi = new Kedi("tekir");

        System.out.println(kedi.konus());

        Köpek köpek = new Köpek("toni");

        System.out.println(köpek.konus());

        // dönüştürme yapmadan tüm nesneler fonksiyona iletilebilri.
        konus(kedi);

    }
}
