package model;

public class Card {
	private String pattern;
	private String denomination;
	
	public Card() {
		
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Card) {
			Card c = (Card) o;
			if(c.pattern.equals(pattern)&&c.denomination.equals(denomination)) {
				return true;
			}
		}
		return false;
	}
	
	
	

}
