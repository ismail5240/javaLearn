package BenimDosyalar.j01_Variables.J17_ForEachLoop.ArrayListTasks18_10_22;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
        int arr[] = {1, 2, -3, 4, -5, -6};

        syınınTersi(arr);
    }

    private static void syınınTersi(int[] arr) {

        for (int a : arr) {
            a *= -1;
            System.out.print(a + " ");




        }

    }

}
