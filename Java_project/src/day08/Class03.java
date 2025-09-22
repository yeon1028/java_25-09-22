package day08;

public class Class03 {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.setName("k5");
		c.setColor("흰색");
		c.setYear(2024);
		System.out.println(c.toString());
		c.power();
		c.print();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.power();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.power();
		c.print();
		c.powerFalsePrint();
		
		System.out.println("----------");
		Car c2 = new Car();
		System.out.println(c2);
		System.out.println("----------");
		c2.setName("모닝");
		c2.setColor("은색");
		c2.setYear(2023);
		System.out.println(c2);
		c2.power();
		c2.print();
		for(int i=0; i<6; i++) {
			c2.speedUp();
		}
		c2.power();
		c2.print();
		for(int i=0; i<6; i++) {
			c2.speedDown();
		}
		c2.power();
		c2.print();
		
		System.out.println("----------");
		Car c3 = new Car("소나타", "검정", 2020);
		// toString 호출은 .toString() 안써도 호출가능.
		System.out.println(c3);
	}

}


class Car{
	// 멤버변수 : name, color, year, power, speed => private
	// 		   (string, string, int, boolean, int)
	private String name;
	private String color;
	private int year;
	private boolean power;
	// boolean의 기본은 false
	private int speed;
	
	// 생성자 위치 : 멤버변수 아래 (메서드 위)
	/* 생성자는 객체를 생성할 때 초기값을 지정해주는 역할
	 * 기본생성자 : 컴파일러가 컴파일 시 자동으로 제공 (생성자가 존재하면 주지않음)
	   - object = null / 숫자 = 0 / boolean = flase
	 * 생성자는 여러개 생성 가능(생성자 오버로딩)
	 * 생성자 오버로딩 조건 : 매개변수의 개수가 다르거나, 타입이 달라야 함.
	 * 생성자를 사용자가 생성하면 기본 생성자는 사라짐.
	 * 일반적으로 생성자를 만들때 꼭 기본생성자와 같이 생성.
	 * public 클래스명(매개변수) {
	   	   멤버변수 setting값
	   }
	 * 생성자는 리턴타입이 없는 메서드와 같은 형태
	 */
	
	// 기본생성자
	public Car() {	}
	
	// 매개변수를 받는 생성자
	public Car(String name, String color, int year) { 
		this.name = name;
		this.color = color;
		this.year = year;
	}
	
	// 메서드 => public
	// 시동 켜기 / 시동 끄기 메서드 생성
	// 꺼짐 -> 켜짐 | 켜짐 -> 꺼짐
	public void power() {
		// power를 호출하면 시동이 켜짐 => 다시 호출하면 시동이 꺼짐
		// 속도가 있으면 시동을 끌 수 없음.
		if(speed == 0) {
			power = !power;					
		} else {
			System.out.println("error!");
		}
	}
	
	// power, speed 상태를 print()
	public void print() {
		System.out.println((power?"ON":"OFF")+" / "+speed);
	}
	
	public void powerFalsePrint() {
		System.out.println("시동이 꺼져있습니다. \n시동을 먼저 켜주세요.");
	}
	
	// speedUP (액셀 밟기)
	public void speedUp() {
		if(power) {
			if(speed>=100) {
				speed=100;
			} else {
				speed+=10;
			}
			print();			
		} else {
			powerFalsePrint();
		}
	}
	
	// speedDown(브레이크 밟기)
	public void speedDown() {
		if(power) {
			if(speed<=0) {
				speed=0;
			} else {
				speed-=10;
			}
			print();
		} 
	}
	
	// getter / setter
	public String getName() {
		return this.name;
	}
	public String getColor() {
		return this.color;
	}
	public int getYear() {
		return this.year;
	}
	public boolean isPower() {
		return this.power;
	}
	public int getSpeed() {
		return this.speed;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	// toString
	public String toString() {
		return name+", "+color+", "+year;
	}
	
}
