public class accont {

    private String hesapno;
    private String isim;
    private String email;
    private String telno;
    private double bakiye;

    public accont(){

        this.hesapno = "bilgi yok";

        this.isim = "bilgi yok";

        this.email = "bilgi yok";

        this.telno = "bilgi yok";

        this.bakiye = 0.0;

        /*

        veya

        this("bilgi yok", "bilgi yok", "bilgi yok", "bilgi yok", 0.0);

         */
    }

    public accont(String hesapno, String isim, String email, String telno, double bakiye){ // constructorlar birden fazla yazılabilirler
        // otomatik yazabilirsin
        this.hesapno = hesapno;

        this.isim = isim;

        this.email = email;

        this.telno = telno;

        this.bakiye = bakiye;


    }

    public void yazdir(){

        System.out.println("\n");

        System.out.println(" Ad = "+isim+
                "\n hesap no = "+hesapno+
                "\n email = "+email+
                "\n tel no = "+telno+
                "\n Bakiye = "+bakiye);

        System.out.println("\n");

    }

    public void paracek(int tl){

        if(tl<0 || tl>1500){

            System.out.println("      Girilen miktar hatalı");

        }

        else if(tl <= bakiye){
            bakiye -= tl;
            System.out.println("      Hesabınızdan "+tl+" Tl çekilmiştir"+
                    "\n      Hesabınızda kalan para = "+bakiye+" Tl");
        }

        else{
            System.out.println("      Hesabınızda yeterli bakiye bulunmamaktadır");
        }

    }

    public void parayatir(int tl){

        if(tl<0){
            System.out.println("      Girilen miktar hatalı");
        }

        else{
            bakiye += tl;
        }

        System.out.println("      Hesabınıza "+tl+" yatirilmistir"+
                "      mevcut bakiyeniz = "+bakiye+" Tl");

    }

    public String getHesapno() {
        return hesapno;
    }

    public void setHesapno(String hesapno) {
        this.hesapno = hesapno;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}
