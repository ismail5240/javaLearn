package BenimDosyalar.j01_Variables.j15_Arrays.ArrayÖdev;

import java.util.Arrays;

public class _20_Arrayboth_Ends {

    public static void main(String[] args) {

     /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */
        int arr[] = {1, 2, 3, 4};
        int arr1[]={arr[0],arr[arr.length-1]};
        System.out.println(Arrays.toString(arr1));

    }
}