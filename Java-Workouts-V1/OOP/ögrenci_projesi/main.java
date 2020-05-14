import java.util.Scanner;

public class main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        student ogrenci1 = new student();

        System.out.print(" ogrenci adi = ");

        ogrenci1.setOgrenci_adi(scanner.nextLine());

        System.out.print("\n ogrenci soyadi = ");

        ogrenci1.setOgrenci_soyadi(scanner.nextLine());

        System.out.print("\n ogrenci yas = ");

        ogrenci1.setYas(scanner.nextInt());

        System.out.print("\n ogreci t.c = ");

        ogrenci1.setTc_no(scanner.nextDouble());

        System.out.print("\n ogrenci okul no = ");

        ogrenci1.setOkul_no(scanner.nextInt());

        ogrenci1.yaz();

    }

}
