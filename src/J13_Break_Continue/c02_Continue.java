package J13_Break_Continue;

import java.util.Scanner;

public class c02_Continue {
    public static void main(String[] args) {


/*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop'un bir sonraki değerinden devam eder.

 */

// Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("mail hesabı gir");

        String mail=sc.nextLine();

        for (int i=0; i<mail.length(); i++){
            char ch=mail.charAt(i);
            if (ch==' '){
                continue;
            }
            System.out.print(ch);
        }


    }
}
