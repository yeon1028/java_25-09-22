package day02;

public class For01 {

	public static void main(String[] args) {
		// For문 => 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		/* for, while, do~while
		   - for, while 동작 방식이 같음 (선조건 후실행)
		 		=> 조건에 맞지 않으면 한번도 실행되지 않을 수도 있음.
		   - do~while (선실행 후조건)
		 		=> 조건에 맞지 않아도 무조건 한번은 실행.
		 		
		 * for(초기화; 조건식; 증감식){
		 	실행문;
		 	} - 조건식에 맞으면 실행
		  - 초기화 : 실행문을 반복하기 위한 변수를 초기화(처음 한번만 실행) => 생략 가능
		  - 조건식 : 반복을 결정하는 식 (true => 반복) => 생략 가능
		  - 증감식 : 조건식에서 사용할 변수를 증가 / 감소시켜 반복 횟수를 조절 => 생략 가능
		 */
		
		
		/* for(int i = 0; i < 10; i++) {
			System.out.println("Hello~!!");
			System.out.println(i);
		}
		// i++ => i = i + 1
		
		System.out.println("---------------");
		// i가 짝수인 수만 출력 -> 0 2 4 6 8만 출력
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("---------------");
		
		// 1부터 10까지 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("---------------");
		*/
		
		// 1부터 10까지의 합계 출력
		// 기본 자료형 8가지는 무조건 초기화가 되어야만 사용 가능!
		
		/* int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		*/
		
		// 1부터 10까지 짝수합 / 홀수합
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				sum1 = sum1 + i;
			} else {
				sum2 = sum2 + i;
			}
		}
		System.out.println(sum1);
		System.out.println(sum2);
	}

}
