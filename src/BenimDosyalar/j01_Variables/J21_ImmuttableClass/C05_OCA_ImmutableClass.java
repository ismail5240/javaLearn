package BenimDosyalar.j01_Variables.J21_ImmuttableClass;

import java.util.ArrayList;
import java.util.List;

public class C05_OCA_ImmutableClass {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        //list.add(7);  CTE verir

        for (String s : list) System.out.println(s);

    }

}
