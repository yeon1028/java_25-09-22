package day12;

public class CustomerMain {

	public static void main(String[] args) {
		/* 백화점 고객
		   - 일반고객 / Gold 고객(할인有) / VIP 고객(할인有)
		   
		  * 고객 => Customer 클래스
		    - 멤버변수 ::
		      - 고객ID : int customerID
		      - 고객이름 : String customerNAME
		      - 고객등급 : String customerGrade
		      - 보너스포인트 : int bonusPoint
		      - 적립비율 : double bonusRatio
		      
		      - 기본 customerGrade = Silver
		      - bonusRatio = 0.01 => 구매금액의 1% 적립
		      
		      - 메서드 ::
		      1. 보너스 적립 계산 메서드 (calcPrice)
		         -> 구매금액의 적립 보너스를 계산 => bonusPoint 구매할때마다 적립 누적
		         -> 보너스 적립, 할인여부도 체크해서 구매 금액을 리턴
		         
		      2. 출력메서드
		         -> 홍길동 님은 VIP고객이며, 현재 보너스포인트는 1000점입니다.
		            전담 상담사는 짱구이고, 번호는 1111입니다. (VIP만 해당) 
		      
		      - 등급 : Silver(기본) / Gold / VIP
		      1. Silver(기본) 등급 : 제품 구입할 때 0% 할인 / 보너스 포인트는 1% 적립
		      2. Gold 등급 : 제품 구입할 때 10% 할인 / 보너스 포인트는 2% 적립
		      3. VIP 등급 : 제품 구입할 때 10% 할인 / 보너스 포인트는 3% 적립
		      			 - 전담 상담사를 멤버변수에 추가(agentName, agentNum)
		      			   
		      - Customer => Silver
		      
		      - GoldCustomer extends Customer{
		      		기본 메서드 오버라이딩해서 사용
		      	}
		      	
		      - VIPCustomer extends Customer{
		      		추가 + 기본 메서드 오버라이딩해서 사용
		        }
		 */
		
		// 고객 10명을 추가
		Customer[] customerList = new Customer[10];
		
		customerList[0] = new Customer(1111, "홍길동");
		customerList[1] = new GoldCustomer(2222, "신짱구");
		customerList[2] = new VIPCustomer(3333, "강감찬", 1004, "짱아");
		customerList[3] = new Customer(4444, "이순신");
		customerList[4] = new VIPCustomer(5555, "최고객", 1002, "영철");
		customerList[5] = new Customer(6666, "콩쥐");
		customerList[6] = new GoldCustomer(7777, "심청이");
		customerList[7] = new Customer(8888, "팥쥐");
		customerList[8] = new Customer(9999, "김고객");
		customerList[9] = new GoldCustomer(1000, "박채연");
		
		System.out.println("- - 할인율과 포인트 계산 출력 - -");
		int price = 100000;
		for(int i=0; i<customerList.length; i++) {
			int salePrice = customerList[i].calcPrice(price);
			System.out.println(customerList[i].getCustomerName()+
					" 금액: "+salePrice+" / 보너스포인트 "+customerList[i].bonusPoint);
		}
		
		System.out.println();
		System.out.println(" - - 고객 정보 리스트 - - ");
		for(int i=0; i<customerList.length; i++) { 
			customerList[i].printInfo();
		}
		
		
		// 다운캐스팅 사용 예시.
		// agentNum = 1004(짱아) 퇴사 => 1003(철수)
		
		for(int i=0; i<customerList.length; i++) {
			if(customerList[i] instanceof VIPCustomer) {
				VIPCustomer vip = (VIPCustomer)customerList[i];
				if(vip.getAgentNum() == 1004) {
					vip.setAgentNum(1003);
					vip.setAgentName("철수");
				}
			}
		}
		
		System.out.println();
		System.out.println(" - - 고객 정보 리스트 - - ");
		for(int i=0; i<customerList.length; i++) { 
			customerList[i].printInfo();
		}
		
		System.out.println();
		System.out.println(" - - VIP 고객 정보 리스트 - -");
		for(int i=0; i<customerList.length; i++) { 
			if(customerList[i].customerGrade.equals("VIP"))
			customerList[i].printInfo();
		}
	}

}
