/**  
 * @Title:  CreateSomeProducts.java   
 * @Package cn.edu360.javase24.day05.shopdemo   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: CypherLCJ     
 * @date:   2018��11��29�� ����4:42:52   
 * @version V1.0 
 */  
package cn.edu360.javase24.day05.shopdemo;

/**   
 * @ClassName:  CreateSomeProducts   
 * @Description:TODO(������һ�仰��������������)   
 * @author: Cypherlcj 
 * @date:   2018��11��29�� ����4:42:52   
 *     
 */
public class CreateSomeProducts {
   
	public static void create(ProductManagement pmgdt) {
		//
		Product pdt1=new Product();
		pdt1.setProductId("1");
		pdt1.setProductName("������");
		pdt1.setPrice(4.0);
		pdt1.setNum(3);
		
		Product pdt2=new Product("2", "���ȳ�", 2.4, 4);
	}
}
