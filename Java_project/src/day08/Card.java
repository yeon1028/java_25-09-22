package day08;

public class Card {
	/* 숫자 : 1(A)~10, J(11), Q(12), K(13)
	 * 모양 : ♥,  ◆,  ♣,  ♠
	 * ex) ♥1, ♠10
	 * 해당 범위에 벗어나는 숫자는 1로 바꾸기 / 문자는 ♥로 바꾸기
	 
	 - 멤버변수 : 숫자(num), 모양(shape)
	 - 출력 : toString
	 - 생성자 : 기본생성자만 => ♥A
	 - print()
	 	=> A(1), J(11), Q(12), K(13)
	 */

	private int num;
	private String shape;
	
	public Card() {
		shape = "♥";
		num = 1;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		if(num > 1 && num < 11) {
			this.num = num;
			System.out.print(num);
		} else if (num > 13){
			System.out.print(1);						
		}
		if(num == 1) {
			System.out.println("A");
		}
		if(num == 11) {
			System.out.print("J");
		} 
		if(num == 12) {
			System.out.print("Q");
		} 
		if(num == 13) {
			System.out.print("K");
		} 
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		if(shape == "♥" || shape == "◆" || shape == "♣" || shape == "♠" ) {
			this.shape = shape;
			System.out.print(shape);
		}else {
			System.out.print("♥");			
		}
	}
	
	@Override
	public String toString() {
		return shape + num;
	}
	
}
