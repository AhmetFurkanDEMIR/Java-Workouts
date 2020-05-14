import java.util.Scanner;

public class main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        accont hesap1 = new accont("1441","ahmed demir","demir@demir.com","0550505050",1000);

        accont hesap2 = new accont();

        int miktar = 0;

        boolean kontrol = true;

        while (true){

            if(kontrol == false){
                scanner.nextLine();
            }

            kontrol = false;

            System.out.println(" ----------- Demir -----------");

            System.out.print(" 1-) Mevcut bakiye"+
                    "\n 2-) Genel bilgiler"+
                    "\n 3-) Para çek"+
                    "\n 4-) Para yatir"+
                    "\n Q-) çıkış"+
                    "\n Seçiminiz = ");

            String islem = scanner.nextLine();

            if(islem.equals("1")){
                System.out.println(" ----------- Demir -----------");
                System.out.println("      Mevcut bakiye = "+hesap1.getBakiye());
            }

            else if(islem.equals("2")){
                hesap1.yazdir();
            }

            else if(islem.equals("4")){

                System.out.println("      ----------- Demir -----------");

                System.out.print("\n      Yatırılacak miktar = ");

                miktar = scanner.nextInt();

                hesap1.parayatir(miktar);
            }

            else if(islem.equals("3")){

                System.out.println("      ----------- Demir -----------");

                System.out.print("\n      Çekilecek miktar = ");

                miktar = scanner.nextInt();

                hesap1.paracek(miktar);
            }

            else if(islem.equals("q") || islem.equals("Q")){
                break;
            }

            else{
                System.out.println(" Hatalı seçenek");
            }


        }


    }

}
