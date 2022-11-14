package BenimDosyalar.j01_Variables.j32_Abstract.abstrack02;

public class Runner {
    public static void main(String[] args) {

        İşçi mrb1=new İşçi();
        mrb1.maasBilgisi();//8 saat çalışılıcak
        mrb1.maasHesapla();//yevmiye 400

        mrb1.name="yahya bey";
        System.out.println(mrb1.name);

        mrb1.sigorta();//özel sigorta kapsamındasın---> abs parent class daki conc meth obj ile coll

        İdariPersonel cnc=new İdariPersonel();
        cnc.name="ismail bey";


        cnc.maasBilgisi();//bir ay ikramiye
        cnc.maasHesapla();//  idareciye saati 120$
        cnc.sigorta();//özel sigorta kapsamındasın

    }
}
