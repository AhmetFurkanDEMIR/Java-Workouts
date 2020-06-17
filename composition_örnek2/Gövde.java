public class Gövde {

    private int kapi_sayisi;
    private int ayna_sayisi;
    private int tekerlek_yedek_tekerlek_sayisi;

    public Gövde(int kapi_sayisi, int ayna_sayisi, int tekerlek_yedek_tekerlek_sayisi) {
        this.setKapi_sayisi(kapi_sayisi);
        this.setAyna_sayisi(ayna_sayisi);
        this.setTekerlek_yedek_tekerlek_sayisi(tekerlek_yedek_tekerlek_sayisi);
    }

    public int getKapi_sayisi() {
        return kapi_sayisi;
    }

    public void setKapi_sayisi(int kapi_sayisi) {
        this.kapi_sayisi = kapi_sayisi;
    }

    public int getAyna_sayisi() {
        return ayna_sayisi;
    }

    public void setAyna_sayisi(int ayna_sayisi) {
        this.ayna_sayisi = ayna_sayisi;
    }

    public int getTekerlek_yedek_tekerlek_sayisi() {
        return tekerlek_yedek_tekerlek_sayisi;
    }

    public void setTekerlek_yedek_tekerlek_sayisi(int tekerlek_yedek_tekerlek_sayisi) {
        this.tekerlek_yedek_tekerlek_sayisi = tekerlek_yedek_tekerlek_sayisi;
    }
}
