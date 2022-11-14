package BenimDosyalar.j01_Variables.j32_Abstract.abstrack03;

public abstract class Sekil {

    private String name;

    public Sekil() {//p'siz parent cons
    }

    public Sekil(String name) {//p'li parent cons
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  abstract double alanHesapla();
    public  abstract double cevreHesapla();
    public void ciz(){
        System.out.println(this.name+ " cizildi ");
    }

    @Override
    public String toString() {//obj value'leri print eder
        return
                "sekil isim ='" + this.name + '\'' +
                        "\n sekil alanı : "+this.alanHesapla()+
                        "\n sekil cevre : "+this.cevreHesapla();

    }
}
