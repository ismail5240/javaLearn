package j10_StringManipulations.j10_Tekrar_StringManipulations;

import java.util.Scanner;

public class C06_TekrarSubstring {
    public static void main(String[] args) {

        String str="java bilen sırtı yere gelmez :)";
        System.out.println(str.substring(10));
        // tr dosyasının son 10 karekterini print ediniz
        System.out.println(str.substring(str.length() - 10));
        // tr dosyasının son 10 karekterini print ediniz
        System.out.println(str.substring(0, 10));
        //TASK->girilen 4 harfli kelimeyi tersten print eden code create edininiz

        Scanner sc=new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz");
        String kelime=sc.next();
        if(kelime.length()!=4){
            System.out.println("4 harfli bir kelime girmeniz lazım ...");
        }else{
            System.out.print(kelime.substring(kelime.length() - 1));
            System.out.print(kelime.substring(2,3));
            System.out.print(kelime.substring(1,2) );
            System.out.print(kelime.substring(0,1) );
        }

    }
}
