import java.util.Scanner;

public class Matematik {

    private double pi = Math.PI;

    public class Factorial{

        public void faktoryel(){

            Scanner input = new Scanner(System.in);

            System.out.println(" Bir sayi giriniz : ");
            int sayi = input.nextInt();
            double sayi_son = 1;

            for(int i=1; i<sayi+1; i++){

                sayi_son *= i;

            }
            System.out.println(" Faktoriyel : "+sayi_son);
        }

    }

    public class Asal{

        public boolean asalmi(int sayi){

            int i = 2;

            while(i<sayi){

                if(sayi%i==0){
                    return false;
                }

                i++;

            }

            return true;
        }

    }

    public class Alan{

        public class Daire_alan{

            public void daire_alan(int cap){

                System.out.println(" Daire alani : "+(cap*cap*pi));

            }

        }

        public void daire_alan(int cap){

            System.out.println(" Daire alani : "+(cap*cap*pi));

        }


    }

}
