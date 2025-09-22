package day08;

public class Tv {
	// 멤버변수 : brand, power, ch, vol
	private String brand;
	private boolean power;
	private int ch;
	private int vol;
	// 선호채널 배열
	private int[] favor = new int[5];
	private int count;
	
	// 기본생성자, brand만 받는 생성자
	public Tv() { }
	// tv를 생각하면 처음에 전원을 켰을때 채널값과 음량을 0으로 시작하지 않기 때문에
	// 그 값을 넣어주길 원한다면 {}안에 ch = -- , vol = -- 를 넣으면 됨.
	
	// 생성자도 호출이 가능 -> 키워드 : this./this(); 
	// 단, 반드시 첫번째 줄에서 호출 가능
	
	public Tv(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public boolean isPower() {
		return power;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public int getCh() {
		return ch;
	}
	
	public void setCh(int ch) {
		this.ch = ch;
	}
	
	public int getVol() {
		return vol;
	}
	
	public void setVol(int vol) {
		this.vol = vol;
	}
	
	
	// pick() : 선호채널로 등록
	public void pick() { 
		// count는 favor의 번지 역할을 하는 변수
		favor[count] = ch;
		count++;
		System.out.println(ch+"번을 선호채널로 등록합니다.");
	}
	
	
	// favorPrint() : 선호채널 출력
	public void favorPrint() {
		System.out.println("- - 선호채널 목록 - -");
		for(int i=0; i<favor.length; i++) {
			if(favor[i]==0) {
				System.out.println("X");
			} else {
				System.out.println(favor[i]);				
			}
		}
	}
	
	// 메서드 : 
	/* power()
	 * chUp() / chDown() => 0 ~ 20까지 순환구조 -> 1씩 증가 / 감소
	 * volUp() / volDown() => 0 ~ 10 -> 1씩 증가 / 감소
	 					   -> 10이 넘으면 10 고정, 0보다 작으면 음소거라고 출력
	 */
	public void power() {
		power =!power;
	}
	public void print() {
		System.out.println((power?"ON":"OFF"));
	}
	
	public void powerFalsePrint() {
		System.out.println("전원이 꺼져있습니다. \n전원을 켜주세요.");
	}
	
	public void chUp() {
		if(power) {
			if(ch >= 20) {
				ch=0;
			} else {
				ch++;				
			}
			System.out.println("채널번호: "+ch);
		} else {
			powerFalsePrint();
		}
	}
	
	public void chDown() {
		if(power) {
			if(ch <= 0) {
				ch = 20;
			} else {
				ch--;				
			}
			System.out.println("채널번호: "+ch);
		} else {
			powerFalsePrint();
		}
	}
	
	public void volUp() {
		if(power) {
			if(vol == 10) {
				System.out.println("최대 음량입니다.");
			} else {
				vol++;
				System.out.println("음량: "+vol);
			}
		} else {
			powerFalsePrint();
		}
	}
	
	public void volDown() {
		if(power) {
			if(vol == 0) {
				System.out.println("-음소거-");
			} else {
				vol--;
				System.out.println("음량: "+vol);
			} 
		} else {
			powerFalsePrint();
		}
	}
	
	public String toString() {
		return brand;
	}

}