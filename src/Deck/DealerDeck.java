package Deck;

import java.util.ArrayList;
import java.util.List;

import model.Dealer;
import model.Gamer;
import model.Rule;

public class DealerDeck {
	private List<Dealer> list;
	private CardDeck deck;
	private Rule r;

	public DealerDeck() {
		list = new ArrayList<>();
		deck = new CardDeck();
		r = new Rule();
	}

	// 카드를 받는다 / 소유한다
	public void takeCard() {
		for (int i = 0; i < 2; i++) {
			Dealer d = new Dealer();
			d.setDealercard(deck.giveRandomCard());
			list.add(d);
		}
	}
	
	public void addCard() {
			Dealer d = new Dealer();
			d.setDealercard(deck.giveRandomCard());
			list.add(d);
	}

	// 카드를 오픈한다
	public List<Dealer> openCard() {
		return list;
	}
	
	// 점수를 공개한다.
	public int dealerScore() {
		int sum = 0;
		for (Dealer d : list) {
			sum += r.scoreNum(d);
			d.setScoreSum(sum);
		}
		return sum;
	}

	// 2카드의 합계 점수가 16점 이하면 반드시 1장을 추가로 뽑고, 17점 이상이면 x
	public boolean scoreLimit() {
		if (dealerScore() <= 16) {
			return false;
		}
		return true;

	}

}
