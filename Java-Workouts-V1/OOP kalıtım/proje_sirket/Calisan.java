public class Calisan {

    private String isim_soyisim;
    private int yas;
    private String saglik_durumu;
    private double maas;
    private String departman;

    public Calisan(String isim_soyisim, int yas, String saglik_durumu, String departman, double maas){

        this.setIsim_soyisim(isim_soyisim);
        this.setYas(yas);
        this.setSaglik_durumu(saglik_durumu);
        this.setMaas(getMaas());
        this.setDepartman(departman);
        this.maas = maas;

    }

    public void bilgi(){

        System.out.println("\n İsim, soyisim = "+ getIsim_soyisim() +
                "\n Yas = "+ getYas() +
                "\n sağlık durumu = "+ getSaglik_durumu() +
                "\n maaş = "+ getMaas() +
                "\n bagli olduğu departman = "+ getDepartman());

    }

    public void zam(double miktar){

        if(miktar<800 && miktar>20){

            setMaas(getMaas() + miktar);
            System.out.println(miktar+" Tl zam yapılmıştır");

        }

        else{
            System.out.println("\n hatalı değer aralığı");
        }

    }

    public void degistir(String yeni){

        setDepartman(yeni);

        System.out.println("Departman "+yeni+" olarak değistirilmistir");

    }


    public String getIsim_soyisim() {
        return isim_soyisim;
    }

    public void setIsim_soyisim(String isim_soyisim) {
        this.isim_soyisim = isim_soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getSaglik_durumu() {
        return saglik_durumu;
    }

    public void setSaglik_durumu(String saglik_durumu) {
        this.saglik_durumu = saglik_durumu;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
