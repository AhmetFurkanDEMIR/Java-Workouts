public class GelismisAbone {

    private String isim;
    private int bakiye  = 200;
    private String sehir;


    public GelismisAbone(String isim, int bakiye, String sehir) {
        this.setIsim(isim);

        if(bakiye >= 0 && bakiye < 201){

            this.setBakiye(bakiye);

        }

        this.setSehir(sehir);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public void bakiye_ogren(){

        System.out.println("Bakiyeniz : "+bakiye);

    }


}
