package BenimDosyalar.j01_Variables.j02_DataTyps_wrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {
       String name ="İSMAİL ";
       int yas=35;
        System.out.println(name.toLowerCase());
     // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
     // primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
    //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
    // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
    // ara çözüm imkanı sunmuştur.
        String tc="123455";
        String ıd="98765";
        System.out.println(tc+ıd);
        int yeniTC= Integer.valueOf(tc);
        int yeniID= Integer.valueOf(ıd);
        System.out.println(yeniTC+yeniID);
        String okulNo="234543l";
      //  int yeniOkulNo=Integer.valueOf(okulNo);// run time Exception-->çalışma zamanı hatası
       // System.out.println("yeniOkulNo=" + yeniOkulNo);
        // TASK--> byte short int maximum ve minimum değerlerini print eden code yazınız
byte maxByteDeğeri=Byte.MAX_VALUE;
byte minByteDeğeri=Byte.MIN_VALUE;
        System.out.println("maxByteDeğeri="+maxByteDeğeri);
        System.out.println("minByteDeğeri="+minByteDeğeri);
        System.out.println("Integer.MAX_VALUE="+Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE="+Integer.MIN_VALUE);

    }
        }