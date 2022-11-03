package BenimDosyalar.j01_Variables.j24_AccessModifier;

public class C01_AccessModifier {


    private int privateYas = 24;
    int defaultYas = 33; //Access modifier yazılmazsa default olarak tanımlanır
    protected int protectedYas = 40;
    public int publicYas = 48;

    private C01_AccessModifier() {//private  p'siz cons. kendi class'dan erişilir
        System.out.println("agama private cons. selam :)");
    }

    public C01_AccessModifier(int privateYas, int defaultYas) {//public 2p'li cos.
        System.out.println("agama public cons. selam :)");


    }

    private void privateMethod() {
        System.out.println("private method'dan agaya selam");
    }

    protected void protectedMethod() {
        // public void protectedMethod(){
        System.out.println("protected method'dan agaya selam");
    }
}