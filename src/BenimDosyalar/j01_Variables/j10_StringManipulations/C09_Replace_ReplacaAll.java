package BenimDosyalar.j01_Variables.j10_StringManipulations;

public class C09_Replace_ReplacaAll {
    public static void main(String[] args) {


/** replace()
 * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini (update -set) saglar. Sonuc String'dir..
 *

 */


        String str = "javaCAN'lara selam olsun java ile bolcana offer";
        System.out.println(str.replace('a', '@'));


// replaceAll() method u replace() methoduna benzer ama 2 fark vardır
//1-replace() methodu char kabul eder ama replaceAll kabul etmez
//2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)

//(Regular Expressions)
//   \\s bosluk (
//   \\S bosluk disindaki tum karakterler
//   \\w harfler ve rakamlar (a z A Z, 0 9)
//   \\W harfler ve rakamlar disindaki tum karakterler
//   \\d rakamlar 0 9
//   \\D rakamlar disindaki tum karakterler

        str = "javaCAN'lara selam olsun :)java ile 123455544 offer ***     ";
        System.out.println(str.replaceAll("\\s", "+"));
        System.out.println(str.replaceAll("\\s", "+"));
        System.out.println(str.replaceAll("\\s", "+"));
        System.out.println(str.replaceAll("\\s", "+"));
        System.out.println(str.replaceAll("\\s", "+"));
        System.out.println(str.replaceAll("\\s", "+"));


        //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki formatta print eden code create ediniz.
// isim-soyisim : M***** B*******
// kart no : **** **** **** 1234

        String isim = "Çiğdem";
        String soyad = "Şen";
        String kartNo = "1234567890123456";
        String yeniİsim = isim.charAt(0) + isim.substring(1).replaceAll("\\w", "*");
        String yenisoyİsim = soyad.charAt(0) + soyad.substring(1).replaceAll("\\w", "*");
        String yeniKartNo = "**** **** **** ****" + kartNo.substring(12);
        System.out.println("isim-soyad:"+yeniİsim+yenisoyİsim+"kart no:"+yeniKartNo);

    }
}
