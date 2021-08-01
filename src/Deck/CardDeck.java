package Deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Card;

public class CardDeck {
	private List<Card> list;
	
	
	public CardDeck() {
		list = new ArrayList<>();
		String[] pattern = { "DIAMOND", "HEART", "CLOVER", "SPADE" };
		String[] denomination = { "A", "K", "Q", "J", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		
		// 52개의 카드 객체를 갖고있다.
		for (int i = 0; i < pattern.length; i++) {
			for (int j = 0; j < denomination.length; j++) {
				Card c = new Card();
				c.setPattern(pattern[i]);
				c.setDenomination(denomination[j]);
				list.add(c);
			}
		}

	}

	//카드를 딜러와 게이머에게 전달하는 메소드
	public String giveRandomCard() {
		String temp = new String();
		Collections.shuffle(list);
	
		for (Card c : list) {
				temp = c.getPattern()+" "+c.getDenomination();
				list.remove(c);
			break;
		}
		return temp;
	}
	
	
	
	
	
}
