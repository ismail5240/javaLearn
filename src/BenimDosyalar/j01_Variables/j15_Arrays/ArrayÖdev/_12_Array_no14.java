package BenimDosyalar.j01_Variables.j15_Arrays.ArrayÖdev;

import java.util.Arrays;

public class _12_Array_no14 {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
         */

int arr[]={3,5,6,9,13,65,};
if (Arrays.toString(arr).contains("4")&&Arrays.toString(arr).contains("1")){
    System.out.println(false);
}else{
    System.out.println(true);
}


    }
}