/**  
 * @Title:  HashSetDemo.java   
 * @Package cn.edu360.javase24.day06.hashmapdemo.copy   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: CypherLCJ     
 * @date:   2018年11月29日 上午5:30:24   
 * @version V1.0 
 */  
package cn.edu360.javase24.day06.hashmapdemo.copy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import cn.edu360.javase24.day05.shop.Product;

/**   
 * @ClassName:  HashSetDemo   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Cypherlcj 
 * @date:   2018年11月29日 上午5:30:24   
 *     
 */
public class HashSetDemo {
    //
	public static void main(String[] args) {
		HashSet<String> set1=new HashSet<>();
		
		set1.add("白百何");
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
		 pdts.add(new Product("1", "肥皂", 12.46f, 2));
		 pdts.add(new Product("2", "香皂", 12.46f, 3));
		 pdts.add(new Product("3", "洗衣粉", 12.44f, 1));
		 
		 for(Product p:pdts) {
			 System.out.println(p.getProductName());
		 }
		 
		 
		 
	}
}























