package BenimDosyalar.j01_Variables.J18_Constructor;

public class C03_StudentRunner {
    public static void main(String[] args) {

        C03_Student ogrc10 = new C03_Student();
        ogrc10.ad="fatih";
        ogrc10.soyad="Ataş";
        ogrc10.sınıfı=1;
        ogrc10.okulNo=1001;
        ogrc10.ortalama=77;
        ogrc10.takdir=false;

        System.out.println("ogrc10="+ogrc10);
        System.out.println(ogrc10);

    }

}
