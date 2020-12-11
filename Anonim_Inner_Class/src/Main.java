public class Main {

    public static void main(String[] args){

        Iogrenci ogrenci1 = new Iogrenci() {
            @Override
            public void ders_calis() {
                System.out.println("Ders calisiyorum");
            }

            @Override
            public void derse_gir() {
                System.out.println("Derse giriyorum");
            }
        };
        ogrenci1.ders_calis();
        ogrenci1.derse_gir();
        System.out.println("\n----");

        Aogrenci ogrenci2 = new Aogrenci("Ahmet Furkan DEMIR", 19){

            @Override
            void kayit_yaptir() {

                System.out.println(" Kayit yapildi. Isim : "+getIsim()+" No : "+getNo());

            }


        };

        ogrenci2.kayit_yaptir();
        ogrenci2.selamla();

    }

    public static abstract class Aogrenci{

        private String isim;
        private int no;

        public Aogrenci(String isim, int no){
            this.setIsim(isim);
            this.setNo(no);
        }

        abstract void kayit_yaptir();

        public void selamla(){
            System.out.println(" Selamlar...");
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }
    }

    public interface Iogrenci{

        void ders_calis();
        void derse_gir();

    }

}
