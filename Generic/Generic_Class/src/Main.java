public class Main {

    public static void main(String[] args){

        Character[] char_dizi = {'J','A','V','A'};
        Integer[] integer_dizi = {1,2,3,4,5,6};

        String[] String_dizi = {"Java", "Python", "C++", "Php"};

        Ogrenci[] ogrenci_dizi = {new Ogrenci("ahmet"), new Ogrenci("mahmut"),new Ogrenci("murat")};

        System.out.println("--");
        CharYazdir.yazdir(char_dizi);

        System.out.println("--");
        IntYazdir.yazdir(integer_dizi);

        System.out.println("--");
        StringYazdir.yazdir(String_dizi);

        System.out.println("--");
        OgrenciYazdir.yazdir(ogrenci_dizi);

        System.out.println("\n////////////////\n");

        GenericYazdir<Character> yazdir_Char = new GenericYazdir<Character>();
        yazdir_Char.yazdir(char_dizi);

        System.out.println("--");
        GenericYazdir<Integer> yazdir_int = new GenericYazdir<Integer>();
        yazdir_int.yazdir(integer_dizi);

        System.out.println("--");
        GenericYazdir<String> yazdir_String = new GenericYazdir<String>();
        yazdir_String.yazdir(String_dizi);

        System.out.println("--");
        GenericYazdir<Ogrenci> yazdir_ogr = new GenericYazdir<Ogrenci>();
        yazdir_ogr.yazdir(ogrenci_dizi);
    }

}
