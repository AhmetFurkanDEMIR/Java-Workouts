public class main {

    // Encapsulation kullanmamanın dezavantajları:
    // 1-) Değikenlere direk erişilebilmektedir. ve saçma değerler atanabilir.
    // 2-) Değişkenlerden herhangi birine değer vermeseydik class larda hata verir.
    // 3-) Class lardaki herhangi bir değikenin adı değişirse çok sayıda değişiklik yapmanız gerekmektedir.


    // Encapsulation kullanmamanın avantajları:
    // 1-)istenile aralıkta değerler verilmezse bakiye ön tanımlı değer olarak kalır
    // 2-) Herhangi bir değiken adı değiştirilince class larda çok az bir değişiklik yapmalıyız.
    // 3-) Sınıftan yeni bir obje yaratılınca değişkenlere değer atamazsan hata verir.


    public static void main(String[] args){

        /*
        Abone abone = new Abone();

        abone.isim = "Ahmet Furkan Demir";
        abone.bakiye = 200;
        abone.sehir = "Ankara";

        abone.dogalgaz_kullan(190);

        */

        GelismisAbone abone = new GelismisAbone("Ahmet furkan demir",890,"İstanbul");

        abone.bakiye_ogren();


    }

}
