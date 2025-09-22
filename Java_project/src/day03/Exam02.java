package day03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// up/down 게임
		/* 1~50 랜덤수 하나를 생성
		   유저가 맞추는 게임
		   ex) 컴퓨터가 랜덤수를 생성했습니다. 23
		   입력> 20 -> up!
		   입력> 30 -> down!
		   입력> 25 -> down!
		   입력> 23 -> 정답
		   
		   랜덤수 > 유저수 up
		   랜덤수 < 유저수 down
		   랜덤수 = 유저수 정답
		 */
		
		// 5회 안에 맞춰야 함.
		// 5회가 넘어가면 횟수 제한 실패!
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터가 랜덤수를 생성했습니다!");
		int count=0;

		int random = (int)(Math.random()*50)+1;
		int user = -1;
		
		while(random != user){
			System.out.println("숫자를 입력하세요:");
			user = sc.nextInt();
			count++;
			
		if(random > user) {
			System.out.println("UP");
		} else if(random < user) {
			System.out.println("DOWN");
		} else {
			System.out.println("정답입니다!!");
			}
		}
		if(count == 5) {
			System.out.println("횟수 제한 실패!");
		}
		
		
		sc.close();
		
	}

}
