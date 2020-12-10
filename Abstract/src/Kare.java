public class Kare extends Sekil{

    private int kenar;

    public Kare(String isim, int kenar){
        super(isim);
        this.setKenar(kenar);

    }

    @Override
    void cevre_hesapla() {
        System.out.println(getIsim() + " objesinin cevresi : "+(getKenar()*4));
    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim() + " objesinin alani : "+(getKenar()*getKenar()));
    }

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }
}
