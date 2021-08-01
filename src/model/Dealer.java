package model;

public class Dealer {
	private String dealercard;
	private int scoreSum;

	public Dealer() {

	}

	public String getDealercard() {
		return dealercard;
	}

	public void setDealercard(String dealercard) {
		this.dealercard = dealercard;
	}

	public int getScoreSum() {
		return scoreSum;
	}

	public void setScoreSum(int scoreSum) {
		this.scoreSum = scoreSum;
	}

	public boolean equals(Object o) {
		if (o instanceof Dealer) {
			Dealer d = (Dealer) o;
			if (d.dealercard.equals(dealercard)) {
				return true;
			}
		}
		return false;
	}

}
