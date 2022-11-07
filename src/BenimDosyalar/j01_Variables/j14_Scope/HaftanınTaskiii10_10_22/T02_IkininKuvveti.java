package BenimDosyalar.j01_Variables.j14_Scope.HaftanınTaskiii10_10_22;

import java.util.Scanner;

public class T02_IkininKuvveti {

   public static void main(String[] args) {
       /*
        * Kullanicidan gelen datayi methodda parametre olarak alan
        * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
        */

       Scanner oku = new Scanner(System.in);
       int sayi, k = 0;
       System.out.println("sayi gir");
       sayi = oku.nextInt();

       while (sayi > 1) { //sayi birden küçük olana kadar içeresindeki işlemi yapacak

           if (sayi % 2 == 0) {
               k = 1;
           } else { //eğer kalan bir ise kuvveti değildir.
               k = 2;
               break; //cıksın sistemi yormasın tekrar tekrar
           }
           sayi = (sayi / 2);
       }
       if (1 == k) {
           System.out.println("Girilen sayı 2 nin 'KUVVETİ'");

       } else {
           System.out.println("Girilen sayı 2 nin kuvveti  'DEĞİL'");
       }


   }
    }












