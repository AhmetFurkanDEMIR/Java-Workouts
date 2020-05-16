class Isci{

    private String isim;
    private double maas;

    public Isci(String isim, double maas) {
        this.isim = isim;
        this.maas = maas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public void maas_zam(double zam){

        if (zam >=0 && zam <=800){

            this.maas += zam;
        }

    }

    public void maas_bilgi(){

        System.out.println(" Aylık maas = "+maas);

    }

}

class Yönetici extends Isci{

    private String departman;

    public Yönetici(String isim, double maas, String departman) {
        super(isim, maas);
        this.departman = departman;
    }

    @Override
    public void maas_zam(double zam) {
        super.maas_zam(zam);
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    @Override
    public void maas_bilgi() {
        super.maas_bilgi();
    }
}

class Patron extends Yönetici{

    private String şirket_ad;

    public Patron(String isim, double maas, String departman, String şirket_ad) {
        super(isim, maas, departman);
        this.şirket_ad = şirket_ad;
    }

    public String getŞirket_ad() {
        return şirket_ad;
    }

    public void setŞirket_ad(String şirket_ad) {
        this.şirket_ad = şirket_ad;
    }

    @Override
    public void maas_bilgi() {
        super.maas_bilgi();
    }
}

public class main{

    public static void main(String[] args) {

        Isci isci = new Isci("mehmet soner",4000);
        isci.maas_zam(200);
        isci.maas_bilgi();

        Isci yönetici = new Yönetici





                -p("mehmet kalem",700,"yazılım");
        yönetici.maas_zam(100);
        yönetici.maas_bilgi();

        Yönetici patron = new Patron("mehmet kalem",700,"yazılım","demir");
        patron.maas_zam(100);
        patron.maas_bilgi();
    }

}