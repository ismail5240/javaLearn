package BenimDosyalar.j01_Variables.j15_Arrays.ArrayÖdev;

import java.util.Arrays;

public class _09_array_second_max {

    public static <sırala> void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */


        int arr[] = {15, 25, 22, 18,30};

        int EnByk = 0;

        for (int i = 0; i < arr.length; i++) {
            if (EnByk < arr[i]) {
                EnByk = arr[i];
            }
        }
        arr[Arrays.binarySearch(arr, EnByk)] = 0;
        int EnByk2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (EnByk2 < arr[i]) {
                EnByk2 = arr[i];
            }
        }
        System.out.println(EnByk2);
    }

}





