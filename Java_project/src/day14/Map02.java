package day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		// 과목, 점수를 입력받아 map에 저장
		// 종료 키워드가 나올 때까지 반복해서 입력 (1=계속 | 0=종료)
		// 종료 키워드를 입력했을 때 출력, 합계, 평균 값 출력하기
		
		Map<String, Integer> map = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목과 점수를 입력하세요.");
		System.out.println("1. 계속 | 0. 종료");
		
		while(true) {
				
			System.out.println("과목: ");
			String sub = sc.next();
			System.out.println("점수: ");
			int score = sc.nextInt();
			map.put(sub, score);
			System.out.println("1. 계속 | 0. 종료");
			int num = sc.nextInt();
			if(num==0) {
				System.out.println("종료합니다.");
				break;
			}
		}
		System.out.println(map);
		
		int sum=0;
		for(String s : map.keySet()) {
			int value = map.get(s);
			sum += value;
		}
		System.out.println("합계: " + sum);
		System.out.println("평균: " + sum/map.size());
		
		sc.close();
	
		
		
	}

}
