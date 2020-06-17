public class Motor {

    private String motor_numarası;
    private int silindir_sayisi;
    private double beygir_gücü;
    private String motor_üretim_yeri;

    public Motor(String motor_numarası, int silindir_sayisi, double beygir_gücü, String motor_üretim_yeri) {
        this.setMotor_numarası(motor_numarası);
        this.setSilindir_sayisi(silindir_sayisi);
        this.setBeygir_gücü(beygir_gücü);
        this.setMotor_üretim_yeri(motor_üretim_yeri);
    }

    public String getMotor_numarası() {
        return motor_numarası;
    }

    public void setMotor_numarası(String motor_numarası) {
        this.motor_numarası = motor_numarası;
    }

    public int getSilindir_sayisi() {
        return silindir_sayisi;
    }

    public void setSilindir_sayisi(int silindir_sayisi) {
        this.silindir_sayisi = silindir_sayisi;
    }

    public double getBeygir_gücü() {
        return beygir_gücü;
    }

    public void setBeygir_gücü(double beygir_gücü) {
        this.beygir_gücü = beygir_gücü;
    }

    public String getMotor_üretim_yeri() {
        return motor_üretim_yeri;
    }

    public void setMotor_üretim_yeri(String motor_üretim_yeri) {
        this.motor_üretim_yeri = motor_üretim_yeri;
    }
}
