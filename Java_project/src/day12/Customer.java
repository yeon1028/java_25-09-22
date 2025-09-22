package day12;

class VIPCustomer extends Customer {
	private double saleRatio;
	
	// agentNum / agentName
	private int agentNum;
	private String agentName;
	
	public VIPCustomer() { }
	public VIPCustomer(int id, String name, int agentNum, String agentName) {
		this.customerID = id;
		this.customerName = name;
		this.agentNum = agentNum;
		this.agentName = agentName;
		this.customerGrade = "VIP";
		this.bonusRatio = 0.03;
		this.saleRatio = 0.1;
	}

	
	@Override
	public int calcPrice(int price) {
		super.calcPrice(price);
		return price - (int)(price * this.saleRatio);
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("전담 상담사는 " + agentName + "이고, 번호는 " + agentNum + "입니다.");
	}
	
	
	public double getSaleRatio() {
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	public int getAgentNum() {
		return agentNum;
	}
	public void setAgentNum(int agentNum) {
		this.agentNum = agentNum;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	
}

class GoldCustomer extends Customer {
	// gold / vip -> 할인율 존재
	private double saleRatio;
	
	public GoldCustomer() { }
	public GoldCustomer(int id, String name) {
		super(id, name);
		this.customerGrade = "Gold";
		this.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}
	

	public double getSaleRatio() {
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}

	
	@Override
	public int calcPrice(int price) {
		// 부모의 메서드 중 자식이 수정해야될 내용이 있는 메서드만 오버라이드하면 된다!
		// 구매 금액의 본인의 비율만큼 곱해서 보너스 포인트를 누적하고, 구매금액을 리턴하는 메서드
		super.calcPrice(price);
		return price - (int)(price * this.saleRatio);
	}
	
}


public class Customer {

	 protected int customerID;
	 protected String customerName;
	 protected String customerGrade;
	 protected int bonusPoint;
	 protected double bonusRatio;
	 
	 public Customer() { }
	 
	 public Customer(int customerID, String customerName) {
		 this.customerID = customerID;
		 this.customerName = customerName;
		 this.customerGrade = "Silver";
		 this.bonusRatio = 0.01;
	 }
	 
	 // 리턴 타입 : 할인율을 적용한 구매금액 (int) / 매개변수 : int price
	 public int calcPrice(int price) {
		 int point = (int)(price * bonusRatio);
		 this.bonusPoint += point;
		 return price;
	 }
	 
	 public void printInfo() {
		 System.out.println(customerName + " 님은 " + customerGrade + " 고객이며, 현재 보너스 포인트는 "
				 + bonusPoint + "점 입니다.");
	 }

	 
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
}