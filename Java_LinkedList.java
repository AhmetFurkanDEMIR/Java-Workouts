import java.util.Scanner;

class Telefon{

    private Telefon next;

    private String tel_turu;
    private String tel_no;


    public Telefon getNext() {
        return next;
    }

    public void setNext(Telefon next) {
        this.next = next;
    }

    public String getTel_turu() {
        return tel_turu;
    }

    public void setTel_turu(String tel_turu) {
        this.tel_turu = tel_turu;
    }

    public String getTel_no() {
        return tel_no;
    }

    public void setTel_no(String tel_no) {
        this.tel_no = tel_no;
    }
}

class Rehber{

    private Rehber next;
    private Telefon tel;

    private String kisi_adi;
    private int tel_adet;
    static public int count = 0;


    public Rehber getNext() {
        return next;
    }

    public void setNext(Rehber next) {
        this.next = next;
    }

    public Telefon getTel() {
        return tel;
    }

    public void setTel(Telefon tel) {
        this.tel = tel;
    }

    public String getKisi_adi() {
        return kisi_adi;
    }

    public void setKisi_adi(String kisi_adi) {
        this.kisi_adi = kisi_adi;
    }

    public int getTel_adet() {
        return tel_adet;
    }

    public void setTel_adet(int tel_adet) {
        this.tel_adet = tel_adet;
    }
}

public class Java_LinkedList {

    public static Rehber root;
    public static Rehber iterator;
    public static Telefon iterator_tel;

    static public void main(String[] args){

        int j = 1;
        Scanner input = new Scanner(System.in);

        root = new Rehber();
        iterator = root;

        while(true){

            clear();
            System.out.print("\n  Kisi adi, soyadi : ");
            String ad = input.nextLine();

            iterator.setKisi_adi(ad);
            iterator.count += 1;

            iterator.setTel(new Telefon());
            iterator_tel = iterator.getTel();

            j = 1;

            while(true){

                clear();
                System.out.print("\n  Kisi adi, soyadi : " + ad);
                iterator.setTel_adet(j);


                System.out.print("\n\n    Tel turu : ");
                iterator_tel.setTel_turu(input.nextLine());

                System.out.print("\n    Tel no : ");
                iterator_tel.setTel_no(input.nextLine());

                System.out.print("\n\n     Telefon eklemeye devam etmek istiyormusunuz (E/e, H/h) : ");
                String sc = input.nextLine();

                if(sc.equals("H") || sc.equals("h")){
                    iterator_tel.setNext(null);
                    break;
                }

                else{

                    iterator_tel.setNext(new Telefon());

                    iterator_tel = iterator_tel.getNext();

                }

                j+=1;

            }

            System.out.print("\n\n     Kisi eklemeye devam etmek istiyormusunuz (E/e, H/h) : ");
            String sc = input.nextLine();

            if(sc.equals("H") || sc.equals("h")){
                iterator.setNext(null);
                break;
            }

            else{

                iterator.setNext(new Rehber());

                iterator = iterator.getNext();

            }

        }

        yazdir();
    }

    public static void yazdir(){

        clear();

        iterator = root;

        for(int i=0; i<root.count; i++){

            System.out.println("\n\n   "+(i+1)+".Kisi adi, soyadi : "+iterator.getKisi_adi());
            System.out.println("   "+(i+1)+".Kisi telefon adedi : "+iterator.getTel_adet());

            iterator_tel = iterator.getTel();
            for(int j=0; j<iterator.getTel_adet(); j++){

                System.out.println("\n      "+(j+1)+". Telefon turu : "+iterator_tel.getTel_turu());
                System.out.println("      "+(j+1)+". Telefon no : "+iterator_tel.getTel_no());

                iterator_tel = iterator_tel.getNext();

                if(iterator_tel==null){
                    break;
                }
            }

            iterator = iterator.getNext();

            if(iterator==null){
                break;
            }

        }

    }

    public static void clear(){
        for(int i=0; i<25;i++){
            System.out.println();
        }
    }

}
