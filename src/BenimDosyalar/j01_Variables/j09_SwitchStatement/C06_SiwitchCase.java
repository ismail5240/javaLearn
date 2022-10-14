package BenimDosyalar.j01_Variables.j09_SwitchStatement;

import java.util.Scanner;

public class C06_SiwitchCase {
    public static void main(String[] args) {

        //  TASK--> Girilen haftanın gününü hafta içi veya sonun oldugunu print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("gün giriniz");

        String gün=sc.next();

        switch (gün) {
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":

                System.out.println("girilen gün hafta içine aittir...");
                break;

            case "cumartesi":
            case "pazar":

                System.out.println("girilen gün hafta sonuna aittir...");
                break;

            default:
                System.out.println("lütfen doğru giriş yapınız" );







        }








    }
}
