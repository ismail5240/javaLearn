package BenimDosyalar.j01_Variables.j08_İfStatement_TernaryOperator.tasksif;

import java.util.Scanner;

public class _17_if_else_if_statement_find_max {

    public static void main(String[] args) {

      /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */

        //Scanner sc = new Scanner(System.in);
        //int i1 = sc.nextInt();
        //int i2 = sc.nextInt();
        //int i3 = sc.nextInt();
        ////Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        Scanner sc = new Scanner(System.in);


        int i1 = sc.nextInt();// 1  3  2  1
        int i2 = sc.nextInt();//2   2   3  3
        int i3 = sc.nextInt();//3    1  1  2

        if (i1 > i2 && i1 > i3) {
            System.out.println("en büyük sayı=" + i1);
        } else if (i2 > i1 && i2 > i3) {
            System.out.println("EN büyük Sayı = " + i2);
        } else
            System.out.println("En büyük sayı = " + i3);

    }
}
