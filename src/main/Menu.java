package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import Util.BufferUtil;

public class Menu {
	private BufferedReader bf;
	private BufferedWriter bw;
	private Table t;

	public Menu() {
		bf = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		t = new Table();
	}

	public void gameTable() throws IOException {
		while (true) {
			String msg;
			msg = "1. 카드 뽑기\n2. 카드 확인\n3. 점수 확인\n4. 승패 확인\n5. 종료\n";
			int choice = BufferUtil.readInt(bf, msg, 1, 5);
			if (choice == 1) {
				t.takeCard();
			} else if (choice == 2) {
				t.openGamerCard();
				t.openDealerCard();
			} else if (choice == 3) {
				t.bothScore();
			} else if (choice == 4) {
				t.winORlose();
			} else if (choice == 5) {
				bw.write("사용해주셔서 감사합니다.");
				bw.flush();
				break;
			}

		}
	}

	
}
