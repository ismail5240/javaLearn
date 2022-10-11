package j03_ScannerClass_TypeCasting.j03_TekrarScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ {
    public static void main(String[] args) {


        // Task -> Kullanıcının girdiği değere göre kare alanı ve cevresini hesaplayan bir code create ediniz...

        Scanner sc=new Scanner(System.in);
        System.out.println("karenin bir kenarını giriniz:");
        int kenar=sc.nextInt();
        System.out.println(" Kare Alanı= "+(kenar*kenar)+"\n karenin çevresi="+(kenar*4));



    }





}
