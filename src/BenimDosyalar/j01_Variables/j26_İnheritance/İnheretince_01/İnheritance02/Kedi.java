package BenimDosyalar.j01_Variables.j26_─░nheritance.─░nheretince_01.─░nheritance02;

public class Kedi extends Mammal {

    public Kedi() {
        super();
        System.out.println("kedi p'siz cons ...");

    }
    public Kedi(String str) {
        this();
        System.out.println(super.c);
        System.out.println("kedi p'li cons ...");
    }

    int c=2;
    int d=5;

    @Override
    public void mC() {// mamal parent den ezen parent
        System.out.println("mC -->Kedi class meth call");
    }
}
