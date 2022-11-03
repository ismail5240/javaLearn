package BenimDosyalar.j01_Variables.J19_StaticVariable;

public class C01_Ogrtmn {

    //fields
    String isim;//inst. var.
    int tecrube;//inst. var.
    static String okul;

    public C01_Ogrtmn(String isim, int tecrube) {//full p'li cons.
        this.isim = isim;
        this.tecrube = tecrube;
    }

    public static void maasHesapla() {//static method
        System.out.println("agam helal hoş olsun afiyetle maaası harca :)");
    }
    public  void evlilikYıldonumu(){//non-static method
        System.out.println("agam bir yastıkta en az 40 yıl :)");
    }
}
