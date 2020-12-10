public abstract class Sekil{

    private String isim;

    public Sekil(String isim) {
        this.setIsim(isim);
    }

    abstract void alan_hesapla();

    abstract void cevre_hesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void isim_soyle(){

        System.out.println(isim);

    }

}
