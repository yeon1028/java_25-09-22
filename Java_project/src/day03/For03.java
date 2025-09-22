package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// 구구단 2단 출력
		/* 2*1=2
		   2*2=4
		   .
		   .
		   .
		   2*9=18
		 */
		
		int dan=2;
		int i=1;
		for(i=1; i<10; i++) {
			System.out.println(dan + "*" + i + "=" +(dan*i));
		}
		
		// Scanner를 입력해서 구구단 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("단 입력:");
		int a = sc.nextInt();
		
		for(int b=1; b<10; b++) {
			System.out.println(a + "*" + b + "=" + (a*b));
		}
		
		sc.close();
		
	}

}
