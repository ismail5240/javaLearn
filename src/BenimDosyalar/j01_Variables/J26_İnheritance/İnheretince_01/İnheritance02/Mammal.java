package BenimDosyalar.j01_Variables.J26_İnheritance.İnheretince_01.İnheritance02;

public class Mammal extends Hayvancık {
    public Mammal() {// p' siz cons
        this('Y');
        System.out.println("Mammal P siz çalıştı");

    }

    public Mammal(char c) {// p'li cons
        super(17);
        System.out.println("mamal p 'li cons...");
    }

    public void mC() {
        System.out.println("mC-->Mammal class meth call");
    }

    int m = 1;
    int c = 4;

    @Override
    public void mN() {//parentten ezen method
        System.out.println("mC-->Mammal class meth call");
    }
}