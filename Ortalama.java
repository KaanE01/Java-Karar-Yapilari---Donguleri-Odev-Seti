package com.mycompany.ortalama;

import java.util.Scanner;

public class Ortalama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float tk = 0; //kutu oluşturduk ve etkisiz eleman atadık

        for (int i = 1; i <= 10; i++) { // 10 kez tekrarla dedik

            System.out.println("lutfen " + i + ". sayiyi giriniz"); // her defasında çıktıyı çıkar
            int n = sc.nextInt(); //sayı girdi
            tk = tk + n; //sayıyı toplam kutusunda topladık

        }
        float ort = tk / 10; //ortalama değerini oluşturduk
        System.out.println("Girdiginiz sayilarin ortalamasi " + ort); //çıktı çıkar

    }

}
