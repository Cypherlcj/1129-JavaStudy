/**  
 * @Title:  CartManagerTest.java   
 * @Package cn.edu360.javase24.day05.shopdemo   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: CypherLCJ     
 * @date:   2018��11��29�� ����4:27:07   
 * @version V1.0 
 */  
package cn.edu360.javase24.day05.shopdemo;

/**   
 * @ClassName:  CartManagerTest   
 * @Description:TODO(������һ�仰��������������)   
 * @author: Cypherlcj 
 * @date:   2018��11��29�� ����4:27:07   
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
