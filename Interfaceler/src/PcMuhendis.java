
public class PcMuhendis implements Imuhendis{

    private boolean askerlik;
    private boolean adli_sicil;

    public PcMuhendis(boolean askerlik, boolean adli_sicil){

        this.setAdli_sicil(adli_sicil);
        this.setAskerlik(askerlik);

    }

    @Override
    public void akerlik_sorgula() {

        if(isAskerlik()){
            System.out.println("Askerlik yapıldı");
        }

        else{
            System.out.println("Askerlik henüz yapilmadi");
        }

    }

    @Override
    public String mezuniyet_ortalama(double derece) {

        return "Ortalamam " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {

        if(isAdli_sicil()){
            System.out.println("Adli sicil kaydi var");
        }

        else{
            System.out.println("Herhangi bir sicil kaydı yok");
        }
    }

    @Override
    public void is_tecrubesi(String[] array) {

        System.out.println("Bilgisayar müh. olarak şu şirketlerle calistim...");

        for(int i=0; i<array.length; i++){

            System.out.println(i+". Sirket : "+array[i]);

        }

    }

    public boolean isAskerlik() {
        return askerlik;
    }

    public void setAskerlik(boolean askerlik) {
        this.askerlik = askerlik;
    }

    public boolean isAdli_sicil() {
        return adli_sicil;
    }

    public void setAdli_sicil(boolean adli_sicil) {
        this.adli_sicil = adli_sicil;
    }
}
