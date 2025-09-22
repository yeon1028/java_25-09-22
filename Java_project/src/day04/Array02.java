package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받기
		   1. 배열을 생성
		   2. 배열에 점수를 입력받기 (점수 범위:1~100)
		   3. 배열의 점수를 출력
		   4. 점수의 합계, 평균을 출력 
		 */
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;
		
		System.out.println("점수를 5번 입력하세요: ");
		for(int i=0; i<5; i++) {
			int score = sc.nextInt();
			if (score >=0 && score <=100) {
				arr[i] = score;
				sum = sum + arr[i];				
			} else {
				System.out.println("점수를 잘못 입력하셨습니다.");
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("점수의 합계는: " + sum);
		System.out.println("점수의 평균은: " + (double)(sum/5));

		
		sc.close();
		
	}

}
