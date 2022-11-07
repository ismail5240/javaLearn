package BenimDosyalar.j01_Variables.j15_Arrays.ArrayÖdev;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */
        String arr1[] = {"Apple , Orange , Banana , Pineapple" };
        boolean flag = true;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].equals("Apple")) {
                System.out.println(true);
            } else System.out.println(false);
            ;//true

        }
    }
}
