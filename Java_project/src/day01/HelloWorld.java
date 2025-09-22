package day01;

public class HelloWorld {

	public static void main(String[] args) {
		// class는 package 안에 있어야 한다.
		// class는 대문자로 시작(공백은 사용할 수 없음)
		// class 명에 여러 단어를 쓰고 싶다면 카멜케이스로 사용
		// 카멜케이스 예시 --> HelloWorld
		// 대소문자 구분 HelloWorld =/= Helloworld
		// : 주석 -> 프로그램으로 읽히지 않는 라인 // <- 한줄 주석
		/* 여러줄 주석 */ 
		// Ctrl + / : 주석 단축키
		// println(); : 줄바꿈이 있는 출력
		// print(); : 줄바꿈이 없는 출력
		// printf(); : 포맷형 출력(주로 c언어에서 사용)
		
		System.out.println("Hello JAVA!!"); // 기본출력구문
		System.out.print("Hello JAVA World~!!");
		System.out.print("Test01");

		System.out.println(); // 줄바꿈만 하고 싶은 경우
		// 단, print() 는 아무것도 출력하지 않으면 에러가 난다.
		
		// printf : %d(정수) %s(문자열) %c(문자) %f(실수형) \n(줄바꿈) \t(탭)
		System.out.printf("%s\n", "Hello JAVA~!!");
		System.out.printf("%d", 10);
		
		// Java에서 "" -> 문자열 / '' -> 한글자 / 숫자는 그냥 작성
		
		// 변수 -> 타입 변수명 = 값;
		int num = 10; // 선언과 동시에 값을 부여
		num = 20; // 값을 재할당
		
		int num1; // 선언만
		num1 = 10; // 초기값 할당
		
		final String COMPANY = "KOREA IT"; // 상수 선언
		

	}

}
