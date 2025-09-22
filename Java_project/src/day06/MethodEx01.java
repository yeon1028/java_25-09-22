package day06;

import java.util.Scanner;

public class MethodEx01 {

	public static void main(String[] args) {
		/* 계산기 만들기
		   -- menu --
		   1.더하기 | 2.빼기 | 3.곱하기 | 4.나누기 | 5.나머지 | 6.종료
		   >> 메뉴선택 > 1
		   >> 숫자를 입력하세요(두 정수) > 1 5
		   >> 결과 : 1 + 5 = 6
		   
		 * 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지는 Method03에서 만든 메서드를 호출
		 */
		
		// Method03의 클래스에 있는 메서드를 사용하기 위해서는 클래스의 객체화를 해야한다.
		// 객체로 생성하는 키워드 new		
		Method03 m3 = new Method03();
		// 메서드 호출 -> 객체명.메서드명(매개변수)
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("--menu--");
			System.out.println("1.더하기 | 2.빼기 | 3.곱하기 | 4.나누기 | 5.나머지 | 6.종료");
			System.out.println(">> 메뉴 선택 >>");
			int menu = sc.nextInt();
			
			if(menu == 6) {
				System.out.println("종료합니다.");
				break;
			}
			if(menu > 6 || menu <=0) {
				System.out.println("잘못된 메뉴입니다.");
				System.out.println("메뉴를 다시 선택해주세요.");
				continue;
			}
			
			System.out.println("두 숫자를 입력해주세요: ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			switch(menu) {
			case 1:
				int a = m3.a(num1, num2);
				m3.print(num1, num2, "+", a);
//				System.out.println(num1+"+"+num2+"="+m3.a(num1,num2));
				break;
			case 2:
				int b = m3.b(num1, num2);
				m3.print(num1, num2, "-", b);
//				System.out.println(num1+"-"+num2+"="+m3.b(num1,num2));
				break;
			case 3:
				int c = m3.c(num1, num2);
				m3.print(num1, num2, "*", c);
//				System.out.println(num1+"*"+num2+"="+m3.c(num1,num2));
				break;
			case 4:
				double d = m3.d(num1, num2);
				m3.print(num1, num2, "/", d);
//				double d = m3.d(num1, num2);
//				if(d == -9999) {
//					System.out.println("피연산자가 0일 수 없습니다.");
//					System.out.println("메뉴를 다시 선택해주세요.");
//				} else {
//					System.out.println(num1+"/"+num2+"="+d);						
//				}
				break;					
			case 5:
				int e = m3.e(num1, num2);
				m3.print(num1, num2, "%", e);
//				int e = m3.e(num1, num2);
//				if(e == -9999) {
//					System.out.println("피연산자가 0일 수 없습니다.");
//					System.out.println("메뉴를 다시 선택해주세요.");
//				}else {
//					System.out.println(num1+"%"+num2+"="+e);
//				}
				break;					
			}
		} 
		while(true);
		
		sc.close();
		
	}

}
