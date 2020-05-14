public class yönetici extends caalisan{ // subclass, caalisan sınıfına ait tüm özellikleri aldık
    // bu sınıfa özel konstaktır yazmalıyız.

    private int kisi; // ekstra kendi özelliğimiz

    public yönetici(String isim, int maas, String departman, int kisi){

        super(isim,maas,departman); // caalisan sınıfına ait konstaktrı aldık
        this.setKisi(kisi);

    }

    public void zam(int miktar){

        System.out.println("zam yapildi");

    }

    public void bilgileri_gostr(){

        /*System.out.println("\n Ad,Soyad = "+ getIsim() +
                "\n Maaş = "+ getMaas() +
                "\n departman = "+ getDepartman()+
                "\n sorumlu kisi sayisi = "+getKisi());*/

        super.bilgileri_gostr(); // yada fonksiyona ekleme yapabilirsin

        System.out.println(" sorumlu kisi sayisi = "+getKisi());

    }

    public int getKisi() {
        return kisi;
    }

    public void setKisi(int kisi) {
        this.kisi = kisi;
    }
}
