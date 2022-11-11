package BenimDosyalar.j01_Variables.j29_Exception;

import java.util.Scanner;

public class Task_001 {

    public static void main(String[] args) {

        /*
Task -> Girilen password'un 6 karakterden az 10 karakterden fala olmamasını kontrol eden code create ediniz
 */

        Scanner sc=new Scanner(System.in);
        System.out.println("paswor girermisin");
        String password = sc.next();


        try {
            if (password.length()<6){
                throw new IllegalArgumentException("6 dan az karakter girdin ");

            } else if (password.length()>10) {
                throw  new IllegalArgumentException("10 karekterden fazla girdin");

            }else System.out.println("dogru pasword"+ password);



        }catch (IllegalArgumentException e){
            System.out.println(e);
            System.out.println("selametle");
        }
        System.out.println("sorun handle edildi devammm ...");
    }
}
