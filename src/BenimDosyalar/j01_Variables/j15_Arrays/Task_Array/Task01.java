package BenimDosyalar.j01_Variables.j15_Arrays.Task_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        // Task--> kullanıcıdan alınan degerlerle bi int array elemanlarını
        // büyükten küçüge prınt eden code create ediniz


        Scanner sc = new Scanner(System.in);
        System.out.println("kaç elemanlı array istiyorsun");
        int arrBoyut = sc.nextInt();

        int arr[]=new int[arrBoyut];

        for (int i=0; i<arrBoyut; i++){
            System.out.println(i+". index elemanı giriniz:");
        arr[i]=sc.nextInt();
        }
        System.out.println("istedigin array:"+ Arrays.toString(arr));
        Arrays.sort(arr);
        for (int i=arr.length-1;i>=0; i--){
            System.out.print(arr[i] +"  ");
        }

    }
}
