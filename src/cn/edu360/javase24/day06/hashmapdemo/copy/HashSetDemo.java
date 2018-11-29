/**  
 * @Title:  HashSetDemo.java   
 * @Package cn.edu360.javase24.day06.hashmapdemo.copy   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: CypherLCJ     
 * @date:   2018��11��29�� ����5:30:24   
 * @version V1.0 
 */  
package cn.edu360.javase24.day06.hashmapdemo.copy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import cn.edu360.javase24.day05.shop.Product;

/**   
 * @ClassName:  HashSetDemo   
 * @Description:TODO(������һ�仰��������������)   
 * @author: Cypherlcj 
 * @date:   2018��11��29�� ����5:30:24   
 *     
 */
public class HashSetDemo {
    //
	public static void main(String[] args) {
		HashSet<String> set1=new HashSet<>();
		
		set1.add("�װٺ�");
		set1.add("dong");
		set1.add("zhang");
		set1.add("tian");
		set1.add("wen");
		set1.add("zhangwen"); 
		
		//get set lenth
		int size=set1.size();
		System.out.println(size);
		
		//remove element
		set1.remove("zhangwen");
		System.out.println(set1.size());
		
		//foreach set ,user iterator
		 Iterator<String>iterator=set1.iterator();
		 while (iterator.hasNext()) {
		   String next=iterator.next();
		   System.out.println(next);
		 }
		 
		 //
		 for(String tmp:set1) {
			 System.out.println(tmp);
		 }
		 
		 int[] arr=new int[] {3,5,7,9,2};
		 for (int i : arr) {
			System.out.println(i);
		}
		 
		 //arraylist
		 ArrayList<Product>pdts=new ArrayList<>();
		 pdts.add(new Product("1", "����", 12.46f, 2));
		 pdts.add(new Product("2", "����", 12.46f, 3));
		 pdts.add(new Product("3", "ϴ�·�", 12.44f, 1));
		 
		 for(Product p:pdts) {
			 System.out.println(p.getProductName());
		 }
		 
		 
		 
	}
}























