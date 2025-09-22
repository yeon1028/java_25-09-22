package day08;

public class CardPack {
	/* Card 클래스를 52장 묶은 pack
	 * ♥A ~ ♥K, ◆A ~ ◆K, ♣A ~ ♣K, ♠A ~ ♠K
	   - 총 카드수 52장 한 묶음 (배열)
	   
	 * 메서드()
	   - 카드 출력 (Card => print())
	   - 카드 섞는 기능
	   - 카드를 한 장 빼내는 기능
	   - 카드 초기화 기능
	   
	 * 생성자
	 */
	
	private Card02[] pack = new Card02[52];
	private int cnt; // 번지역할을 하는 변수
	
	// 생성자 CardPack() => 52장의 카드가 생겨서 만들어져야함.
	public CardPack() {
		// pack => Card 객체를 담을 수 있는 배열
		// pack에 Card 객체가 52장 생성(new로 생성)되어 담겨야 함.
		// 숫자 : 1(A)~10, J(11), Q(12), K(13)
		// 모양 : ♥,  ◆,  ♣,  ♠
		// Card c = new Card();
		String s = "";
		for(int i=1; i<=4; i++) {
			switch(i) {
			case 1: s="♥"; break;
			case 2: s="◆"; break;
			case 3: s="♣"; break;
			case 4: s="♠"; break;
			}
			for(int j=1; j<=13; j++) {
				Card02 c2 = new Card02();
				c2.setNum(j);
				c2.setShape(s);
				pack[cnt] = c2;
				cnt++;
			}
		}
	}
	
	// 카드 섞기
	public void random() {
		for(int i=0; i<pack.length; i++) {
			int random = (int)(Math.random()*pack.length);
			// 교환
			Card02 tmp = pack[i];
			pack[i] = pack[random];
			pack[random] = tmp;
		}
	}
	
	// 하나씩 나눠주는 기능
	// 리턴 타입 : Card02
	public Card02 pick() {
		if(cnt == 0) {
			return null;
		}
		cnt--;
		return pack[cnt];
	}
	
	// 카드 초기화 -> 하나씩 내렸던 cnt를 다시 52로 회복 (후 섞기)
	public void reset() {
		cnt=52; // 카드 회수 기능
		random();
	}
	
	
	
	public Card02[] getPack() {
		return pack;
	}

	public void setPack(Card02[] pack) {
		this.pack = pack;
	}
	
}
