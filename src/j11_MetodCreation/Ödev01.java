package j11_MetodCreation;

import java.util.Scanner;

public class Ödev01 {

    static Scanner sc = new Scanner(System.in);
    static String cevap;
    static String puan1;
    static String puan2;


    public static void main(String[] args) {

        /* Iki kisinin oynayacagi bir kelime oyunu uretelim
         * Kurallar
         * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
         *
         * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
         *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
         *        ve 3.adima gecin
         *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
         *        kazandigini yazip oyunu bitirin
         *
         * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
         *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
         *          basa mi sona mi ekleyecegini sorun
         *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
         *
         *      *   Devam etmek istemezse
         *          "Oyun bitti" yazin
         *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
         */
        System.out.println("oyuncu 1 isim giriniz:");
        String oyuncu1 = sc.nextLine();

        System.out.println("oyuncu 2 isim giriniz:");
        String oyuncu2 = sc.nextLine();


        System.out.println(" oyuncu 1 lütfen bir kelime giriniz:");
        String kelime = sc.nextLine();
        System.out.println("girilen kelimeyi kabul ediyormusunuz E/H ?");
        String cevap = sc.nextLine().toUpperCase();
        int puan1 = 0;
        int puan2 = 0;
        if (cevap.equals("E")) {
            System.out.println("puanınız=" + (puan1 += kelime.length()));

        } else if (cevap.equals("H")) {

            System.out.println("kaybettiniz");
        } else{ System.out.println("gecersiz kelime");}


        karar();


    }//main dışı

    public static void karar() {
        System.out.println("oyuna devam etmek istiyormusunuz E/H");
        String cevap = sc.nextLine().toUpperCase();

        if (cevap.equals("E")) {
            System.out.println("oyuncu 2 Bir kelime giriniz");
            String kelime2 = sc.nextLine();
            String kelime = sc.nextLine();
            System.out.println("birönceki kelimenin basına mı sonuna mı eklensin b/s");
            String cevap2 = sc.nextLine();
            if (cevap2.equals("b")) {
                System.out.println(kelime2 + kelime);


            } else if (cevap.equals("s")) {
                System.out.println(kelime + kelime2);
            } else System.out.println("yanlıs giriş yaptınız");
        } else if (cevap.equals("H")) {
            System.out.println("oyununuz sonlandı" + "\n1. oyuncu puanı:" + puan1 + "\n2. oyuncu puanı:" + puan2);

        }
    }}
