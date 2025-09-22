package day04;

import java.util.Random;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 가위바위보 게임
		/* 컴퓨터와 유저가 가위바위보 게임을 진행
		   가위 = 0, 바위 = 1, 보 = 2
		   컴퓨터도 랜덤으로 0 1 2 중 선택
		   ex) com = 0 / me = 0
		   com(가위) / me(가위) => 무승부
		   
		   com = 0 / me = 2
		   com(가위) / me(보) => me 패배
		    
		 */
		
		String choice[] = {"가위", "바위", "보"};
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("가위 바위 보 게임 시작");
		System.out.println("0.가위 / 1.바위 / 2.보 / 3. 종료");
		
		int num2 = (int)(Math.random()*3);
		int num1 = sc.nextInt();
		
		if(num1 == num2) {
		System.out.println("com:"+choice[num2]+" / me:"+choice[num1]);
		System.out.println("무승부");
		}else {
			if(num1 > num2) {
				System.out.println("com:"+choice[num2]+" / me:"+choice[num1]);
				System.out.println("win");
			} else {
				if(num1 < num2) {
					System.out.println("com:"+choice[num2]+" / me:"+choice[num1]);
					System.out.println("lose");
					}
				}
		} 

	}

}
