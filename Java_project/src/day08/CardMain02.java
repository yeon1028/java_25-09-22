package day08;

public class CardMain02 {

	public static void main(String[] args) {
//		Card02 c2 = new Card02();
//		System.out.println(c2);
//		
//		c2.setShape("$");
//		c2.setNum(20);
//		System.out.println(c2);
//		System.out.println("----------");
		
		CardPack cp = new CardPack();
		System.out.println("----------");
		// 카드 Test
		System.out.println("카드를 섞겠습니다.");
		cp.random();
		for(int i=0; i<cp.getPack().length; i++) {
			cp.getPack()[i].print();
		}
		// player 4명
		System.out.println();
		System.out.println();
		System.out.println("카드를 나누겠습니다.");
		Card02 player1 = cp.pick();
		Card02 player2 = cp.pick();
		Card02 player3 = cp.pick();
		Card02 player4 = cp.pick();
		System.out.println();
		
		System.out.println("각 플레이어 Card open");
		System.out.print("player1: ");
		player1.print();
		System.out.println();
		System.out.print("player2: ");
		player2.print();
		System.out.println();
		System.out.print("player3: ");
		player3.print();
		System.out.println();
		System.out.print("player4: ");
		player4.print();
		System.out.println();
		
		cp.reset();
		
		
		// 배열 출력 코드
//		for(int i=0; i<cp.getPack().length; i++) {
//		
//			cp.getPack()[i].print();
//		}
//		System.out.println();
//		System.out.println("-- random() --");
//		
//		cp.random();
//		for(int i=0; i<cp.getPack().length; i++) {
//			cp.getPack()[i].print();
//		}
		
		
//		System.out.println();
//		System.out.println();
//		System.out.println("-- pick() --");
//		cp.pick().print();
//		
//		System.out.println();
//		System.out.println();
//		System.out.println("-- reset() --");
//		cp.reset();
//		for(int i=0; i<cp.getPack().length; i++) {
//			cp.getPack()[i].print();
//		}
		
		
//		for(int i=1; i<=4; i++) {
//			switch(i) {
//			case 1: c2.setShape("♥"); break;
//			case 2: c2.setShape("◆"); break;
//			case 3: c2.setShape("♣"); break;
//			case 4: c2.setShape("♠"); break;
//			}
//			for(int j=1; j<=13; j++) {
//				c2.setNum(j);
//				c2.print();
//			}
//			System.out.println();
//		}

	}

}
