package BenimDosyalar.j01_Variables.j17_ForEachLoop.ArrayListTasks18_10_22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {
        ArrayList<Integer>num= new ArrayList<>(List.of(5,3,4,6,7,8,1,12));
        secondMax(num);

    }private static void secondMax(ArrayList<Integer> num) {
        Collections.sort(num);
        System.out.println(num.get(num.size() - 2));
    }
}

