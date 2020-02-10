
public enum Roshambo {

	ROCK {
		public String toString() {
			return "Rock";
		}
	},
	PAPER {
		public String toString() {
			return "Paper";
		}
	},
	SCIZZORS {
		public String toString() {
			return "Scizzors";
		}
	};

	private Roshambo() {
	}

}
