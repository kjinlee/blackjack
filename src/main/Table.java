package main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import Deck.DealerDeck;
import Deck.GamerDeck;
import model.Dealer;
import model.Gamer;
import model.Rule;

public class Table {
	private BufferedWriter bw;
	private DealerDeck dealer;
	private GamerDeck gamer;
	private Rule r;
	private boolean gameCheck;

	public Table() {
		dealer = new DealerDeck();
		gamer = new GamerDeck();
		r = new Rule();
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		gameCheck = true;
	}

	public void takeCard() throws IOException {
		if (gameCheck) {
			gamer.takeCard();
			dealer.takeCard();
			dealerAddCard();
			gameCheck = false;
		} else {
			gamer.addCard();
			dealerAddCard();
		}
	}

	public void dealerAddCard() throws IOException {
		if (!dealer.scoreLimit()) {
			bw.write("딜러의 카드를 추가로 뽑습니다.\n");
			bw.flush();
			dealer.addCard();
		} else {
			bw.write("딜러는 더이상 카드를 뽑을 수 없습니다\n");
			bw.flush();
		}
	}

	public void openDealerCard() throws IOException {
		List<Dealer> temp = dealer.openCard();
		for (Dealer d : temp) {
			bw.write("딜러의 카드: " + d.getDealercard() + "\n");
			bw.flush();
		}
	}

	public void openGamerCard() throws IOException {
		List<Gamer> temp = gamer.openCard();
		if (temp.isEmpty()) {
			bw.write("아직 게이머가 카드를 뽑지 았습니다.\n");
			bw.flush();
		} else {
			for (Gamer g : temp) {
				bw.write("게이머의 카드: " + g.getGamerCard() + "\n");
				bw.flush();
			}
			bw.write("===========================\n");
			bw.flush();
		}
	}

	public void bothScore() throws IOException {
		bw.write("딜러의 총점: " + dealer.dealerScore() + "\n");
		bw.flush();
		bw.write("===========================\n");
		bw.flush();
		bw.write("게이머의 총점: " + gamer.gamerScore() + "\n");
		bw.flush();
	}

	public void winORlose() throws IOException {
		if (r.winORlose(dealer.dealerScore(), gamer.gamerScore())==0) {
			bw.write("딜러 승리!\n");
			bw.flush();
		} else if (r.winORlose(dealer.dealerScore(), gamer.gamerScore())==1) {
			bw.write("게이머 승리!\n");
			bw.flush();

		} else if(r.winORlose(dealer.dealerScore(), gamer.gamerScore())==-1){
			bw.write("둘 다 패배 \n");
			bw.flush();

		}
	}

}
