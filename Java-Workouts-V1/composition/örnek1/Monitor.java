public class Monitor {

    private String model;
    private String üretici;
    private String boyut;
    private Pixel pixel;

    public Monitor(String model, String üretici, String boyut, Pixel pixel){

        this.setModel(model);
        this.setÜretici(üretici);
        this.setBoyut(boyut);
        this.setPixel(pixel);

    }

    public void monutor_kapat(){
        System.out.println("\n monutor kapanıyor");
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

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public Pixel getPixel() {
        return pixel;
    }

    public void setPixel(Pixel pixel) {
        this.pixel = pixel;
    }
}
