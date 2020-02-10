import java.util.Scanner;

public class Human extends Player {

	public Human(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private String name;

	@Override
	public Roshambo generateRoshambo() {

		Scanner scnr = new Scanner(System.in);
		
		System.out.println("What would you like to play, rock paper or scizzors? (r/p/s)");

		String choice2 = scnr.nextLine();

		if (choice2.toLowerCase().equals("r")) {
			return Roshambo.ROCK;
		} else if (choice2.toLowerCase().equals("p")) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCIZZORS;
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
