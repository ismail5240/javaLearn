package BenimDosyalar.j01_Variables.J18_Constructor;

public class C02_Arac {

    String marka;
    String model;
    int km;
    double motorHcm;
    boolean vitesAuto=false;
    boolean ikinciEl;
    int yıl;

    public static void main(String[] args) {

        C02_Arac arac1 = new C02_Arac();
        arac1.ikinciEl=true;
        arac1.marka="volvo";
        arac1.km=50000;
        arac1.model="xc60";
        arac1.motorHcm=2.4;
        System.out.println(arac1.marka+" "+arac1.model+" "+arac1.km+" "+arac1.yıl+" "+arac1.motorHcm+" "+arac1.ikinciEl);


        // task --> 2. bir aracın tum field'larını  atayarak prınt ediniz

        C02_Arac arac2 = new C02_Arac();
        arac2.ikinciEl=true;
        arac2.marka="honda";
        arac2.km=30000;
        arac2.model="juzz";
        arac2.motorHcm=2.4;
        arac2.yıl=2018;
        arac2.vitesAuto=true;
        System.out.println(arac2.yıl+" "+arac2.marka+" "+arac2.model+" "+arac2.km+" "+arac2.yıl+" "
                +arac2.motorHcm+" "+arac2.ikinciEl+" "+arac2.vitesAuto);




    }

    @Override
    public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHcm=" + motorHcm +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yıl=" + yıl +
                '}';


    }

}
