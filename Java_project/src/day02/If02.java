package day02;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력받아 합계, 평균, pass 여부를 출력
		// pass 기준은 평균이 80이상
		// return; : 리턴 값을 주고 메서드 종료
		
		// method return void => 리턴 값이 없다는걸 의미
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요:");
		int kor = sc.nextInt();
		System.out.println("수학 점수를 입력하세요:");
		int mat = sc.nextInt();
		System.out.println("영어 점수를 입력하세요:");
		int eng = sc.nextInt();
			
		// 모든 조건은 하나씩 구분해서 사용
		// 조건들 간의 연결은 && / ||
		
		if((kor>100 || kor<0) || (eng>100 || eng<0) || (mat>100 || mat<0)) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			int sum = kor + mat + eng;
			System.out.println("합계는: " + sum);
			int ave = sum / 3;
			System.out.println("평균은: " + ave);
		}
		
		int sum = kor + mat + eng;
		int ave = sum / 3;
		if(ave >= 80) {
			System.out.println("결과는: pass");
		} else {
			System.out.println("결과는: fail");
		}
		
		sc.close();

	}

}
