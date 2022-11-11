package BenimDosyalar.j01_Variables.j32_Abstract.abstrack01;

public class Civic extends Lastik {

    @Override
    public void motor() {//impelement edilen abst method
        System.out.println("1.6 eco motor az yakar çok kaçar");

    }

    @Override
    void koltuk() {//impelement edilen abst method
        System.out.println("ucuz olsun diye kumaş koltuk temiz kullanın");

    }

    @Override
    void kapı() {//impelement edilen abst method
        System.out.println("5 kapı sedan");


    }
    public  int vites(){// concreate child
        return 5;
    }

    @Override
    public void lastikEbat() {

    }

}

