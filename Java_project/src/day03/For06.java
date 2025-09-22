package day03;

public class For06 {

	public static void main(String[] args) {
		// 배수 : 값을 1부터 곱해서 나오는 값
		/* 10의 배수 : 10 20 30 40 ...
		   15의 배수 : 15 30 45 60 ...
		   공배수 : 두 수의 공통된 배수 30 60 ....
		   최소 공배수 : 30
		 */
		
		int num1 = 10;
		int num2 = 15;
		
		for(int i = num1; ; i=i+num1) {
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.print(i);
				break;
			} 
		}
		
	}

}
