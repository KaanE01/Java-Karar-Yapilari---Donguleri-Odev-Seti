package com.mycompany.menu;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true; //flag oluşturduk ve şuan true

        while (flag) { //flag true olduğu sürece devam
            System.out.println( //çıktı çıkar
                    "- 1: Bir sayinin karesini hesapla.\n"
                    + "- 2: Bir sayinin kupunu hesapla.\n"
                    + "- 3: Bir sayinin tek veya cift oldugunu kontrol et.\n"
                    + "- 4: Bir sayinin pozitif, negatif veya sifir oldugunu belirle.\n"
                    + "- 5: Programdan cik.");

            int Secim = sc.nextInt(); //Secim değişkenine ata
            switch (Secim) {
                case 1: //birinci durumda 

                    System.out.println("bir sayi giriniz"); //çıktı çıkar
                    int n1 = sc.nextInt(); // n1 e ata
                    System.out.println("Girdiginiz sayinin karesi " + n1 * n1); //çıktı çıkar .çıktının içinde n1*n1 yaparak karesini bul
                    break; //kırılma noktası

                case 2: //ikinci durumda

                    System.out.println("bir sayi giriniz"); //çıktı çıkar
                    int n2 = sc.nextInt(); // n2 e ata
                    System.out.println("Girdiginiz sayinin kupu " + n2 * n2 * n2); //çıktı çıkar .çıktının içinde n2*n2*n2 yaparak karesini bul
                    break;//kırılma noktası

                case 3: //üçüncü durumda

                    System.out.println("Bir sayi giriniz");//çıktı çıkar
                    int n3 = sc.nextInt(); // n3 e ata
                    if (n3 % 2 == 0) { // ikiye kalansız bölünüyosa bu çıktıyı çıkar
                        System.out.println("Girdiginiz sayi cifttir");
                    } else { //değilse bu çıktıyı çıkar
                        System.out.println("Girdiginiz sayi tektir");
                    }

                    break; //kırılma noktası

                case 4: //dördüncü durumda

                    System.out.println("Bir sayi giriniz"); //sayı iste
                    int n4 = sc.nextInt(); //n4 de ata

                    if (n4 > 0) {
                        System.out.println("Girdiginiz sayi pozitiftir"); //0 dan büyükse pozitif yaz
                    } else if (n4 < 0) {
                        System.out.println("Girdiginiz sayi negatiftir");//0 dan küçükse negatif yaz
                    } else {
                        System.out.println("Girdiginiz sayi notur yani 0 dir"); //değilse 0 yaz
                    }
                     {

                    }

                    break; //kırılma noktası

                case 5: //beşinci durumda

                    System.out.println("Program kapatiliyor");      //çıktı çıkar               
                    flag = false; //bayrağı false yap
                    break; //kırılma noktası

                default:
                    System.out.println("yanlis kod girdiniz"); //hiç bir durum uymuyorsa bunu çıkar
            }

        }

    }
}
