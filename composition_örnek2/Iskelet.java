public class Iskelet {

    private Motor motor;
    private Gövde gövde;
    private Ic_alan ic_alan;

    public Iskelet(Motor motor, Gövde gövde, Ic_alan ic_alan) {
        this.setMotor(motor);
        this.setGövde(gövde);
        this.setIc_alan(ic_alan);
    }


    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Gövde getGövde() {
        return gövde;
    }

    public void setGövde(Gövde gövde) {
        this.gövde = gövde;
    }

    public Ic_alan getIc_alan() {
        return ic_alan;
    }

    public void setIc_alan(Ic_alan ic_alan) {
        this.ic_alan = ic_alan;
    }
}
