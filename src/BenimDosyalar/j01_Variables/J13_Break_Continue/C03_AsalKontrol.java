package BenimDosyalar.j01_Variables.J13_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {

         //task-->girilen tamsayının asal olmasını kontrol eden code create ediniz
        // asal tamsayı:1 ve kendisinden başka tam böleni olmayan sayılar -->asil bölünemeyen sayı

        Scanner sc=new Scanner(System.in);
        System.out.println("bir tamsayı girermisiniz");
        int sayi=sc.nextInt();

        boolean asalMı=true;
        for (int i =2; i<sayi; i++) {
            if (sayi % i == 0) {
                asalMı = false;
                break;
            }
        }
            if (asalMı&&sayi!=1){
                System.out.println("girilen sayı ASAL");
            }else System.out.println("Girilen sayı ASAL DEĞİL");

        }

    }

