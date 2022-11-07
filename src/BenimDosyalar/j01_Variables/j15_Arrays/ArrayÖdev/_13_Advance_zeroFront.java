package BenimDosyalar.j01_Variables.j15_Arrays.ArrayÖdev;

import java.util.Arrays;

public class _13_Advance_zeroFront {

    public static void main(String[] args) {

      /*

   Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması
   için yeniden düzenlenmiş bir Array döndürün.
   Sıfır olmayan sayıların sırası önemli değildir.
   Böylece {1, 0, 0, 1} {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.

   Bu şekilde bir Array oluşturunuz: 1,0,0,1,0
   Sonuç böyle olmalı :  0,0,0,1,1

       */
        int arr[] = {0, 3, 5, 0, 6, 9, 0, 15, 96, 78, 34, 25, 0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}