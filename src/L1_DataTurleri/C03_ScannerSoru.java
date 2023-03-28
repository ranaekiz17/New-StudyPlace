package L1_DataTurleri;

import java.util.Scanner;

public class C03_ScannerSoru {

    public static void main(String[] args) {

       // SORU3 - Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
       // Isminiz : John
       //  Soyisminiz : Doe
       //  Yasiniz : 44
       // Kaydiniz basariyla tamamlanmistir.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String isim = scan.nextLine();

        System.out.println("lutfen bir soyisim giriniz");
        String soyisim = scan.nextLine();

        System.out.println("Lutfen bir yas giriniz");
        int yas = scan.nextInt();


        System.out.println("Isminiz:"+ isim);
        System.out.println("Soyisminiz:" +soyisim);
        System.out.println("Yasiniz:" + yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir");


       /*
        System.out.println("Isminiz:" +isim +
                          "\nSoyisminiz:" + soyisim +
                            "\nYasiniz:" +yas +
                           "\nKaydiniz basariyla tamamlanmistir");

          alt alta yazdirir


        */

    }
}
