import java.util.Scanner;

public class C06_ScannerSoru {

    public static void main(String[] args) {

       // Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
       // girilen bilgiler : J Doe, 44


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isim giriniz");
        String isim = scan.nextLine();

        System.out.println("Lutfen soyisim giriniz");
        String soyisim = scan.nextLine();

        System.out.println("Lutfen yas giriniz");
        int yas = scan.nextInt();

        System.out.print("Girilen isim: "  + isim +
                          "Girilen soyisim: " + soyisim +
                          "Girilen yas: " + yas);


    }
}
