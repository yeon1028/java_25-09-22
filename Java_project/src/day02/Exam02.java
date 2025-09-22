package day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/* 태어난 연도를 숫자로 입력 받아 어린이(13), 청소년(19), 어른으로 구분
		 어린이 : 5000원, 청소년 : 7000원, 어른 : 10000원 입장료를 출력
		 ex) 2017 입력 => 9세 어린이입니다. 입장료는 5000원입니다.
		 생년을 기준으로 나이를 구하기 : 2025 - 2017
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("생년을 입력하세요: ");
		
		int num = sc.nextInt();
		int year = 2025;
		
		while(num < 1900 || num > year) {
			System.out.println("유효하지 않은 년도입니다.");
			System.out.println("다시 생년을 입력하세요: ");
			num = sc.nextInt();
		}
		
		int num1 = (year - num)+1;
		
		if(num1 <= 13) {
			System.out.println(num1+"세 어린이입니다. 입장료는 5000원 입니다.");
		} else if(num1 <= 19) {
			System.out.println(num1+"세 청소년입니다. 입장료는 7000원 입니다.");
		} else {
			System.out.println(num1+"세 어른입니다. 입장료는 10000원 입니다.");
		}
		
		
		sc.close();
		
	}

}
