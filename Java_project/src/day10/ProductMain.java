package day10;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// Product class : name, price
		// Order class : Product 상속받기 / 수량(count), 금액(total)
		// 주문 출력 (하나의 주문에 대한 출력)
		// 종료 키워드 (주문 종료가 가능하게 생성 -> n)
		
		/* 1. 전체 메뉴 보여주기
		   2. 주문 >> 메뉴, 수량 받기
		   3. 주문이 완료되었습니다. 
			  => 전체 주문 내역 확인 출력
		 */
		
		Product [] menu = new Product[5];
		
		menu[0] = new Product("김밥", 3000);
		menu[1] = new Product("라면", 3500);
		menu[2] = new Product("떡볶이", 4000);
		menu[3] = new Product("음료수", 1500);
		menu[4] = new Product("돈까스", 7000);
		
		// 주문을 담는 변수가 필요
		Order[] order = new Order[5];
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		char yes = 'y';
		while (yes != 'n') {
			System.out.println("주문하시겠습니까? (y/n)");
			yes = sc.next().charAt(0);
			
			if(yes == 'y') {
				for(int i=0; i<menu.length; i++) {
					System.out.println((i+1)+"."+menu[i]);
				}
				System.out.println("메뉴를 선택해주세요 >>");
				int menuNum = sc.nextInt();
				
				System.out.println("주문 수량을 입력해주세요 >>");
				int count = sc.nextInt();
				
				Order o = new Order(menu[menuNum-1].getItem1(), 
						menu[menuNum-1].getPrice1() , count);
				order[cnt] = o;	
				cnt++;
			} else if(yes == 'n') {
				System.out.println("주문을 종료합니다.");
				break; 
			} else {
				System.out.println("y 또는 n을 선택해주세요.");
			}
		}
		System.out.println("--주문내역 출력--");
		int sum = 0;
		for(int i=0; i<cnt; i++) {
			System.out.println((i+1)+"."+order[i]);
			sum += order[i].getTotal();
		}
		
		System.out.println("총 지불금액 : "+sum);
		
		sc.close();
		
	}

}

class Order extends Product{
	// product : item, price, toString
	
	private int count;
	private int total;
	
	public Order(String item, int price, int count) {
		super(item, price);
		this.count = count;
		this.total = count * price;
	}
	
	// total 계산 메서드
	public void totalCal() {
		this.total = super.getPrice1() * this.count;
	}
	
	public void printMenu() {
		System.out.println("메뉴: "+super.getItem1()+" 수량: "+this.count
							+ "개 가격: "+this.total);
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	
	
	
}