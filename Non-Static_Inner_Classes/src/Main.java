import java.util.Scanner;

public class Main {

    static public void main(String[] args){

        Matematik.Factorial fakt = new Matematik().new Factorial();
        Matematik.Asal asal = new Matematik().new Asal();
        Matematik.Alan alan = new Matematik().new Alan();
        Matematik.Alan.Daire_alan daire_alan1 = new Matematik().new Alan().new Daire_alan();


        Scanner input = new Scanner(System.in);

        System.out.println(" Sayi gir : ");
        int sayi = input.nextInt();

        if(asal.asalmi(sayi)){
            System.out.println("Asal sayi");
        }
        else{
            System.out.println("Sayi asal degil");
        }

        fakt.faktoryel();

        alan.daire_alan(sayi);

        daire_alan1.daire_alan(sayi);


    }

}
