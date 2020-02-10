
public class RNGPlayer extends Player {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RNGPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {

		double variable1 = (Math.random() * 3);

		if (variable1 < 1) {
			return Roshambo.ROCK;
		} else if (variable1 >= 1 && variable1 < 2) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCIZZORS;
		}

	}

}
