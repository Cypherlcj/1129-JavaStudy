package cn.edu360.javase24.day05.shop;

import java.util.ArrayList;

public class CartManagement {
	
	private ArrayList<Product> cart = new ArrayList<>();
	

	// �����ﳵ�������Ʒ  ����Ĳ��������¸�ʽ��   pdt1:1,pdt2:3,pdt3:1
	public void addProdcutToCart(String selectPdts) {

		String[] split = selectPdts.split(",");
		
		for(int i=0;i<split.length;i++) {
			String[] pdtAndNum = split[i].split(":");
			
			Product product = new Product();
			
			product.setProductId(pdtAndNum[0]);
			product.setNum(Integer.parseInt(pdtAndNum[1]));
			// ��취��ȫ��Ʒ���ͼ۸�
			
			cart.add(product);
		}
		
	}
	
	
	// �ӹ��ﳵ���Ƴ���Ʒ
	
	
	
	// ��ӡ���ﳵ��Ϣ
	public void showCart() {
		
		for(int i=0;i<cart.size();i++) {
			System.out.println(cart.get(i));
		}
		
	}
	
	
	
	// �޸Ĺ��ﳵ�е���Ʒ����
	
	
	
}
