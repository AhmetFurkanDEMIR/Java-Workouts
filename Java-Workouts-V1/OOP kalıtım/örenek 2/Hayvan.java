public class Hayvan {

    private String isim;
    private int kilo;
    private int boy;
    private int bacak_sayisi;

    public Hayvan(String isim, int kilo, int boy, int bacak_sayisi){

        this.setIsim(isim);
        this.setKilo(kilo);
        this.setBoy(boy);
        this.setBacak_sayisi(bacak_sayisi);

    }

    public void yemek_ye(){
        System.out.println("Hayvan şuan yemek yiyiyor");
    }

    public void harekete_geç(int hiz){
        System.out.println("hayvan "+hiz+" ile harekete geçiyor");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getBacak_sayisi() {
        return bacak_sayisi;
    }

    public void setBacak_sayisi(int bacak_sayisi) {
        this.bacak_sayisi = bacak_sayisi;
    }
}
