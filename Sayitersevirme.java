package sayitersevirme;

import java.util.Scanner;

class Sayitersevirme {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 0; //daha sonra değişken atamak için şimdiden etkisiz 

        System.out.println("sayi giriniz"); //sayı istedik
        int n = sc.nextInt(); //girdi

        while (n > 0) { //o dan büyükse devam
            x = n % 10; //10 a bölünce kalanı x e ata
            System.out.print(x); //kalanı yan yana çıktı çıkar
            n = n / 10; // 10 kalansız bölerek son son basamağa sil
        } 

    }
}
