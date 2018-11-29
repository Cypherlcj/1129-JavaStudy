/**  
 * @Title:  HashMapTest2.java   
 * @Package cn.edu360.javase24.day06.hashmapdemo.copy   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: CypherLCJ     
 * @date:   2018��11��29�� ����5:47:12   
 * @version V1.0 
 */  
package cn.edu360.javase24.day06.hashmapdemo.copy;

import java.util.HashMap;
import java.util.Set;

import cn.edu360.javase24.day05.shop.Product;

/**   
 * @ClassName:  HashMapTest2   
 * @Description:TODO(������һ�仰��������������)   
 * @author: Cypherlcj 
 * @date:   2018��11��29�� ����5:47:12   
 *     
 */
public class HashMapTest2 {
   public static void main(String[] args) {
	// 1���켸��product���󣬷���һ��hashmap��
			Product p1 = new Product("1", "�㽶", 20, 2);
			Product p2 = new Product("2", "����", 10, 2);
			Product p3 = new Product("3", "����", 120, 2);
			Product p4 = new Product("4", "�㽶", 20, 2);
			Product p5 = new Product("5", "����", 120, 2);
			Product p6 = new Product("6", "����", 120, 2);
			
			HashMap<String, Product>pdtMap=new HashMap<>();
			pdtMap.put(p1.getProductId(), p1);
			pdtMap.put(p2.getProductId(), p2);
			pdtMap.put(p3.getProductId(), p3);
			pdtMap.put(p4.getProductId(), p4);
			pdtMap.put(p5.getProductId(), p5);
			pdtMap.put(p6.getProductId(), p6);
			
			HashMap<String, String>newMap=new HashMap<>();
			
			Set<String>keySet=pdtMap.keySet();
			for(String id:keySet) {
				Product p=pdtMap.get(id);
				if(newMap.containsKey(p.getProductName())) {
					String id_value=newMap.get(p.getProductName());
					newMap.put(p.getProductName(), id_value+","+p.getProductId());
				}else {
					newMap.put(p.getProductName(), p.getProductId());
				}
			}
			Set<String>keySet2=newMap.keySet();
			for(String name:keySet2) {
				String ids=newMap.get(name);
				System.out.println(ids+"-->"+name);
			}
}
}






















