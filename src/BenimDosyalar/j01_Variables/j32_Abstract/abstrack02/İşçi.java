package BenimDosyalar.j01_Variables.j32_Abstract.abstrack02;

public class İşçi extends Personel{// abs  personel parent clas'a extend


    @Override
    public void maasHesapla() {// personel parent class ta override edildi
        System.out.println("yevmiye 400");

    }

    @Override
    public void maasBilgisi() {// personel parent class ta override edildi
        System.out.println("8 saat çalışılıcak");

    }
}
