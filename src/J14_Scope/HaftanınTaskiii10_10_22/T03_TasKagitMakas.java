package J14_Scope.HaftanınTaskiii10_10_22;

import java.util.Scanner;

public class  T03_TasKagitMakas {

	public static void main(String[] args) {
		// tas >makas
		// makas >kagit
		//kagit >tas
		int numberOfFirstWin=0;
		int numberOfSecondWin=0;
		int numberOfComWin =0;
		int gameOver=3;


		Scanner input = new Scanner(System.in);
		int computerChoice;
		int playerChoice;
		int numberOfComputerWin = 0;
		int numberOfPlayerWin = 0;

		do {
			computerChoice = (int) (Math.random() * 3 + 1);
			System.out.print("\nRock >Scissors & Scissors >Paper & Paper >Rock   Rock(1)-Paper(2)-Scissors(3)-Exit(0)  Please enter your choice (1||2||3||0) : ");
			playerChoice = input.nextInt();
			System.out.print("Computer Choice = " + computerChoice);
			System.out.println(" && Player Choice = " + playerChoice);
			if(playerChoice!=0) {
				if (computerChoice == playerChoice) {
					System.out.println("Draw");
				} else if ((computerChoice == 1 && playerChoice == 3) || (computerChoice == 2 && playerChoice == 1)
						|| (computerChoice == 3 && playerChoice == 2)) {
					numberOfComputerWin++;
					System.out.println("Computer Won");
					System.out.println("Score : Computer = " + numberOfComputerWin + " - Player = " + numberOfPlayerWin);
				}
				else if(playerChoice!=0&&playerChoice!=1&&playerChoice!=2&&playerChoice!=3){
					System.out.println("You entered incorrectly. You must choose one of the numbers 0,1,2 or 3.");
				} else {
					numberOfPlayerWin++;
					System.out.println("Player Won");
					System.out.println("Score : Computer = " + numberOfComputerWin + " - Player = " + numberOfPlayerWin);
				}
			}
		}while (playerChoice != 0);
		if(numberOfComputerWin==numberOfPlayerWin) System.out.println("Draw");
		else if (numberOfComputerWin>numberOfPlayerWin) System.out.println("Computer Won");
		else System.out.println("Player Won");
		System.out.println("Last Score : Computer = "+numberOfComputerWin+" Player = "+ numberOfPlayerWin);



















	}

}
