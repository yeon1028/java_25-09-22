package day01;

public class Variable {

	public static void main(String[] args) {
		// 변수(Variable)
		/* 타입 변수명; 선언 후 사용
		 * 선언 + 초기값
		 * int num = 0;
		 * 중복선언 불가능
		 * 같은 타입일 경우 동시 선언이 가능.
		 * 단, 동시 선언을 한다고 해서 초기값이 같은건 아니다
		 * 초기값은 각자 지정
		 * 
		 * 기본 데이터 타입은 초기화를 해야 사용 가능
		 * = (대입연산자) : = 오른쪽의 값을 왼쪽의 변수에 대입하겠다는 의미(덮어쓰기)
		 * 왼쪽의 값은 반드시 변수여야만 한다.
		 */
		int num;
		int num1=100, num2=0, num3=0;
		num = 0;
		num1 = 100;
		
		// char : 아스키 코드(유니코드) 표에 따른 한글자만 저장 가능. ''
		// String : 문자열 표현 클래스
		char ch = '가';
		System.out.println(ch); // 한글자 그대로 출력
		System.out.println((int)ch); // char 를 int 로 형변환 -> 유니코드에 따른 숫자 출력
		
		// double : 기본 실수형
		double dou = 3.1;
		System.out.println(dou);
		
		// byte
		byte b = 1;
		System.out.println(b);
		
		// boolean
		boolean boo = true; // true / false 만 저장 가능
		System.out.println(boo);
		
		// float / long 접미사 붙여야 함.
		// float(f F) / long(l L)
		float f = 1.2f;
		System.out.println(f);
		
		long l = 1;
		System.out.println(l);
		
		num1 = 010; // 앞 숫자가 0으로 시작하는건 8진법으로 인식(0~7 10 => 8
		System.out.println(num1);
		
		num2 = 0x10; // 16진법으로 인식 (0~9ABCDEF)
		System.out.println(num2);
		
		// 지역변수의 범위 { }
		
		{
			int a = 100;
			System.out.println(a);
		}
		    int a = 200;
		    System.out.println(a);
		
		
	}

}
