/**  
 * @Title:  XXServiceTest.java   
 * @Package cn.edu360.javase24.day07.interfacedemo   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: CypherLCJ     
 * @date:   2018��11��29�� ����6:55:52   
 * @version V1.0 
 */  
package cn.edu360.javase24.day07.interfacedemo;

import java.util.HashMap;

/**   
 * @ClassName:  XXServiceTest   
 * @Description:TODO(������һ�仰��������������)   
 * @author: Cypherlcj 
 * @date:   2018��11��29�� ����6:55:52   
 *     
 */
public class XXServiceTest {
   public static void main(String[] args) {
	 XXService xxService=new XXServiceImpl();
	 
	 //1
	 String step1=xxService.step1();
	 System.out.println(step1);
	 //2.
	 xxService.step2("1");
	 //3.
	 HashMap<String, Integer>step3=xxService.step3(8);
	 System.out.println(step3.get("1"));
}
}




































