package carpimtablosi;

import java.util.Scanner;

public class CarpimTablosi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bir sayi giriniz,Lutfen"); // sayı istedik
        int n = sc.nextInt(); //girdi

        for (int i = 1; i <= 10; i++) { // i yi herseferde bir arttır
            System.out.println(n + " sayisinin " + i + " sayisi ile carpimi " + i * n); // her seferinde de bu çıktıyı çıkar çıktının içindede sayı * n yap
        }

    }

}
