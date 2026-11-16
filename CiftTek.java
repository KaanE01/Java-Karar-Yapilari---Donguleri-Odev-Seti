package cifttek;

import java.util.Scanner;

public class CiftTek {

    public static void main(String[] args) {

        int csk = 0; //çiftleri orda toplamak için başlangıçta değeri olmayan bir değer atadık

        int tsk = 0; //tekleri orda toplamak için başlangıçta değeri olmayan bir değer atadık

        Scanner sc = new Scanner(System.in);

        System.out.println("sayi giriniz,Lutfen"); //sayı istedik
        int n = sc.nextInt(); //sayı girdi

        for (int i = 1; i < n; i++) { //bir bir n ye kadar arttır

            if (i % 2 == 0) { //kalan 0 ra eşitse cift sayi kutusunda topla
                csk = csk + i;

            } else {
                tsk = tsk + i;//değilse tek sayi kutusunda topla
            }
        }
        System.out.println("1'den n'ye kadar olan tek sayilarin toplami " + tsk + " cift sayilarin toplami " + csk); //çıktıyı çıkar

        //bu kodda 1 de toplananların içindedir birin olmadığı sonuç isterseniz tsk-1 veya ifteki başlangıç değerini 2 yapabilirsiniz
    }

}
