package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* 야구게임
		   컴퓨터가 랜덤으로 3자리의 숫자를 생성
		   (각 자리의 수는 0~9)(중복 불가능)
		   -> 배열로 저장 (랜덤)(중복 불가능)
		   user가 3자리를 맞추는 게임
		   자리와 숫자가 같이 일치하면 strike
		   자리는 불일치, 숫자는 일치 ball
		   자리도 숫자도 불일치 out
		   
		 	예) com: 1 2 3
		 		user: 1 5 9 => 1s
		 		user: 2 5 8 => 1b
		 		user: 7 8 9 => out
		 		user: 1 9 5 => 1s
		 		user: 1 2 8 => 2s
		 		user: 1 3 2 => 1s 2b
		 		user: 1 2 3 => 3s 정답	 */
		
		System.out.println("야구게임 시작!");
		
		int[] num1 = new int[3];
		int[] num2 = new int[3];
		
		for(int i=0; i<num1.length; i++) {
			num1[i] = (int)(Math.random()*10);
			for(int j=0; j<i; j++) {
				if(num1[i] == num1[j]) {
					i--; // i++시켰다가 i--시키면 제자리 그대로 
				}
			}
		}
		System.out.println(Arrays.toString(num1));
		
		while(true) { Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		
		for(int i=0; i<num2.length; i++) {
			num2[i] = sc.nextInt();			
		}
		System.out.println(Arrays.toString(num2));
		
		int strike=0;
		int ball=0;
		
		for(int s=0; s<num1.length; s++) {
			for(int b = 0; b<num2.length; b++) {
				if(num1[s] == num2[b] && s==b) {
					strike++;
				} else if(num1[s] == num2[b] && s!=b) {
					ball++;
				}
			}
		} 
		System.out.println(">> "+strike+" strike, "+ball+" ball");
		
		if(strike==0 && ball==0) {
			System.out.println(">> out");
		}
		if(strike==3) {
			System.out.println("정답입니다! 게임을 종료합니다.");
			break;
		}
		
		sc.close();
		} 
		
	}

}