/**  
 * @Title:  ProductManagement.java   
 * @Package cn.edu360.javase24.day05.shopdemo   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: CypherLCJ     
 * @date:   2018年11月29日 上午4:08:17   
 * @version V1.0 
 */  
package cn.edu360.javase24.day05.shopdemo;

import java.util.ArrayList;

/**   
 * @ClassName:  ProductManagement   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Cypherlcj 
 * @date:   2018年11月29日 上午4:08:17   
 *     
 */
public class ProductManagement {
      
	//
  private 	ArrayList<Product> pdts=new ArrayList<>();
	
	public void addProduct(Product pdt) {
		this.pdts.add(pdt);
	}
	
	public void showProduct() {
	 for(int i=0;i<pdts.size()-1;i++ ) {
		 System.out.println(pdts.get(i));
	 }
	}
}

























