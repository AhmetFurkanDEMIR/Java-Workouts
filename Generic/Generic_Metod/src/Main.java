public class Main {

    public static void main(String[] arg){

        Character[] char_dizi = {'J','A','V','A'};
        Integer[] integer_dizi = {1,2,3,4,5,6};

        String[] String_dizi = {"Java", "Python", "C++", "Php"};

        Ogrenci[] ogrenci_dizi = {new Ogrenci("ahmet"), new Ogrenci("mahmut"),new Ogrenci("murat")};

        yazdir(char_dizi);

        System.out.println("---");
        yazdir(integer_dizi);

        System.out.println("---");
        yazdir(String_dizi);

        System.out.println("---");
        yazdir(ogrenci_dizi);

    }

    public static <E> void yazdir(E[] data){

        for (E e: data) {

            System.out.println(e);

        }

    }

}
