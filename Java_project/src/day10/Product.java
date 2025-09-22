package day10;

public class Product {
	
	private String item1;
	private int price1;
	
	public Product() {}
	
	public Product(String item, int price) {
		this.item1 = item;
		this.price1 = price;
	}
	
	public void insertProduct(String item, int price) {
		this.item1 = item;
		this.price1 = price;
	}

	public String getItem1() {
		return item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public int getPrice1() {
		return price1;
	}

	public void setPrice1(int price1) {
		this.price1 = price1;
	}

	@Override
	public String toString() {
		return "Product >> item: " + item1 + ", price: " + price1;
	} 

}
