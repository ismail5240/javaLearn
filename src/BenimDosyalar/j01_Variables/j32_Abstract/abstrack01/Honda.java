package BenimDosyalar.j01_Variables.j32_Abstract.abstrack01;

public abstract class Honda {
    public abstract void motor();
     void sunroof(){
         System.out.println("sunroof extra ücret");

     }
String name ="ismail team lead";
    abstract void  koltuk();
    abstract void  kapı();

     // final void finalMethode();// concerete method body'siz  olamaz
    // final abstract void finalMethode();// abs method final olamaz

    // private void prvateMethode();//concerete method body'siz  olamaz
   // private abstract void prvateMethode();//abs method private olmaz

   //  static void günesMethode();//concerete method body'siz  olamaz
   // static abstract void staticMethode();//abs method private olmaz

    // Honda obj=new Honda();// abs class obj uretemez

}
