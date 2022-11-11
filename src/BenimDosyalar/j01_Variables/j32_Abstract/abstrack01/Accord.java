package BenimDosyalar.j01_Variables.j32_Abstract.abstrack01;

public class Accord extends Honda {
    @Override
    public void motor() {//impelement edilen abst method
        System.out.println("2.0 turbo");

    }

    @Override
    void koltuk() {//impelement edilen abst method
        System.out.println("deri koltuk");
    }

    @Override
    void kapı() {//impelement edilen abst method
        System.out.println("vakumlu kapı dikkat");

    }

    @Override
    void sunroof() { // override edilen method
        System.out.println("sunroof ac hava al");

    }
}
