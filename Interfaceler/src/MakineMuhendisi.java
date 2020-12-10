public class MakineMuhendisi implements Imuhendis, Icalisma {

    private boolean askerlik;
    private boolean adli_sicil;

    @Override
    public void calis() {
        System.out.println("Makine muhendisi calisiyor...");
    }

    public MakineMuhendisi(boolean askerlik, boolean adli_sicil){

        this.setAskerlik(askerlik);
        this.setAdli_sicil(adli_sicil);

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

        if(array.length==0){
            System.out.println("Herhangi bir is tecrubem bulunmuyor");
        }

        else{
            System.out.println("Makine müh. olarak şu şirketlerle calistim...");

            for(int i=0; i<array.length; i++){

                System.out.println(i+". Sirket : "+array[i]);

            }
        }

    }

    public void referans_getir(String[] array){

        if(array.length==0){
            System.out.println("Herhangi bir referansım bulunmamaktadir");
        }

        else{

            System.out.println("Makine müh. olarak referanslarım...");

            for(int i=0; i<array.length; i++){

                System.out.println(i+". Referans : "+array[i]);

            }

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
