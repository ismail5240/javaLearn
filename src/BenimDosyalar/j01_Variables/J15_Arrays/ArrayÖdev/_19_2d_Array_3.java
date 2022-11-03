package BenimDosyalar.j01_Variables.J15_Arrays.ArrayÖdev;

import java.util.Arrays;

public class _19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */

String arr[][]={{"new jersey","atlanta","ohio"},
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}};

        System.out.println(Arrays.deepToString(arr).replaceAll("ohio", "Florida"));

    }
}

