package BenimDosyalar.j01_Variables.j10_StringManipulations.j10_odev;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */
        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime=sc.nextLine();
        System.out.println((kelime.substring(kelime.length()/2)));

        }

    }

