package Deck;

import java.util.ArrayList;
import java.util.List;

import model.Gamer;
import model.Rule;

public class GamerDeck {
	private List<Gamer> list;
	private CardDeck deck;
	private Rule r;

	public GamerDeck() {
		list = new ArrayList<>();
		deck = new CardDeck();
		r = new Rule();
	}

	// 카드를 받는다 / 소유한다
	public void takeCard() {
		for (int i = 0; i < 2; i++) {
			Gamer g = new Gamer();
			g.setGamerCard(deck.giveRandomCard());
			list.add(g);
		}
	}
	
	public void addCard() {
			Gamer g = new Gamer();
			g.setGamerCard(deck.giveRandomCard());
			list.add(g);
	}
	
	// 카드를 오픈한다
	public List<Gamer> openCard() {
		return list;
	}

	public int gamerScore() {
		int sum = 0;
		for (Gamer g : list) {
			sum += r.scoreNum(g);
			g.setScoreSum(sum);
		}
		return sum;
	}

}
