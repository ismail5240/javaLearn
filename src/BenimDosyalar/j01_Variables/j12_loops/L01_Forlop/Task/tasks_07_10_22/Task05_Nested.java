package BenimDosyalar.j01_Variables.j12_loops.L01_Forlop.Task.tasks_07_10_22;

public class Task05_Nested {
    public static void main(String[] args) {
        /*
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        şekli print eden code create ediniz
         */
        for (int apt = 1; apt <= 6; apt++) {//dış döngü

            for (int daire = 1; daire < 6; daire++) {
                System.out.print("# ");
            }
            System.out.println();//dumy->hayalet komut:işlevi olmayan satır atlatan komut
        }


    }
}
