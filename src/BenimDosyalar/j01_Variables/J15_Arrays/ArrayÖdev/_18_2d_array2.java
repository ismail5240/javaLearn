package BenimDosyalar.j01_Variables.J15_Arrays.ArrayÖdev;

public class _18_2d_array2 {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.
         */

        int arr[][] = {{5, 2, 1}, {10, 2, 3, 6}, {1, 2}};
        int top =0;

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length;j++){
                top += arr[i][j];

            }

        }
        System.out.println(top);


    }
}