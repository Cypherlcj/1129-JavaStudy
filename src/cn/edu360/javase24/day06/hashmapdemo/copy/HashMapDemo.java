/**  
 * @Title:  HashMapDemo.java   
 * @Package cn.edu360.javase24.day06.hashmapdemo.copy   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: CypherLCJ     
 * @date:   2018��11��29�� ����5:07:37   
 * @version V1.0 
 */  
package cn.edu360.javase24.day06.hashmapdemo.copy;

import java.util.HashMap;
import java.util.Set;

/**   
 * @ClassName:  HashMapDemo   
 * @Description:TODO(������һ�仰��������������)   
 * @author: Cypherlcj 
 * @date:   2018��11��29�� ����5:07:37   
 *     
 */
public class HashMapDemo {
     public static void main(String[] args) {
		//
    	 HashMap<String, String>map1=new HashMap<>();
    	 
    	 map1.put("1","�װٺ�");
    	 map1.put("2","wang");
    	 map1.put("3","zha");
    	 map1.put("5","wattng");
    	 String aString =map1.get("1");
    	 System.out.println(aString);
    	 
    	 int size=map1.size();
    	 System.out.println(size);
    	 
    	 String remove=map1.remove("3");
    	 System.out.println(remove);
    	 
    	 boolean c=map1.containsKey("5");
    	 System.out.println(c);
    	 
    	 Set<String>keySet=map1.keySet();
	}
}



































