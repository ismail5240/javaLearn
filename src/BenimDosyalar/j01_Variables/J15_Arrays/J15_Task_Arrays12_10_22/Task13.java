package BenimDosyalar.j01_Variables.J15_Arrays.J15_Task_Arrays12_10_22;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];
        for (int i = 0; i <8 ; i++) {
            System.out.print("bir sayı giriniz: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("üçün katı olan sayılar:");
        for (int i = 0; i <7 ; i++) {
            if (arr[i] % 3 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

}
