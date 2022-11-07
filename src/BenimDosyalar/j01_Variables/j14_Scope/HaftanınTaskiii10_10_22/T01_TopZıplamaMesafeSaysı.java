package BenimDosyalar.j01_Variables.j14_Scope.HaftanınTaskiii10_10_22;

import java.util.Scanner;

public class T01_TopZıplamaMesafeSaysı {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Topu bıraktığınız yüksekliği giriniz: ");
        double yükseklik = sc.nextDouble();
        double zıplamayüksekliği=yükseklik;
        int zıplamasayısı=0;
        double toplamyol=yükseklik;

        while (true)

        if (zıplamayüksekliği>1){
            zıplamayüksekliği*=0.75;
            zıplamasayısı++;
            toplamyol+=zıplamayüksekliği*2;
        }else break;
        System.out.print("top"+ zıplamasayısı+" kere zıplamış ve "+toplamyol+" metre yol almıştır");

        System.out.println(" ");

                             //     2. çözüm

        Scanner input= new Scanner(System.in);
        System.out.print("Please enter a positive integer number : ");
        double num=input.nextDouble();
        System.out.println(PowersofTwo(num));
    }

    public static boolean PowersofTwo(double num) {
        while(num>2){
            num/=2;
        }
        return num%2==0||num==1;



    }




}

