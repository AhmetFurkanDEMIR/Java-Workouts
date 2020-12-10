import java.util.Scanner;

public class Main {

    static public void main(String[] args){

        // pc müh.
        Imuhendis muhendis1 = new PcMuhendis(false, false);

        muhendis1.akerlik_sorgula();
        muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalama(3.99));

        String[] tecrube = {"vestel", "havelsan", "turksat"};

        muhendis1.is_tecrubesi(tecrube);

        System.out.println("\n\n");

        MakineMuhendisi muhendis2 = new MakineMuhendisi(true, false);

        String[] tecrube1 = {};

        String[] referans = {"Ahmet Furkan Demir", "Demir"};
        muhendis2.adli_sicil_sorgula();
        muhendis2.akerlik_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalama(3.5));
        muhendis2.is_tecrubesi(tecrube1);
        muhendis2.referans_getir(referans);
        muhendis2.calis();


    }

    public static void clear(){
        for(int i=0; i<25;i++){
            System.out.println();
        }
    }

}
