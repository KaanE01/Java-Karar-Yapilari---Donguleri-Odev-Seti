package rastgelegardaş;

import java.util.Scanner;

public class RastgeleGardaş {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 628471; //sayı değişkeni atadık
        boolean flag = true; //bayrağa true değeri atadık
        
        System.out.print("Tuttugum sayi 1-1000000 arasindadir."); //çıktı çıkar
        
        while (flag) {
            
            System.out.println("Sayiyi tahmin ediniz."); //çıktı çıkar
            int d = sc.nextInt();
            if (d < n) {
                System.out.print("Bu sayi aradiginiza gore kucuk."); //küçükse çıktı çıkar
            } else if (d > n) {
                System.out.print("Bu sayi aradiginiza gore buyuk."); //büyükse bu çıktıyı çıkar
            } else {
                System.out.println("Tebrikler sayiyi buldunuz sayi=" + n); //hiçbiri değilse bu çıktıyı çıkar 
                flag = false; //bayrağa false değişkeni ata ve while döngüsünden çık

            }

        }

    }
}
