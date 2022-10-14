package BenimDosyalar.j01_Variables.j09_SwitchStatement_j;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz = ");
        int sayi = sc.nextInt();

        switch ((sayi / 10) %10){
            case 0:
            System.out.println("girdiğiniz sayının onlar basamagı  dır");
            break;
            case 1:
            case -1:
                System.out.println("Girdiğiniz sayının onlar basamağı \"BİR\" dir.");
                break;
            case 2:
            case -2:
                System.out.println("Girdiğiniz sayının onlar basamağı \"İKİ\" dir.");
                break;
            case 3:
            case-3:
                System.out.println("Girdiğiniz sayının onlar basamağı \"ÜÇ\" tür.");
                break;
            case 4:
            case-4:
                System.out.println("Girdiğiniz sayının onlar basamağı \"DÖRT\" tür.");
                break;
            case 5:
            case -5:
                System.out.println("Girdiğiniz sayının onlar basamağı \"BEŞ\" dir.");
                break;
            case 6:
            case -6:
                System.out.println("Girdiğiniz sayının onlar basamağı \"ALTI\" dır.");
                break;
            case 7:
            case -7:
                System.out.println("Girdiğiniz sayının onlar basamağı \"YEDİ\" dir.");
                break;
            case 8:
            case -8:
                System.out.println("Girdiğiniz sayının onlar basamağı \"SEKİZ\" dir.");// "SEKİZ"
                break;
            case 9:
            case -9:
                System.out.println("Girdiğiniz sayının onlar basamağı \"DOKUZ\" dur.");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");


        }








        }




    }

