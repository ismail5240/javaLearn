package BenimDosyalar.j01_Variables.j15_Arrays.J15_Task_Arrays12_10_22;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz

        int arr[]= {3,5,6,1,9,45,25,4,9,0};

        sırala(arr);

    }

    private static void sırala(int[] a) {
        Arrays.sort(a);
        for (int i=a.length-1; i>0;i--){
            System.out.print(a[i]+" ");
        }
    }
}
