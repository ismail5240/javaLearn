package BenimDosyalar.j01_Variables.J17_ForEachLoop.ArrayListTasks18_10_22;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.asList;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {
        ArrayList<String> clist = new ArrayList<>(asList("New jersey", "New york", "Atlanta", "Florida", "Ohio"));
        System.out.println(clist);
        System.out.println(rotateList(clist));
    }

    private static ArrayList<String> rotateList(ArrayList<String> a) {

        ArrayList<String> terslist = new ArrayList<>();
        for (int i = a.size() - 1; i >= 0; i--) {
            terslist.add(a.get(i));
        }
        return terslist;
    }
}

