package basamakbulma;

import java.util.Scanner;

public class BasamakBulma {

    public static void main(String[] args) {

        int x = 0; //bir basamak değişkeni oluşturduk ona etkisiz eleman atadık

        Scanner sc = new Scanner(System.in);

        System.out.println("bir sayi giriniz"); //sayı istedik
        int n = sc.nextInt(); //girdi

        if (n == 0) { //0 sa direk bir dedik
            System.out.println("1 basamakli");
        }

        if (n < 0) { // eksi bir değerse pozitif yaptık
            n = n * -1;
        }

        for (int i = 1; i < n; i = i * 10) { //n ye kadar 10 ar 10 ar arttır
            x = x + 1; //her seferinde de x se 1 ekle
        }

        System.out.println("sayi " + x + " basamakli"); //çıktıyı çıkar

    }

}
