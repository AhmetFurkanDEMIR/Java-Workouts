public class main {

    public static void main(String[] args){

        Motor motor = new Motor("1515897",4,600,"Konya");
        Gövde gövde = new Gövde(4,2,5);
        Ic_alan ic_alan = new Ic_alan(5,600,1);

        Iskelet iskelet = new Iskelet(motor, gövde, ic_alan);


        System.out.println("Arabanın kapı sayısı : " + iskelet.getGövde().getKapi_sayisi());
        System.out.println("Arabanın koltuk sayisi : " + iskelet.getIc_alan().getKoltuk_sayisi());

    }


}
