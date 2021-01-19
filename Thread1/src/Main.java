public class Main {

    public static void main(String[] args){

        Thread printer1 = new Thread(new Printer("printer1"));
        Thread printer2 = new Thread(new Printer("printer2"));
        printer1.start();
        printer2.start();

        System.out.println("Main Thread son buldu.");

    }

}
