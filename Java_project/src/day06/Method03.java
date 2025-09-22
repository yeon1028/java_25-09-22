package day06;

public class Method03 {
	// 메서드 정의
	/* 기능을 정의하는 역할 (함수)
	   - 접근제어자 (public : 누구나 접근 가능.) 리턴타입 메서드명(매개변수) {
	   		구현;
	   		}
	   - 리턴타입 : 기능을 구현한 후 결과로 반환할 값
	   - 매개변수 : 기능을 구현하기 위해서 외부에서 필요한 값을 전달
	   - 메서드명 : 의미있게 소문자로 작성
	*/ 
	
	// 두 정수의 합을 리턴하는 메서드
	public int a(int num1, int num2) {
		return num1 + num2;
	}
	// 두 정수의 차를 리턴하는 메서드
	public int b(int num1, int num2) {
		return num1 - num2;
	}
	// 두 정수의 곱을 리턴하는 메서드
	public int c(int num1, int num2) {
		return num1 * num2;
	}
	// 두 정수의 나누기를 리턴하는 메서드 (double)
	public double d(int num1, int num2) {
		if(num2 == 0) {
			return -9999;
		}
		return (double)num1 / num2;
	}
	// 두 정수의 나머지를 리턴하는 메서드
	public int e(int num1, int num2) {
		if(num2 == 0) {
			return -9999;
		}
		return num1 % num2;
	}
	
	
	// num1, num2, 연산결과, 연산자(String) 값을 매개변수로 받아
		// System.out.println(num1+"+"+num2+"="+m3.a(num1,num2));
		// 모양으로 출력하는 메서드를 생성
		// 메서드명 : print
		public void print(int num1, int num2, String op, int result) {
			if(result == -9999 && op.equals("/") || op.equals("%")) {
				System.out.println("피연산자가 0일 수 없습니다.");
				return;
			}
			System.out.println(num1+op+num2+"="+result);
		}
		
		// 메서드 오버로딩 : 같은 기능을 하는 이름이 같은 메서드를 여러개 정의하는 것
		// 메서드 오버로딩의 조건 : 매개변수의 타입이 다르거나, 매개변수의 개수가 달라야 한다.
		// result 값이 double일 경우
		public void print(int num1, int num2, String op, double result) {
			if(result == -9999 && op.equals("/") || op.equals("%")) {
				System.out.println("피연산자가 0일 수 없습니다.");
				return;
			}
			System.out.println(num1+op+num2+"="+result);
		}
	
	
	public static void main(String[] args) {
	// + - * / % 기능을 하는 메서드 생성
	// main에서 호출 => 값을 출력
	Method03 m3 = new Method03();
	
	// 다른 클래스에서 생성한 메서드 호출
	Method02 m2 = new Method02();
	int s = m2.sum1(100, 200);
	System.out.println(s);
	
		
	// 두 수의 + - * / %의 결과를 메서드를 호출하여 출력
	int num1 = 10, num2 = 0;
	
	int a = m3.a(num1, num2);
	System.out.println(a);
	
	int b = m3.b(num1, num2);
	System.out.println(b);
	
	int c = m3.c(num1, num2);
	System.out.println(c);
	
	double d = m3.d(num1, num2);
	if(d == -9999) {
		System.out.println("피연산자가 0일 수 없습니다.");
	} else {
		System.out.println(d);		
	}
	
	int e = m3.e(num1, num2);
	if(e == -9999) {
		System.out.println("피연산자가 0일 수 없습니다.");
	} else {
		System.out.println(e);		
	}
		
	}

}
