package BenimDosyalar.j01_Variables.j08_İfStatement_TernaryOperator.tasksif;

import java.util.Scanner;

public class _18_if_else_statement_find_min {

    public static void main(String[] args) {

    /*    Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
          Bu numarayı yazdırınız.
          Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

          Örn: 10-11-12 > 10  */


        Scanner scan = new Scanner(System.in);
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        int i3 = scan.nextInt();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (i1 < i2 && i1 < i3) {
            System.out.println("en küçük sayı=" + i1);
        } else if (i2 < i1 && i2 < i3) {
            System.out.println("EN kÜçük Sayı = " + i2);
        } else if (i3 < i1 && i3 < i2) {
            System.out.println("En küçük sayı = " + i3);
        }
    }
}
