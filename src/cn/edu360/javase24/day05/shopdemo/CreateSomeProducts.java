/**  
 * @Title:  CreateSomeProducts.java   
 * @Package cn.edu360.javase24.day05.shopdemo   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: CypherLCJ     
 * @date:   2018年11月29日 上午4:42:52   
 * @version V1.0 
 */  
package cn.edu360.javase24.day05.shopdemo;

/**   
 * @ClassName:  CreateSomeProducts   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Cypherlcj 
 * @date:   2018年11月29日 上午4:42:52   
 *     
 */
public class CreateSomeProducts {
   
	public static void create(ProductManagement pmgdt) {
		//
		Product pdt1=new Product();
		pdt1.setProductId("1");
		pdt1.setProductName("方便面");
		pdt1.setPrice(4.0);
		pdt1.setNum(3);
		
		Product pdt2=new Product("2", "火腿肠", 2.4, 4);
	}
}
