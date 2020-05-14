public class main {
    // sahiplik ilişkisi var
    public static void main(String[] args){

        Pixel pixel = new Pixel(1920,1080);
        Monitor monitor = new Monitor("samsung a90","samsung","18.5",pixel);

        Kasa kasa = new Kasa("shadow black","shadow","metal");

        Anakart anakart = new Anakart("b250 pro","asus",4,1110,"Linux");

        Bilgisayar bilgisayar = new Bilgisayar(monitor,kasa,anakart);

        bilgisayar.getKasa().kasa_ac(); // dönen referans üzerinden işlem yapıyoruz.

        bilgisayar.getMonitor().monutor_kapat();

        bilgisayar.getAnakart().isletim_sistemi_yükle("pardus");

    }

}
