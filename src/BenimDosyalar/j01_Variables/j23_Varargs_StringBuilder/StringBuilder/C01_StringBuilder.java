package BenimDosyalar.j01_Variables.j23_Varargs_StringBuilder.StringBuilder;

import java.time.LocalTime;

public class C01_StringBuilder {
    public static void main(String[] args) {


        String str = "JavaCAN";
        System.out.println("method öncesi str : " + str);// JavaCAN

        strBirlestir(str);//str makyaja gitti

        System.out.println("method sonrası str : " + str);// JavaCAN ->immutable

        // task -> 50000 tekrarlı bir loop ile String ve StringBuilder obj run time surelerini karsılatırın

        String str1 = "";
        StringBuilder sb1 = new StringBuilder("");

        LocalTime str1basla = LocalTime.now();//str1 döngü baslama zamanı
        System.out.println("str1Time = " + str1basla);
        for (int i = 0; i < 50000; i++) {
            str1 += i;
        }
        LocalTime str1bitti = LocalTime.now();//str1 döngü bitis zamanı
        System.out.println("str1Time = " + str1bitti);


        LocalTime sb1basla = LocalTime.now();//sb1 döngü baslama zamanı
        System.out.println("sb1Time = " + sb1basla);
        for (int i = 0; i < 50000; i++) {
            sb1.append(i);
        }
        LocalTime sb1bitti = LocalTime.now();//sb1 döngü bitis zamanı
        System.out.println("sb1Time = " + sb1bitti);


    }//main sonu

    public static void strBirlestir(String str) {
        System.out.println(str + " agama selam olsun :) ");
    }
}
