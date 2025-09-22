package day18_Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	// 은행명
	// 예금주
	
	private String bankName;
	private List<Customer> customers = new ArrayList<>(); // 객체 생성
	
	public Bank() {} // 기본 생성자
	
	public Bank(String bankName) {
		this.bankName = bankName;
	}
	
	// customer 추가 - customer에 대한 객체가 들어오면 내 customers에 담아주기
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	// customer 찾기
	public Customer findCustomer(String accountNumber) {
		for (Customer c : customers) {
			if(c.getAccountNum().equals(accountNumber))
				return c;
		}
		return null; // 찾는 사람이 없다면
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
}