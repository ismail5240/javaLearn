package j03_ScannerClass_TypeCasting;

import java.util.Random;
import java.util.Scanner;

public class C01_ScannerClassjava {

    public static void main(String[] args) {

        // kullanıcıdan veri almak için üç adım takip edilir
        //1. adım--> scanner class'dan obj create edilir

        Scanner scan = new Scanner(System.in);//scanner classından scan isminde degerini System içinden alan bir obj

        //2 adım  kullanıcıda istenen veri için bildirimde bulunur -->sout("...");

        // System.out.println("adınızı giriniz :");

        //  3 adım kullanıcının girdiği veri data tipine göre bir variable atanır.

        // String isim =scan.nextLine();// kullanıcıdan gelen string tipinde isim verisi scan obj1ni nextline()metodu ile

        // System.out.println("isim ="+ isim);

        // Task -> Kullanıcının girdiği değere göre kare alanı ve cevresini hesaplayan bir code create ediniz...

        Scanner sc = new Scanner(System.in); //1. ADIM
        System.out.println("karenin bir kenarı:");// 2. adım
        int kenar = sc.nextInt();// 3. adım
        System.out.println("alan :" + (kenar * kenar) + " " + "çevre:" + (kenar * 4));









      /* Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
      Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
      1 seker = 1.7 gr
         Ornek : Input : cay sayisi : 10 seker sayisi :2
         Output : Yilda 12.41 kg seker kullaniyorsunuz

       */


        System.out.println("günlüki çtiğiniz çay sayısını giriniz:");//çay için 2. adım
        int çaySayısı = sc.nextInt();//çay için 3. adım
        System.out.println("şeker sayınızı giriniz:");// şeker için 2. adım
        int şeker = sc.nextInt();// şeker için 3. adım

        System.out.println("yıllık şeker tüketiminiz:" + (çaySayısı * şeker * 1.7 * 365 / 1000) + "kg");


        System.out.println("isminizi giriniz:");
        char ch = sc.nextLine().charAt(0);// kullanıcıdan gelen string ifadenin(0)index ,ilk karekterini alır
     System.out.println("isminizin ilk karekteri:" + ch);
     String isim=sc.nextLine();// kullanıcının girdiği tüm satırı isim e atar
     String ad=sc.next();// kullanıcının girdiği ilk ifadeyi ad'a atar
        System.out.println("isim = " + isim);
        System.out.println("ad = " + ad);


        // buraya herşey yazarsınız  System.out.println("isminizin ilk karekteri:" + ch);
     // buraya herşey yazarsınız  System.out.println("isminizin ilk karekteri:" + ch);
     // buraya herşey yazarsınız  System.out.println("isminizin ilk karekteri:" + ch);
     // buraya herşey yazarsınız  System.out.println("isminizin ilk karekteri:" + ch);


    }





















    }






