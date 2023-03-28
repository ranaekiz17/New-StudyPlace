import java.util.Scanner;

public class C05_ScannerSoru3 {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44


        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanicinin ismini, soyismini ve yasini giriniz" +
                          "\n ENTER a basiniz");

        char isimIlkHarf= scan.nextLine().charAt(0);

        String soyisim = scan.nextLine();

        int yas = scan.nextInt();

        System.out.println("girilen bilgiler :"  + isimIlkHarf + " " +soyisim + " " + yas);
    }

}
