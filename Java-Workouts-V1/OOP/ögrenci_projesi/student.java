public class student {

    private String ogrenci_adi;
    private String ogrenci_soyadi;

    private double tc_no;
    private int yas;
    private int okul_no;

    public String getOgrenci_adi() {
        return ogrenci_adi;
    }

    public void setOgrenci_adi(String ogrenci_adi) {
        this.ogrenci_adi = ogrenci_adi;
    }

    public String getOgrenci_soyadi() {
        return ogrenci_soyadi;
    }

    public void setOgrenci_soyadi(String ogrenci_soyadi) {
        this.ogrenci_soyadi = ogrenci_soyadi;
    }

    public double getTc_no() {
        return tc_no;
    }

    public void setTc_no(double tc_no) {
        this.tc_no = tc_no;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getOkul_no() {
        return okul_no;
    }

    public void setOkul_no(int okul_no) {
        this.okul_no = okul_no;
    }

    public void yaz(){

        System.out.println("\n Öğrenci adı = "+ogrenci_adi+
                "\n Öğrenci soyadı = "+ogrenci_soyadi+
                "\n Öğrenci T.C = "+tc_no+
                "\n Öğrenci yaş = "+yas+
                "\n Öğrenci okul no = "+okul_no);


    }

}
