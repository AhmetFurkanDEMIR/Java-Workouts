public class Patron extends Yönetici{

    private int kaç_yıl;
    private String sirket_ad;

    public Patron(String isim_soyisim, int yas, String saglik_durumu, String departman,double maas, int sorumlu_kisi_sayisi, int aile_ferdi_sayisi,int kaç_yıl, String sirket_ad){

        super(isim_soyisim,yas,saglik_durumu,departman,maas,sorumlu_kisi_sayisi,aile_ferdi_sayisi);

        this.kaç_yıl = kaç_yıl;
        this.sirket_ad = sirket_ad;

    }

    public void bilgi(){
        super.bilgi();
        System.out.println("\n Sirket kaç yıllık = "+kaç_yıl+
                "\n Sirket adi = "+sirket_ad);
    }

}
