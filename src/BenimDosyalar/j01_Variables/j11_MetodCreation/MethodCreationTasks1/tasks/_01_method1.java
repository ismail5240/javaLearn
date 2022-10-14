package BenimDosyalar.j01_Variables.j11_MetodCreation.MethodCreationTasks1.tasks;

import java.util.Scanner;

public class _01_method1 {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int max= sc.nextInt();
        System.out.println(randomNum(max));

    }//main sonu

    public static double randomNum(int max) {
        double maxi = Math.random() * max;
        return maxi;
    }
}
