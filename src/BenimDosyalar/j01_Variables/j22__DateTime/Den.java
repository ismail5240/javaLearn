package BenimDosyalar.j01_Variables.j22__DateTime;

public class Den {
  /*  public static void main(String[] args) {

// adem abiye sor

            int [][] a= {{3,2} , {0,1,2}};

            System.out.println(b(a[0]));

        }



        public static int b(int []b){

            int sonuc = 0;

            for (int i = 0; i < b.length; i++) {

                sonuc+=b[i];

            }

            return sonuc;

        }

   */

    public static void main(String[] args) {

        int[][] m = {{3, 2}, {0, 1, 2}};

        System.out.println(b(m));

    }



    public static int b(int[][] b) {

        int sonuc = 0;

        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < b[i].length; j++) {

                sonuc += b[i][j];

            }

        }

        return sonuc;


    }}