package L1_DataTurleri;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");

        int girilenSayi = scan.nextInt();

        System.out.println("Girilen sayinin karesi :"  + girilenSayi*girilenSayi);



    }
}
