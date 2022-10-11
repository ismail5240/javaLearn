package day1.Clarus_JavaPracticeFall.src.day04;

public class Q10_StringManipulation {


    // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

    public static void main(String[] args) {

        String a="Java ogrenmek123 Cok guzel@";
        System.out.println(a.replaceAll("\\d","").replace("@","").replace("C","c"));




    }
}
