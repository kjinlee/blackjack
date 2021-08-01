package model;

public class Gamer {
	private String gamerCard;
	private int scoreSum;

	public Gamer() {

	}

	public String getGamerCard() {
		return gamerCard;
	}

	public void setGamerCard(String gamerCard) {
		this.gamerCard = gamerCard;
	}

	public int getScoreSum() {
		return scoreSum;
	}

	public void setScoreSum(int scoreSum) {
		this.scoreSum = scoreSum;
	}

	public boolean equals(Object o) {
		if (o instanceof Gamer) {
			Gamer g = (Gamer) o;
			if (g.gamerCard.equals(gamerCard)) {
				return true;
			}
		}
		return false;
	}

}
