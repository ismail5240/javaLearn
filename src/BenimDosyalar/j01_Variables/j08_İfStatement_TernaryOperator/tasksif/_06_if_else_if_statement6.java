package BenimDosyalar.j01_Variables.j08_İfStatement_TernaryOperator.tasksif;

import java.util.Scanner;

public class _06_if_else_if_statement6 {

    public static void main(String[] args) {

        /*      8. satırda int number oluşturulmuştur.
                Eğer int number 0 yazdırılırsa "Im neutral",
                Eğer int number 0'dan büyükse "I m positive",
                Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */

        // Scanner scan = new Scanner(System.in);

        // int number = scan.nextInt();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("Im neutral");
        } else if (number > 0) {
            System.out.println("I m positive");
        } else System.out.println("I am negative");









        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz:");
        int number = scan.nextInt();
        if (0 == number) {
            System.out.println("Im neutral");
        } else if (number > 0) {
            System.out.println("I m positive");
        } else System.out.println("I am negative");



         */
    }
}
