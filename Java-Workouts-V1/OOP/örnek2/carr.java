public class carr {

    protected String model;
    private String renk; // direk değistirilemz
    private int kapılar;
    private int teker_sayi;
    private String motor;

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKapılar() {
        return kapılar;
    }

    public void setKapılar(int kapılar) {
        this.kapılar = kapılar;
    }

    public int getTeker_sayi() {
        return teker_sayi;
    }

    public void setTeker_sayi(int teker_sayi) {

        if (teker_sayi < 0) {
            System.out.println("teker 0 dan düsük olamaz");
        } else {
            this.teker_sayi = teker_sayi;


        }
    }
    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
