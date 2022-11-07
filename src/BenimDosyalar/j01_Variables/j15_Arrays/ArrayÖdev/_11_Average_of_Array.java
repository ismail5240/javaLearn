package BenimDosyalar.j01_Variables.j15_Arrays.ArrayÖdev;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

        int arr[] = {12, 14, 21, 23, 10, 4};
        int toplm = 0;
        int ort = 0;

        for (int i = 0; i < arr.length; i++) {
            toplm += arr[i];
            ort = toplm / arr.length;
        }
        System.out.println("ortalama="+ort);
    }
}