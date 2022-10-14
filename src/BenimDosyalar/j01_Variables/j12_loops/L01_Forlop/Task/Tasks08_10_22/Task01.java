package BenimDosyalar.j01_Variables.j12_loops.L01_Forlop.Task.Tasks08_10_22;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */

        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        for(int i = 1; i < sayi; i++)
        {
            toplam = toplam + i; // toplam += i;
        }
        System.out.println(sayi + " sayisina kadar olan sayiların toplamı = " + toplam);
    }

    }

