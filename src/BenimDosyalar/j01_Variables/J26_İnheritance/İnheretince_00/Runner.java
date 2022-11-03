package BenimDosyalar.j01_Variables.J26_İnheritance.İnheretince_00;

public class Runner {

    /*
 1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
 2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
 3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
 4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları içim kullanılır.
 5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
 6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
 7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
   denir.
 8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
 9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/
    public static void main(String[] args) {

        Hayvancık hyvn = new Hayvancık();
        hyvn.hareket();
        hyvn.içme();
        hyvn.yeme();

        System.out.println("    ***   ");

        Mammal m1 = new Mammal();
        m1.süt();
        m1.hareket();
        m1.dogum();
        m1.içme();
        m1.yeme();

        System.out.println("   *****   ");


        Paluk hms = new Paluk();
        hms.ızgara();
        hms.hareket();
        hms.içme();

        System.out.println("   *****   ");

        Kedi kd = new Kedi();
        kd.cırmalar();
        kd.hareket();
        kd.içme();
        kd.dogum();
        kd.süt();

        System.out.println("   *****   ");

        Koyun ky=new Koyun();
        ky.semir();
        ky.hareket();
        ky.içme();
        ky.dogum();
        ky.yeme();

        System.out.println("   *****   ");

    }
}
