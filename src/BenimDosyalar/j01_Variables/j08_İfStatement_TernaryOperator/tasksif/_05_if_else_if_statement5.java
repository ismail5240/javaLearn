package BenimDosyalar.j01_Variables.j08_İfStatement_TernaryOperator.tasksif;

public class _05_if_else_if_statement5 {

    public static void main(String[] args) {

    /*  90.25 ve 90.25 değerinde iki double oluşturun.
        Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.
        Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.
        Aksi halde (else) "I love java" yazdırın. */


        double dbl1 = 90.25;
        double dbl2 = 90.25;

        if (dbl1 > dbl2) {
            System.out.println("Hello World");
        }
        else if (dbl1 < dbl2) {
            System.out.println("Not Hello World");
        }

        else System.out.println("I love java" );






/*
        double dbl1=90.25;
        double dbl2=90.25;
        if (dbl1>dbl2){
            System.out.println("Hello World");
        }
        else if(dbl1<dbl2){
            System.out.println("Not Hello World");
        }
        else System.out.println( "I love java" );




 */


    }
}
