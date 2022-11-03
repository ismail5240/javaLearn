package BenimDosyalar.j01_Variables.J17_ForEachLoop.ArrayListTasks18_10_22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _11_prime_numbers {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {

        // 2. yol
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir pozitif tam sayı giriniz.");
        int sayı = sc.nextInt();
        int count = 0;

        for (int i = 2; i <= sayı; i++) {
            int j;
            for (j = 2; j < i; j++) {
                if (i % j == 0)
                    break;
            }
            if (i == j) {
                System.out.print(i + " ");
                count++;
            }
        }System.out.println("\ncount :"+count);



        int num = 20;
        System.out.println(asalsayı(num));


    }

    private static List<Integer> asalsayı(int a) {
        List<Integer> sonucu = new ArrayList<>();
        for (int i = 2; i < a; i++) {
            int sayac = 0;
            for (int j = 2; j < i; j++) {


                if (i % j == 0) {
                    sayac++;
                }
            }
            if (sayac == 0) {

                sonucu.add(i);
            }
        }
        return sonucu;
    }


}
