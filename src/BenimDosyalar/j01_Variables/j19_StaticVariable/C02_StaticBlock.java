package BenimDosyalar.j01_Variables.j19_StaticVariable;

public class C02_StaticBlock {


      /*  public class C02_StaticBlock{
            static String isim = "ismail";
            static {
                System.out.println("1. static block başladı");
                isim = "Dilek";
                System.out.println("isim = " + isim);
            }
            static {
                System.out.println("2. static block başladı");
                isim = "uğur";
                System.out.println("isim = " + isim);
            }
        }

       */
 
    static String isim = "sefil haluk";//gns -> static var.

    static {//ilk çalışacak static block
        System.out.println("isim = " + isim);//sefil haluk
        System.out.println("agam 2. static block çalıştı :) ");
        isim = "UGUR JavaCAN";
        System.out.println("isim = " + isim);//UGUR JavaCAN

    }

    static {//2. çalışacak static block
        System.out.println("agam 1. static block çalıştı :) ");
        isim = "Dilek Hanım";
        System.out.println("isim = " + isim);//Dilek Hanım

    }

    public static void main(String[] args) {//main bası
        System.out.println("main method başladı :) ");
        isim = "Kerim Bey";
        System.out.println("isim = " + isim);
        System.out.println("main method bitti :( ");//Kerim Bey
    }//main sonu

    }

