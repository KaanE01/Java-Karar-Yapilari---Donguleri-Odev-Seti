package faktoriyelhesaplama;

import java.util.Scanner;

public class FaktoriyelHesaplama {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long f = 1; //long kulanıyoz çünkü int küçük gelebilir

        System.out.println("Faktoriyel icin bir sayi giriniz"); //sayı istedik
        int n = sc.nextInt(); //sayı girdi

        if (n < 0) {
            System.out.println("negatif sayinin faktoriyeli olmaz"); //negatifler eledik
            return;
        }

        for (int i = 1; i <= n; i++) { //i yi bir bir arttır
            f *= i; //faktöriyel 'i' le kendisinin çarpımı 
        }
        System.out.println(n + " sayisinin faktoriyeli " + f); //çıktıyı çıkar

    }

}
