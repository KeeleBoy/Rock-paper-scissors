
public class RockPlayer extends Player {
	
	private String name;

	public RockPlayer(String name) {
		super(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}
