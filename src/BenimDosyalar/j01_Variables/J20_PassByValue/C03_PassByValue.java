package BenimDosyalar.j01_Variables.J20_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {

  /*
        java non-primitive(Class array list-> refrans ) data turlerinde obj kemdisi değil de dataları geğişirse
        obj referans ve kendisi değişmediği dataları değişikliğini kalıcı yapar.
         */
        // Task -> lis elemanları 24,20,87 iki farklı method ile list elemanlarını
        //      update dip print code create ediniz.
        //1. method-> with for each 2. method-> set(index,value)

        List<Integer> a = new ArrayList<>(Arrays.asList(24, 20, 87));
        System.out.println("method öncesi list = " + a);//[24, 20, 87]

        listUpdate1(a);//
        listUpdate2(a);//


        System.out.println("method sonrası list = " + a);//[48, 40, 174]-> Pass By referans


    }//main sonu


    public static void listUpdate1(List<Integer> a) {

        for (Integer v : a) {
            v *= 2;

        }System.out.println("36. satır:" + a);
    }

    public static void listUpdate2(List<Integer> a) {

        for (int i = 0; i < a.size(); i++) {
            a.set(i, a.get(i) * 2);

        }
        System.out.println("list = " + a);

    }
}
