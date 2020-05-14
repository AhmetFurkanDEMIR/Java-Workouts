public class Köpek extends Hayvan{

    private int dis_sayisi;

    public Köpek(String isim, int kilo, int boy, int bacak_sayisi,int dis_sayisi){

        super(isim, kilo, boy, bacak_sayisi);

        this.setDis_sayisi(dis_sayisi);

    }

    public void kos(int hız){

        System.out.println("kopek kosuyor");

        super.harekete_geç(hız);

    }

    public int getDis_sayisi() {
        return dis_sayisi;
    }

    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }
}
