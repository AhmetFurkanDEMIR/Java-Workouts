public class Yönetici extends Calisan{

    private int sorumlu_kisi_sayisi;
    private int aile_ferdi_sayisi;

    public Yönetici(String isim_soyisim, int yas, String saglik_durumu, String departman, double maas, int sorumlu_kisi_sayisi, int aile_ferdi_sayisi){

        super(isim_soyisim, yas, saglik_durumu, departman,maas);

        this.setSorumlu_kisi_sayisi(sorumlu_kisi_sayisi);
        this.setAile_ferdi_sayisi(aile_ferdi_sayisi);

    }

    public void zam(int miktar){

        super.zam(miktar);

    }

    public void bilgi(){

        System.out.println("\n İsim, soyisim = "+ getIsim_soyisim() +
                "\n Yas = "+ getYas() +
                "\n sağlık durumu = "+ getSaglik_durumu() +
                "\n maaş = "+ getMaas() +
                "\n bagli olduğu departman = "+ getDepartman()+
                "\n Sorumlu kişi sayısı = "+ getSorumlu_kisi_sayisi()+
                "\n Aile ferdi sayısı = "+ getAile_ferdi_sayisi());


    }

    public int getSorumlu_kisi_sayisi() {
        return sorumlu_kisi_sayisi;
    }

    public void setSorumlu_kisi_sayisi(int sorumlu_kisi_sayisi) {
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    public int getAile_ferdi_sayisi() {
        return aile_ferdi_sayisi;
    }

    public void setAile_ferdi_sayisi(int aile_ferdi_sayisi) {
        this.aile_ferdi_sayisi = aile_ferdi_sayisi;
    }
}
