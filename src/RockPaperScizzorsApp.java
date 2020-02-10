import java.util.Scanner;

public class RockPaperScizzorsApp {

	public static void main(String[] args) {

		Player player1 = new RockPlayer("Rock1");
		Player player2 = new RNGPlayer("Random1");
		// Player player3 = new Human(null);

		Scanner scnr = new Scanner(System.in);

		// System.out.println("Please enter your name: ");
		String nameChoice = Validator.getString(scnr, "Please enter your name: ");

		Player player3 = new Human(nameChoice);

		// System.out.println("Please chose an opponent(Rock or RNG): ");
		String opponentChoice = Validator.getString(scnr, "Please chose an opponent(Rock or RNG):").toLowerCase();

		boolean goodChoice = false;

		while (!goodChoice) {
			switch (opponentChoice) {
			case ("rock"):
				playRockBot(player3, player1);
				goodChoice = true;
				break;

			case ("rng"):
				playRNGBot(player3, player2);
				goodChoice = true;
				break;

			default:
				System.out.println("That wasnt either RNG, or Rock");
				break;
			}
		}
		System.out.println("Total wins: " + wins);
		System.out.println("Total ties: " + ties);
		System.out.println("Total losses: " + losses);
		System.out.println("BYE.");
	}

	public static void playRockBot(Player p1, Player p2) {
		boolean goAgain = true;
		Scanner scnr = new Scanner(System.in);
		while (goAgain) {
			Roshambo r1 = p1.generateRoshambo();
			Roshambo r2 = p2.generateRoshambo();
			results(r1, r2);
			// System.out.println("Want to play another round (y/n)");
			String newChoice = Validator.getString(scnr, "Want to play again?(y/n)");
			if (newChoice.startsWith("n")) {
				goAgain = false;
			}
		}
	}

	public static void playRNGBot(Player p1, Player p2) {
		boolean continue1 = true;
		Scanner scnr = new Scanner(System.in);
		while (continue1) {
			Roshambo r1 = p1.generateRoshambo();
			Roshambo r2 = p2.generateRoshambo();
			results(r1, r2);
			// System.out.println("Do you want to play another round? (y/n)");
			String newChoice = Validator.getString(scnr, "Want to play again?(y/n)");
			if (newChoice.startsWith("n")) {
				continue1 = false;
			}

		}
		scnr.close();
	}

	public static int wins = 0;
	public static int ties = 0;
	public static int losses = 0;

	public static void results(Roshambo player1, Roshambo player2) {

		if (player1.equals(Roshambo.PAPER)) {
			if (player2.equals(Roshambo.PAPER)) {
				System.out.println("It was a tie.");
				ties += 1;
			} else if (player2.equals(Roshambo.SCIZZORS)) {
				System.out.println("You lost to scizzors with your paper.");
				losses += 1;
			} else if (player2.equals(Roshambo.ROCK)) {
				System.out.println("You won to rock with your paper.");
				wins += 1;
			}
		} else if (player1.equals(Roshambo.ROCK)) {
			if (player2.equals(Roshambo.PAPER)) {
				System.out.println("You lost to paper with your rock.");
				losses += 1;
			} else if (player2.equals(Roshambo.SCIZZORS)) {
				System.out.println("You won to scizzors with your rock.");
				wins += 1;
			} else if (player2.equals(Roshambo.ROCK)) {
				System.out.println("You tied to rock with your rock.");
				ties += 1;
			}
		} else if (player1.equals(Roshambo.SCIZZORS)) {
			if (player2.equals(Roshambo.PAPER)) {
				System.out.println("You won to paper with your scizzors.");
				wins += 1;
			} else if (player2.equals(Roshambo.SCIZZORS)) {
				System.out.println("You tied to scizzors with your scizzors.");
				ties += 1;
			} else if (player2.equals(Roshambo.ROCK)) {
				System.out.println("You lost to rock with your scizzors.");
				losses += 1;
			}
		}

	}

}
