package day03;

import java.util.Scanner;

public class Exam03_1 {

	public static void main(String[] args) {
		/* ---menu---
		 * 1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료
		 * 두 수를 입력해주세요. > 3 2 / menu = 1
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 숫자를 입력해주세요: ");
		int menu = 0;
		
		do {
			System.out.println("---menu---");
			System.out.println("1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료");
			System.out.println(">> menu >");
			menu = sc.nextInt();
			
			if(menu == 6) {
				System.out.println("종료합니다");
				break;
			}
			
			System.out.println("두 숫자를 입력해주세요: ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			while(num2==0 && (menu==4 || menu==5)) {
				System.out.println("피연산자가 0입니다.");
				// continue; // 메뉴 다시 선택
				System.out.println("num2를 다시 입력해주세요.");
				num2 = sc.nextInt();
			}
			
			switch(menu) {
			case 1:
				System.out.println(num1+"+"+num2+"="+(num1+num2));
				break;
			case 2:
				System.out.println(num1+"-"+num2+"="+(num1-num2));
				break;
			case 3:
				System.out.println(num1+"*"+num2+"="+(num1*+num2));
				break;
			case 4:
				System.out.println(num1+"/"+num2+"="+(num1/num2));						
				break;
			case 5:
				System.out.println(num1+"%"+num2+"="+(num1%num2));
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
			
		} while(menu != 6);
		
		
		sc.close();
		
	}

}
