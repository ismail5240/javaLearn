package j08_İfStatement_TernaryOperator;

public class C01_İfStatement {
    public static void main(String[] args) {

        int krmYas = 33;
        int ismlYas = 40;
        if (krmYas == ismlYas) {
            System.out.println("aynı yasdasınız güzel insanlar");
            System.out.println("yoksa siz ikiz misiniz ? ");
        }
        if (krmYas >= 40)
            System.out.println("krm bey olgunluk yaşındasınız");
        System.out.println("bu yazıyı okuduysanız 12. satırdaki if'den bagımsız");


        if (krmYas + ismlYas > 100) {
            System.out.println("kerm bey ve ismal bey yaşları toplamı 100 den buyuk");
        }
        System.out.println("selam javacanlar");
       /*
    Bagımsız if statement  yaoıları sadece kendi  scop(kapsamlarını ) run eder.
    Birden fazla bagımsız if statement  yapıları hepsinin body calışabilecegi gibi hiçbirisini body de çalışmayablir
     */


        //ctrl+alt+l-->code reformat java format











    }
}
