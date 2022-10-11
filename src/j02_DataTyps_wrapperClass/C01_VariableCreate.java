package j02_DataTyps_wrapperClass;

public class C01_VariableCreate {

    public static void main(String[] args) {
        //1. yol-> best practice (Recomended) tavsiye edillen
        int yas=37;
        int maas=36000;
        System.out.println("yas"); //yas
        System.out.println(yas); //37
        System.out.println(maas);//36000
        System.out.println("ismail bey baslangıç maaşı:"+maas);//ismail bey baslangıç maaşı:36000
      // 2. yol
        int boy ; // değeri atanmayan boyisminde bir int tanımlandı declarition
       //System.out.println(boy);// değeri atanmamış değişkeni hiç bir aksiyonda kullanılamaz

          boy=175;

        System.out.println("boyunuz:"+boy);//175


         // 3. yol
         int yevmiye,age,kilo;//birden çok aynı tipte değişken tanımlandı
         age=33;
         yevmiye=1000;
                kilo=99;// tanımlanan değişkinlere değer atandı
        int günlük=1500, yıl=2022, ağırlık=99;

                //TRICK birvariable sadece birkez tanımlana bilir ama birden çok değeer atanabilir

        System.out.println(günlük);//1500
        günlük=1800;// günlük yeni değeri 1800 olarak atandı
        System.out.println("günlük son değeri :"+günlük);//1800
        System.out.println("günlük değeri:"+günlük+"yıl değeri:"+yıl+" "+yas+" "+yevmiye+" "+ağırlık);

    }
}
