package day02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 카페에 제출
		/* 정수 2개와 연산자 1개를 입력받아서 두 정수를 연산결과를 출력
		 * + - * / % 이외 다른 종류의 특수문자가 들어오면 잘못된 연산자로 출력
		  
		 * ex) 2 3 + => 2+3=5
		 * ex) 3 2 - => 3-2=1
		 * ex) 3 2 ! => 잘못된 연산자입니다.
		 * ex) 2 0 + => 2+0=2
		 * ex) 2 0 / => 0으로 나눌 수 없습니다.
		 * ex) 2 0 % => 피연산자가 0일 수 없습니다.
		 * 
		 * String 클래스는 == 로 비교할 수 없다.
		 * equals(값) return boolean
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int num1 = sc.nextInt();
		
		System.out.println("연산자를 입력하세요:");
		String a = sc.next();
		
		System.out.println("숫자를 입력하세요:");
		int num2 = sc.nextInt();
		
		int num = 0;
		switch(a) {
			case "+": num = num1 + num2;
				break;
			case "-": num = num1 - num2;
				break;
			case "*": num = num1 * num2;
				break;
			case "/": 
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
				} else {
					num = num1 / num2;					
				}
				break;
			case "%": 
				if(num2 == 0) {
					System.out.println("피연산자가 0일 수 없습니다.");
				} else {
					num = num1 % num2;					
				}
				break;
			default:
				System.out.println("잘못된 연산자입니다.");
				
		}
		System.out.println("결과는: " + num);
		
		sc.close();
	}

}
