package day03;

public class For05 {

	public static void main(String[] args) {
		// 공약수 : 두 수의 약수 중 공통된 약수
		/* 6의 약수 : 1 2 3 6
		   12의 약수 : 1 2 3 4 6 12
		   두 수의 공약수 : 1 2 3 6
		   공약수 중 가장 큰 수 = 최대 공약수 : 6
		 */
		
		int num1 = 50; // num1 % i == 0
		int num2 = 20; // num2 % i == 0
		int max = 0;
		
		// 공약수 둘 다 i로 나누어서 나머지가 0인 수
		for(int i=1; i<=num2; i++) {
			if(num1%i==0 && num2%i==0) {
				System.out.println(i);
				max = i;
			} 
		}
		System.out.println("최대 공약수:" + max);
		System.out.println("---------------");
		
		
		// num1부터 1까지 1씩 감소 / 첫 조건이 맞다면 출력 후 break;
		for(int i=num1; i>=1; i--) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.println(i);
				break; // 종료를 결정하는 조건
			}
		}
		
		System.out.println("---------------");
		// while 문으로 변경
		int i=num2;
		while(true) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.println(i);
				break;
			}
			i--;
		}
	}

}
