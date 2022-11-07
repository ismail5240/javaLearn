package BenimDosyalar.j01_Variables.j15_Arrays.J15_Task_Arrays12_10_22;

import java.util.Arrays;
import java.util.Scanner;

public class Task_04_04 {
    public static void main(String[] args){
    /*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram kontrolu yapan  Java code create ediniz
			isAnagram("listen", "Silent") ==> true
		 */

    Scanner sc = new Scanner(System.in);

        System.out.println("bir string giriniz");
        String str1=sc.nextLine();

        System.out.println("bir string giriniz");
        String str2=sc.nextLine();

        String str1Arr[]=str1.split("");
        Arrays.sort(str1Arr);

        String str2Arr[]=str2.split("");
        Arrays.sort(str2Arr);
        System.out.println("girilen stringler anagram mıdır:"+Arrays.equals(str1Arr,str2Arr));

}
}