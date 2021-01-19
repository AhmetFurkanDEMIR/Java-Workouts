public class Printer extends Thread {

    private String isim;

    public Printer(String ad){

        this.setIsim(ad);

    }

    public String getIsim() {
        return isim;
    }


    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {
        System.out.println(isim + " Isim calisiyor");

        for(int i=0; i<20;i++){
            System.out.println(isim+" Yaziyor .. : "+i);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(isim+" Isini bitirdi....");
    }

}
