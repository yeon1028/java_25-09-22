package day03;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/* ---menu---
		  1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료
		  ex) 1번 선택 : 두 수를 입력해주세요. > 3 2 
		  	  menu 1 -> 3 2 -> 3+2=5
		  	  menu 2 -> 3 2 -> 3-2=1
		  	  menu 4 -> 3 0 -> 3/0= num2를 다시 입력해주세요.
		  	  menu 5 -> 3 0 -> 3%0= num2를 다시 입력해주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		do {
			System.out.println("----menu----");
			System.out.println("1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료 ");
			System.out.println("menu를 선택하세요 > ");
			menu = sc.nextInt();
			
			
			if(menu==6) {
				System.out.println("종료합니다.");
			} else {
				System.out.println("첫번째 숫자를 입력해주세요:");
				int num1 = sc.nextInt();
				System.out.println("두번째 숫자를 입력해주세요:");
				int num2 = sc.nextInt();
				
			switch(menu) {
			case 1: System.out.println(num1+"+"+num2+"="+(num1+num2)); break;
			case 2: System.out.println(num1+"-"+num2+"="+(num1-num2)); break;
			case 3: System.out.println(num1+"*"+num2+"="+(num1*num2)); break;
			case 4:
				if(num2 == 0) {
					System.out.println("0은 피연산자가 될 수 없습니다. 두번째 숫자를 다시 입력해주세요.");
				}else {
					System.out.println(num1+"/"+num2+"="+(num1/num2));				
				} break;
			case 5:
				if(num2 == 0) {
					System.out.println("0은 피연산자가 될 수 없습니다. 두번째 숫자를 다시 입력해주세요.");
			}else {
				System.out.println(num1+"%"+num2+"="+(num1%num2));					
			} break;
			default: System.out.println("잘못된 메뉴입니다. 다시 선택해주세요.");
			}
			
			
		} 
		}
		while(menu != 6);
		
		sc.close();

	}

}
