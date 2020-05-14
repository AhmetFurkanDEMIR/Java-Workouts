public class Anakart {

    private String model;
    private String üretici;
    private int bellek_yuva_sayisi;
    private int cpu_pin_sayısı;
    private String isletim_sistemi;

    public Anakart(String model, String üretici, int bellek_yuva_sayisi, int cpu_pin_sayısı, String isletim_sistemi){

        this.setModel(model);
        this.setÜretici(üretici);
        this.setBellek_yuva_sayisi(bellek_yuva_sayisi);
        this.setCpu_pin_sayısı(cpu_pin_sayısı);
        this.isletim_sistemi = isletim_sistemi;

    }

    public void isletim_sistemi_yükle(String  isletim_sis){
        isletim_sistemi = isletim_sis;
        System.out.println("\n işletim sistemi yüklendi");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getÜretici() {
        return üretici;
    }

    public void setÜretici(String üretici) {
        this.üretici = üretici;
    }

    public int getBellek_yuva_sayisi() {
        return bellek_yuva_sayisi;
    }

    public void setBellek_yuva_sayisi(int bellek_yuva_sayisi) {
        this.bellek_yuva_sayisi = bellek_yuva_sayisi;
    }

    public int getCpu_pin_sayısı() {
        return cpu_pin_sayısı;
    }

    public void setCpu_pin_sayısı(int cpu_pin_sayısı) {
        this.cpu_pin_sayısı = cpu_pin_sayısı;
    }
}
