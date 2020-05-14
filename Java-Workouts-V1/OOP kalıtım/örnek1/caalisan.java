public class caalisan { // super class veya base class

    private String isim;
    private int maas;
    private String departman;

    public caalisan(String isim, int maas, String departman){

        this.setIsim(isim);

        this.setMaas(maas);

        this.setDepartman(departman);

    }

    public void bilgileri_gostr(){

        System.out.println("\n Ad,Soyad = "+ getIsim() +
                "\n Maaş = "+ getMaas() +
                "\n departman = "+ getDepartman());


    }

    public void Departman_degistir(String yeni){

        this.setDepartman(yeni);

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
