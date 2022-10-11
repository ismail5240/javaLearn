package j10_StringManipulations.j10_odev;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

Scanner sc=new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String str=sc.nextLine();
        System.out.println((str.contains("")?"Girdiğiniz cümle boşluk içeriyor:)":"Girdiğiniz kelime boşluk içermiyor:" ));

    }
}


