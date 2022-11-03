package BenimDosyalar.j01_Variables.J17_ForEachLoop.ArrayListTasks18_10_22;

import java.util.ArrayList;

public class Denme {
    public static void main(String[] args) {

        ArrayList<Integer> asals = new ArrayList<Integer>();
        int a=20;
        int counter;
        for (int i=2; i<=a; i++) {
            counter=0;
            for (int j=2 ; j<i ; j++) {
                if (j!=i) {
                    if (i%j == 0){
                        counter++;
                        break;
                    }
                }
            }
            if(counter==0)asals.add(i);
        }
        System.out.println(asals);


    }
}
