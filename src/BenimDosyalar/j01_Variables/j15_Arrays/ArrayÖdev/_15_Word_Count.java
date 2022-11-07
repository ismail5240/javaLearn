package BenimDosyalar.j01_Variables.j15_Arrays.ArrayÖdev;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */
String str="Removes white space from both ends of a string";
        String arr[]=str.split(" ");
        System.out.println("kelime sayısı ="+arr.length);


    }
}