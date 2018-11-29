/**  
 * @Title:  CartManagerTest.java   
 * @Package cn.edu360.javase24.day05.shopdemo   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: CypherLCJ     
 * @date:   2018年11月29日 上午4:27:07   
 * @version V1.0 
 */  
package cn.edu360.javase24.day05.shopdemo;

/**   
 * @ClassName:  CartManagerTest   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Cypherlcj 
 * @date:   2018年11月29日 上午4:27:07   
 *     
 */
public class CartManagerTest {
    //
	public static void main(String[] args) {
		CartManagement cartManagement=new CartManagement();
		//
		cartManagement.addToCart("pdt1:2,pdt3:4");
		cartManagement.showCart();
	}
 }
