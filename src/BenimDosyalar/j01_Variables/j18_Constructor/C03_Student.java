package BenimDosyalar.j01_Variables.j18_Constructor;

public class C03_Student {

    String ad;
    String soyad;
    int sınıfı;
    double ortalama;
    int okulNo;
    boolean takdir;

    public void mezuniyet() {
        if (ortalama >= 50) {
            System.out.println("mezun oldunuz");
        } else System.out.println("seneyede bekleeriz");
    }

    @Override
    public String toString() {// objenin referans degeri print etmemesı için obj dataları
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sınıfı=" + sınıfı +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdir=" + takdir +
                '}';
    }
}
