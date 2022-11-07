package BenimDosyalar.j01_Variables.j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Arraylist {
    public static void main(String[] args) {

        int sayi = 33;// tek bir data saklayabilen variable
        int sayi1[] = new int[5];// 5 int deger saklayabilen  veriable

        ArrayList<Integer> listSayi = new ArrayList<Integer>();//boş inteer type list oluşturldu

        // 1. yol->add(); method
        System.out.println("listSayi = " + listSayi);//[]
        listSayi.add(10);//list ilk eleman olarak 10 değeri eklendi
        System.out.println("listSayi = " + listSayi);// [10]
        listSayi.add(39);
        listSayi.add(72);
        listSayi.add(61);
        listSayi.add(41);
        listSayi.add(41);//list eleman tekrarını kabul eder
        System.out.println("listSayi = " + listSayi);// [10, 39, 72, 61, 41, 41]

        // 2.yol -> Arrays.asList(); method
        ArrayList<String> listIsim=new ArrayList<>(Arrays.asList("Muharrem","Nur","Enise","Fatih"));// [Muharrem, Nur, Enise, Fatih]
        System.out.println("listIsim = " + listIsim);

        //3. yol -> List.of(); method
        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere","isvec"));
        listSayi.add(2,14);//listde index 2 'ye 14 değerini eklendi 2. idexdeki eski eleman bir index ileri kaydırıldı
        System.out.println("listSayi = " + listSayi);//[10, 39, 14, 72, 61, 41, 41]





    }
}
