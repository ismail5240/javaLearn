package BenimDosyalar.j01_Variables.j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_LambdaExpressionbenimClass {
    public static void main(String[] args) {


        List<Integer> sayi=new ArrayList<>(Arrays.asList(21,38,49,33,7,3,42,66,75,45,46,55,35,25,67,16));



    }//main sonu


    //Task : "Structured Programming" kullanarak list elemanlarını aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printStackTrace(List<Integer> sayi){

        for(Integer w:sayi){

            System.out.println(w+" ");
        }
    }
// Task:

    public  static  void  printElFunctions(List<Integer>sayi){

        sayi.// aksiyona girecek list coll
                stream().//List elemanlarını yukarıdan aşagıya akısa alır
                forEach((t)->System.out.println(t+" "));//
    }

    public static void yazdir(Integer integer) {
    }
}
