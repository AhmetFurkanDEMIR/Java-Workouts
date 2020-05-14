public class Kasa {

    private String model;
    private String üretici;
    private String malzeme;

    public Kasa(String model, String üretici, String malzeme){

        this.setModel(model);
        this.setÜretici(üretici);
        this.setMalzeme(malzeme);

    }

    public void kasa_ac(){
        System.out.println("\n Kasa açılıyor");
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

    public String getMalzeme() {
        return malzeme;
    }

    public void setMalzeme(String malzeme) {
        this.malzeme = malzeme;
    }
}