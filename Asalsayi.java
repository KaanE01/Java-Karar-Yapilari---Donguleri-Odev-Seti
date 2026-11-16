package asalsayi;

import java.util.Scanner;

public class Asalsayi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sayi giriniz");  //sayı istedik
        int n = sc.nextInt(); //girildi

        if (n < 2) { //yanlış sayı girişi engellendi
            System.out.println("sayi asal degil"); //çıktı çıkar
            return; //bitir
        }
        if (n == 2) { //ikiyi tuttuk
            System.out.println("sayi asal "); //çıktı çıkar
            return; //bitir
        }


        
        for (int i = 2; i < n; i++) { //i 1 er 1 er arttır 
            if (n % i == 0) { //her ne zaman i / n sıfıra eşitse çıktıyı çıkar
                System.out.println("Sayi asal degildir");
                break; //dur dur
            } else {
                System.out.println("Sayi asal"); //değilse bu çıktıyı çıkar
                break;
            }
        }

    }

}
