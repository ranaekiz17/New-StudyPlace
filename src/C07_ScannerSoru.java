import java.util.Scanner;

public class C07_ScannerSoru {

    public static void main(String[] args) {

        // Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz");

        double yaricap = scan.nextDouble();

        System.out.println("Cemberin cevresi: "+ 2 * 3.14);
        System.out.println("Dairenin alani:"  + 3.14 * yaricap * yaricap);


    }
}
