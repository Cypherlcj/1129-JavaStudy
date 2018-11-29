package cn.edu360.javase24.day05.shop;

public class CartManagementTest {
	
	public static void main(String[] args) {
		CartManagement cartManagement = new CartManagement();
		cartManagement.addProdcutToCart("pdt1:2,pdt3:5");
		
		cartManagement.showCart();
		
		
		
	}

}
