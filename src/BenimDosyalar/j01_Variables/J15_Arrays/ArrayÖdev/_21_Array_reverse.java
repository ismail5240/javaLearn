package BenimDosyalar.j01_Variables.J15_Arrays.ArrayÖdev;

import java.util.Scanner;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         *
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = sc.nextInt();

        String arr[]=

         */

        int a=123;
        String b[]=Integer.toString(a).split("");
        for (int i=b.length-1; i>=0; i--){
            System.out.print(b[i]);
        }

    }
}


