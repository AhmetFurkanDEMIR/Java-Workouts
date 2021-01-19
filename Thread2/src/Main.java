public class Main {

    public static void main(String[] args){

        Thread printer1 = new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Thread calisiyor.");

                for(int i=0; i<50;i++){
                    System.out.println("Thread1 : "+i);
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        printer1.start();

        new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Thread calisiyor.");

                for(int i=0; i<50;i++){
                    System.out.println("Thread2 : "+i);
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        System.out.println("Main Thread calisiyor..");
    }

}
