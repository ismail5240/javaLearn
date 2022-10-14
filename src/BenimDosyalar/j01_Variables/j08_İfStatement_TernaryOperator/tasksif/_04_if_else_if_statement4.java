package BenimDosyalar.j01_Variables.j08_İfStatement_TernaryOperator.tasksif;

import java.util.Scanner;

public class _04_if_else_if_statement4 {

    public static void main(String[] args) {

     /* double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */
/*
        double double1 = 1.375;
        double double2 = 2.876;

        if (double1 > double2) {
            System.out.println("double 1 is greater than double 2");
        }
        if (double1 < double2) {
            System.out.println("double 1 is smaller than double 2");
        }

 */
        Scanner input = new Scanner(System.in);
        System.out.println("double 1 sayı giriniz :");
        double double1 = input.nextDouble();
        System.out.println("double 2 sayısı giriniz :");
        double double2 = input.nextDouble();

        if (double1 > double2) {
            System.out.println("double 1 is greater than double 2");
        }
        if (double1 < double2) {
            System.out.println("double 1 is smaller than double 2");
        }




    }
}
