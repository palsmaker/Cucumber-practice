package AmazonImplementation;
//unit level test cases

import java.util.ArrayList;
import java.util.List;

//Implementing the product class
public class Product {

	//making private so that i can use encapsulation
	private String productName;
	private int price;
	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}
	
	//Setting getter and setter so that you can call during runtime
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	public List<String> getProductList(){
		List<String> productList = new ArrayList<>();
		productList.add("Apple MacBook Pro");
		productList.add("Apple MacBook Air");
		productList.add("Apple iPhone 12");
		return productList;
	}
	
}
