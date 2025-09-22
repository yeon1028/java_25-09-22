package day03;

public class Exam01 {

	public static void main(String[] args) {
		// 소수 : 약수가 1과 나 자신 외에 없는 수
		/* ex) 3 5 7 11 13 ...
		   소수만 출력, 범위는 1부터 100까지	 */
		
		// 약수의 개수를 확인해야 하는 숫자가 많기 때문에 반복문 사용
		
		for(int i=2; i<=100; i++) {
			int a=0;
			for(int j=1; j<=i; j++) {
				if(i % j == 0) {
					a++; // 약수의 개수 세어 저장
				}
			}
			
			// 해당 약수 개수가 2개인지 확인
			if(a == 2) {
				System.out.println(i);
			}
		}
	}

}
