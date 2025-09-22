package day02;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		// Input
		/* 콘솔 입력
		 * console input : 콘솔에서 값을 입력받는 것을 의미
		 * Scanner 클래스 : 객체를 생성할때는 new 키워드 사용
		 * 클래스타입 객체명 = new 클래스명(값);
		 * 객체명.next() : 한 단어를 입력 (공백을 포함하지 않음 - 공백앞까지만 인정)
		 * 객체명.nextLine() : 여러 단어를 입력 (공백 포함 - 단 Enter를 인지하기 때문에 그 전까지만)
		 * 객체명.nextInt() : 정수 입력
		 * 객체명.next자료형() : 그 자료형에 맞는 값을 입력받음
		 */
//		String str = "abc"; //특별한 클래스
//		System.out.println(str);
//		// String은 워낙 많이 쓰는 클래스라서 new 키워드 없이 생성 가능
//		
//		String str2 = new String();
//		str2 = "bcd";
//		System.out.println(str2);
		
		/* Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력>");
		int inputNum = sc.nextInt();
		System.out.println(inputNum+10);
		
		System.out.println("문자 입력>");
		String inputStr = sc.next(); // 공백 전까지 입력
		System.out.println("입력받은 문자:"+inputStr);
		
		sc.nextLine(); // 버퍼에 남아있는 값을 처리용
		
		System.out.println("여러 문자 입력>");
		String inputStr2 = sc.nextLine(); // enter 전까지만 인지
		System.out.println("입력받은 문자열:"+inputStr2);
		*/
		
		// 입력 받은 숫자가 짝수인지 홀수인지 판별하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int inputNum = sc.nextInt();
		System.out.println((inputNum % 2 ==0)? "짝수" : "홀수");
		
		
		sc.close();
		
	}

}
