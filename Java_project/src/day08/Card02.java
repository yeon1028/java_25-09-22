package day08;

public class Card02 {
	
	private int num;
	private String shape;
	
	public Card02() {
		this.shape = "♥";
		this.num = 1;
	}
	
	public void print() {
		System.out.print(shape);
		switch(num) {
		case 1: System.out.print("A "); break;
		case 11: System.out.print("J "); break;
		case 12: System.out.print("Q "); break;
		case 13: System.out.println("K "); break;
		default: 
			System.out.print(num+" ");
		}
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		if(num < 1 || num > 13) {
			this.num = 1;
			return;
		}
		this.num = num;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		switch(shape) {
		case "♥" : case "◆" : case "♣" : case "♠" :
		this.shape = shape;
		break;
		default: 
			this.shape = "♥";
	}
}

	@Override
	public String toString() {
		return shape + num;
	}
}