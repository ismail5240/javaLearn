package BenimDosyalar.j01_Variables.j02_DataTyps_wrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {

        String ad="ismail",soyad="topdas",yass="37";

        int a=7;
        int b=11;
        // birden çok string veriable ile farklı data type variable'ler + ile işleme alınırsa
        // java birleştirme yeni bir string oluşturur

        System.out.println(ad+soyad+a+b);
        System.out.println(a+ad+soyad+b);
        System.out.println(a+b+ad+soyad);
        System.out.println(" "+a+b);
        System.out.println((a+b)+ad+soyad);
        System.out.println(ad+(a-b)+(a-b));
        System.out.println(ad+((a-b)+(a-b)));

char ch='1';
        System.out.println(ad+ch);
        System.out.println(a+ch+ad);
        System.out.println(ad+(ch+b));
        System.out.println(a+ad+ch);

        /*
        Trıck--> char data turu işleme girdiği variables 'in turune göre farklı işlem yapar
        eger işleme girdiği variables aritmatik b,ir işlemse ASCII degeriile işlem yapar
         */



    }
}
