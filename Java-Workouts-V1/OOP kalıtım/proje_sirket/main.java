public class main {

    public static void main(String[] args){

        Calisan calisan1 = new Calisan("Mehmet söner",38,"iyi","temizlik",3000);

        Yönetici yönetici1 = new Yönetici("mehmet ermiş",45,"çok iyi","yazılım",6000,80,5);

        Patron patron1 = new Patron("ahmet furkan demir",19,"güzel","yazılım",10000,200,5,1,"demir.ai");

        calisan1.bilgi();

        calisan1.zam(700);

        calisan1.bilgi();

        yönetici1.bilgi();

        yönetici1.zam(700);

        yönetici1.bilgi();

        patron1.bilgi();

        patron1.zam(600);

        patron1.bilgi();

    }

}
