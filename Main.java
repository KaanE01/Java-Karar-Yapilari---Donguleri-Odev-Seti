package pkg1dennye;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("bir sayi giriniz"); //sayı iste 
        int n = sc.nextInt();               //sayı girildi

        for (int i = 1; i < n; i++) { //1 den n e kadar 1 ekleye ekleye git
            System.out.println(i); //her seferindede i yi çıktı çıkar
        }
    }

}
