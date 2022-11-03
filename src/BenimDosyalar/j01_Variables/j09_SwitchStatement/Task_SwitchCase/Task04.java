package BenimDosyalar.j01_Variables.j09_SwitchStatement.Task_SwitchCase;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */

        Scanner sc = new Scanner(System.in);
        System.out.println("bir ay giriniz:");

        String ay= sc.next().toLowerCase();
        switch (ay) {
            case "ocak":
            case "mart":
            case "mayıs":
            case "temmuz":
            case "agustos ":
            case "ekim":
            case "aralık":
                System.out.println("girilen ay 31 gun içerir");
                break;

            case "nisan":
            case "haziran":
            case "eylül":
            case "kasım":
                System.out.println("girilen ay 30 gün içerir");
                break;

            case "şubat":
                System.out.println("yılınızı giriniz");
                int yıl = sc.nextInt();
                if ((yıl%4==0)&&(yıl%100!=0) ||(yıl%400==0)) {
                    System.out.println("girilen ay 29 gün içerir");}

                   else  {System.out.println("girilen ay 28 gün içerir");
                }break;

            default:
                System.out.println("hatalı giriş yaptınız");



        }


    }

}
