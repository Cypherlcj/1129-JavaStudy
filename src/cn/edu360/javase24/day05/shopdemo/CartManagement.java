/**  
 * @Title:  CartManagement.java   
 * @Package cn.edu360.javase24.day05.shopdemo   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: CypherLCJ     
 * @date:   2018年11月29日 上午4:16:53   
 * @version V1.0 
 */  
package cn.edu360.javase24.day05.shopdemo;

import java.util.ArrayList;

/**   
 * @ClassName:  CartManagement   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Cypherlcj 
 * @date:   2018年11月29日 上午4:16:53   
 *     
 */
public class CartManagement {
    
	//
	ArrayList<Product> pdtToCart=new ArrayList<>();
	//
	public void addToCart(String selectPdts ) {
		String[] split=selectPdts.split(",");
		for (int i=0;i<split.length-1;i++) {
			String[] pdtNum=split[i].split(":");
			 
			//
			Product pdt=new Product();
			pdt.setProductId(pdtNum[0]);
			pdt.setNum(Integer.parseInt(pdtNum[1]));
			
			pdtToCart.add(pdt);
		}
	}
	
	public void showCart() {
		for(int i=0;i<pdtToCart.size();i++) {
			System.out.println(pdtToCart.get(i));
		}
	}
}







































