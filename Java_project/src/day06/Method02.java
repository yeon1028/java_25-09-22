package day06;

public class Method02 {
	
	// 메서드 생성 위치
	
	/* 두 정수가 주어지면 두 수의 합을 리턴하는 메서드
	 * 매개변수 : 두 정수 int num1, int num2
	 * 리턴타입 : int
	 */
	public int sum1(int num1, int num2) {
		return num1 + num2;
	}
	
	/* 두 정수가 주어지면 두 수의 합을 출력하는 메서드
	 * 매개변수 : 두 정수 int num1, int num2
	 * 리턴타입 : void
	 */
	public void sum2(int num1, int num2) {
		// 메서드 내부에서 다른 메서드를 호출할 수 있음
		int sum1 = sum1(10,20);
		System.out.println(sum1 + num1 + num2);
	}
	
	// 매개변수도 없고 리턴 타입도 없음. void 
	public void sum3() {
		int num1 = 20;
		int num2 = 30;
		System.out.println(num1 + num2);
	}
	
	// 매개변수는 없고 리턴타입은 있는 케이스
	public int sum4() {
		int num1 = 20;
		int num2 = 30;
		return num1 + num2;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method02 me = new Method02();
		int hap1 = me.sum1(30, 66);
		System.out.println(hap1);
		me.sum2(500, 700);
		
		me.sum3();
		int s4 = me.sum4();
		System.out.println(s4);

	}

}
