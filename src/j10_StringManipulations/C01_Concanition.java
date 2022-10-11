package j10_StringManipulations;

public class C01_Concanition {
    public static void main(String[] args) {


        /*
     concot()methodu-> içine (parametre) alddıgı string variable'ı çalıştıgı string sonuna ekler
     java'da işlemi yapılırken eger en az bir string variable varsa java toplama degil concart yapar
      */

        String name = " Nur ";

        String meslek = " Qa tester ";
        System.out.println(name.concat(meslek));//Nur Qa tester
        System.out.println(name);//Nur
     // ahan da TRICK-> String method'ları variable geciic değişklik yapar.
     // ama değişken atam ayağpılırsa kalıcı değişir
        name = meslek.concat(name);
        System.out.println("name = " + name);//name =  Qa tester  Nur

        System.out.println(name.concat(true + " :) "));// Qa tester  Nurtrue :)
        System.out.println(name.concat(100 + " :) "));// Qa tester  Nur 100 :)

        // TRICK-> concat methodu parametre olarak string type harici tüm dataları srtinge cevirip concat eder

    }


}



