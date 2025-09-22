package day11;

public class Interface01 {

	public static void main(String[] args) {
		// Interface (인터페이스)
		/* 추상메서드와 상수(final)로만 이루어진 것
		 * 추상클래스 / 인터페이스
		   : 추상 메서드를 포함하고 있기 때문에 반드시 구현해야만 객체를 생성할 수 있음.
		 
		 * 인터페이스 interface
		   - 기능요약서 : 메뉴얼 화
		   - 자체적으로 사용 불가능, 인터페이스를 구현한 클래스로 활용
		   - 구현 키워드 : implements
		   - 멤버변수가 없음.
		   - 이 부분을 염두에 두고 메서드 정리를 해야함.
		   
		   - 상속 : 다중상속 불가능 (단일상속 원칙)
		   - 구현 : 다중 구현이 가능
		   - 상속과 구현 동시에 가능
		 */
		
		Tv t = new Tv();
		t.turnOn();
	}

}

interface Power {
	abstract void turnOn(); // abstract를 붙여도 되고 안붙여도 상관없음
	abstract void turnOff();
	
}

interface Remocon {
	void volUp();
	void volDown();
}

// 상속과 구현을 동시에 해야할 경우
// class Tv2 extends A implements B{ }

class Tv implements Power, Remocon {
	private boolean power;
	private int vol;

	@Override
	public void turnOn() {
		power = true;
		System.out.println("TV가 켜졌습니다.");
	}

	@Override
	public void turnOff() {
		power = false;
		System.out.println("TV가 꺼졌습니다.");
		
	}

	@Override
	public void volUp() {
		vol++;
		System.out.println("vol: "+vol);
		
	}

	@Override
	public void volDown() {
		vol--;
		System.out.println("vol: "+vol);
		
	}
	
}