package BenimDosyalar.j01_Variables.j17_ForEachLoop.ArrayListTasks18_10_22;

import java.util.ArrayList;
import java.util.List;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>(List.of(1,2,3,4,5));

        System.out.println(getSum(num));


    }

    private static Integer getSum(ArrayList<Integer> num ) {
        int toplam=0;
        for ( Integer a : num ) {
            toplam+=a;

        }
        return toplam;
    }
}
