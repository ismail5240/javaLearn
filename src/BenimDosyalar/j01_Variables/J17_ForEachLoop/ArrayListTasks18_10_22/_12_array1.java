package BenimDosyalar.j01_Variables.J17_ForEachLoop.ArrayListTasks18_10_22;

import java.util.ArrayList;

public class _12_array1 {

    /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
    
    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1};

        System.out.println("dupicate(arr) = " + dupicate(arr));


    }

    private static boolean dupicate(int[] arr) {

        boolean flag = false;
        int sayac;
        for (int i : arr) {
            sayac = 0;
            for (int j : arr) {
                if (j == i) {
                    sayac++;
                }
                if (sayac > 1) {
                    flag = true;
                    break;

                }
            }

        }return flag;


    }
}