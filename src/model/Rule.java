package model;

public class Rule {
	private final int SCORE_MAX = 21;

	public Rule() {

	}

	public int scoreNum(Dealer d) {
		String num = d.getDealercard().replaceAll("[^0-9]", "");
		if (num.matches(".*[0-9].*")) {
			int a = Integer.parseInt(num);
			return a;
		} else {
			return 10;
		}

	}

	// a 1점 넣기
	public int scoreNum(Gamer g) {
		String num = g.getGamerCard().replaceAll("[^0-9]", "");
		if (num.matches(".*[0-9].*")) {
			int a = Integer.parseInt(num);
			return a;
		} else {
			return 10;
		}

	}

	// 승패를 판단한다.
	public int winORlose(int dealer, int gamer) {
		if (!(dealer > SCORE_MAX && gamer > SCORE_MAX)) {
			if (dealer > gamer) {
				return 0;
			}else if(gamer>dealer) {
				return 1;
			}
		} else if (dealer > SCORE_MAX) {
			return 1;
		} else if (gamer > SCORE_MAX) {
			return 0;
		}
		return -1;
	}

}
//	
