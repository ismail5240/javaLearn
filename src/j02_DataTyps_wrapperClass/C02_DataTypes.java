package j02_DataTyps_wrapperClass;

import java.sql.SQLOutput;

public class C02_DataTypes {
    public static void main(String[] args) {



/*
    Java'da  2 farkli data type vardir.
            1)Primitive Data Type (8 tane)
​
    a)boolean: Sadece True veya False değerlerini alabilir. sadece iki farkli deger alabildigi icin memory'de az(bir bit'lik) alan kaplar
​
    b)char :Tek character'li (S, ?, 3, * gibi her bir sembol) ifadeler icin char data type'i kullanilir.
    her bir char memory'de 16 bit'lik yer kaplar.char deger mutlaka tek tirnak icine konulmalıdilir.
    char değerler aritmetik islemler için charlarin ASCII ("American Standard Code for Information Interchange") Table'daki degerlerini alır.
            ​
    c)byte : -128'den +127 ye kadar tum tam sayi degerlerini alır.
    byte variable -> memory'de 8 bitlik alan kaplar.
            ​
    d)short : -32768'den 32767'ye kadar tum tam sayi degerlerini alır.
    short variable -> memory'de 16 bıt alan kaplar.
            ​
    e)int : -2,147,483,648'den 2,147,483,647'ye kadar tum tam sayi degerlerini alır.
    int variable -> memory'de 32 bit alan kaplar.
            ​
    f)long : -9,223,372,036,854,755,808'den 9,223,372,036,854,755,807'ye kadar tum tam sayi degerlerini alır.
    long variable -> memory'de 64 bit alan kaplar.
            ​
    g)float : ondalikli sayilar icin kullanilır.
    float variable -> memory'de 32 bit kullanir.
    float variable -> ondalik kisimlarinda en fazla 7 rakam barindirabilir.
            0.1234567
    Bir ondalikli sayinin float oldugunu belirlemek icin en sona(1.23f veya 1.23F) 'f' veya 'F' yazılmalıdır
    aksi halde variable double olarak tanımlanır.
​
        ​
    h)double : ondalikli sayilar icin kullanılır.
    double variable -> memory'de 64 bit kullanir.
    double variable -> ondalik kisimlarinda en fazla 16 rakam barindirabilirler.
            0.1234567890123456
            ​
            2)Non-Primitive Data Type
    String: Cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusan variable.
            */




/* ismail
JAVADA 2 FARKLI DATA TYPE VARDIR
1)Primitive Data Type ( 8 tane)

a)boolen: sadece Trve veya Folse değerlerini alabilir. sadece iki farklı değer alabildiği için
memory'de az

b)char : Tek character 'li (s,7,3, * gibi herbir senbol ) ifadeler için char data type' kullanılır
her bir char memeory'de 16 bit'lik yer kaplar .char değer mutlka tek tırnak içine konulmalıdır
char degerler aritmetik işlemler için charların ASCII ("American Standard code for ınformation ınterchange") Table'deki değerlerini alır

c)byte : -128'den +127 ye kadar tüm sayı değerlerini alır .
byt veriable -->memory'de 8 bitlik alan kaplar

d)short : -32768' den 32767'ye kadar tüm tam syı değerlerini alır .
short variable--> memory'de 16 bit'lik alan kaplar

e)int . -2,147,483,648'den 2,147,483,647'ye kadar tüm tamsayı değerlerini alır
int veriable -->memory'de 32 bit'lik alan kaplar

f)long:-9,223,372,036,854,755,808'den 9,223,372,036,854,755,807'ye kadar tüm tamsayı değerlerini alır
long veriable -->memoriy'de 64 bit alan kaplar

g)float : ondalıklı sayılar için kullanılır
 */


     String name="özgür";
     String yas="13";
     int age=34;
     int yıl=2022;
     boolean emeklimi=true;
     boolean itci=false;
     char ch='$';
     char hrf='A';

     //tTASK-->1999 YILINDA DOĞAN bir kişinin yaşını yazsırınız

        int dtarihi=1999;
        int buyıl=2022;
        int yasınız=buyıl-dtarihi;
        System.out.println(2022-1999);

        float f1=12.45f;
        float f2=23.56f;
        double boy= 1.85;
        System.out.println(f1*f2);

        //Task--> iki farklı byte tanımlayıp toplam ve farkını yazınız
        byte a=25;
        byte b=37;
        System.out.println(a+b);
        System.out.println(a-b);

        //Task--> iki farklı tamsayı türünde sayı tanımlayıp toplam ve farkını print ediniz
        int x=198;
        byte y=126;

        System.out.println(x+y);
        System.out.println(x-y);

        //Task-->  tam sayı ve ondalıklı syaı tanımlayıp toplam ve farkını bulunuz
        double h=3.14;
        int g=33;
        System.out.println(h+g);
        System.out.println(h-g);

        //Task--> tamsayı ve char data type iki variable tanımlayıp toplam print ediniz
        char p='$';
        int k=35;
        System.out.println(p+k);// $ ASCII değeri 36 olarak işleme girdi
        System.out.println(p-k);// $ ASCII değeri 36 olarak işleme girdi

      // Task ad ve soyadınızı ve yasınızı print ediniz

        String ad="ismail",soyad="topdas",yass="37";

        System.out.println(ad+" "+soyad+" "+" "+yass);




        }

}



