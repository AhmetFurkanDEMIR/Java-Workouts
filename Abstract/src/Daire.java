public class Daire extends Sekil {

    private int yari_cap;

    public Daire(String isim, int yari_cap){
        super(isim);
        this.setYari_cap(yari_cap);
    }

    @Override
    void cevre_hesapla() {
        System.out.println(getIsim() + " objesinin cevresi : " + (2*getYari_cap()*Math.PI));
    }

    @Override
    void alan_hesapla() {

        System.out.println(getIsim() + " objesinin alani : "+(Math.PI*getYari_cap()*getYari_cap()));
    }

    public int getYari_cap() {
        return yari_cap;
    }

    public void setYari_cap(int yari_cap) {
        this.yari_cap = yari_cap;
    }
}
