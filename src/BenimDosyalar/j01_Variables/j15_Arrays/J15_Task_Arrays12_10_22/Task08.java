package BenimDosyalar.j01_Variables.j15_Arrays.J15_Task_Arrays12_10_22;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.


        Scanner sc = new Scanner(System.in);

        int num[] = new int[7];
        for (int i = 0; i <7 ; i++) {
            System.out.print("bir sayı giriniz: ");
            num[i] = sc.nextInt();
        }
        for (int i = 0; i <7 ; i++) {
            if (num[i] % 2 == 1) {
                System.out.print(num[i] + " ");
            }


        }
    }
}
