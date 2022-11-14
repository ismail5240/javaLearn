package BenimDosyalar.j01_Variables.j32_Abstract.abstrack02;

public class İdariPersonel extends Personel{
    @Override//mecbur iplement edilmesi
    public void maasHesapla() {// personel parent class ta override edildi
        System.out.println("idareciye saati 120$");
    }

    @Override// sigorta tercihen
    public void sigorta() {// personel parent class ta override edildi
        super.sigorta();
        System.out.println("cıncık code");
    }

    @Override//mecbur iplement edilmesi
    public void maasBilgisi() {// personel parent class ta override edildi
        System.out.println("bir ay ikramiye");


    }
}
