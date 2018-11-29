package cn.edu360.javase24.day06.hashmapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import cn.edu360.javase24.day05.shop.Product;

/**
 * hashmap��Ӧ����ϰ2��
 * 
 * @author ThinkPad
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

		HashMap<String, Product> pdtMap = new HashMap<>();
		pdtMap.put(p1.getProductId(), p1);
		pdtMap.put(p2.getProductId(), p2);
		pdtMap.put(p3.getProductId(), p3);
		pdtMap.put(p4.getProductId(), p4);
		pdtMap.put(p5.getProductId(), p5);
		pdtMap.put(p6.getProductId(), p6);

		// 2�������ҳ�hashmap�в�Ʒ�����ظ������ݣ�����ӡ���������ظ������ݲ�Ʒid��

		// ����pdtMap����һȡ�������product����Ȼ����һ���µ�hashmap
		// Ȼ���жϣ����product�����name����hashmap�Ƿ���ڣ�����в����ڣ������product�����name��Ϊkey��id��Ϊvalue����һ���µ�hashmap��
		// ����Ѵ��ڣ���֮ǰ��idƴ�����product��id��Ϊvalue���ǽ�ȥ

		HashMap<String, String> newMap = new HashMap<>();

		Set<String> keySet = pdtMap.keySet();
		for (String id : keySet) {
			Product p = pdtMap.get(id);
			if (newMap.containsKey(p.getProductName())) {
				String id_value = newMap.get(p.getProductName()); // ����map��ȡ���Ѵ��ڵĲ�Ʒid
				newMap.put(p.getProductName(), id_value + "," + p.getProductId()); // ����map�еĲ�Ʒidƴ����δ���map��ȡ���Ĳ�Ʒ��id
			} else {

				newMap.put(p.getProductName(), p.getProductId());
			}
		}

		Set<String> keySet2 = newMap.keySet();
		for (String name : keySet2) {
			String ids = newMap.get(name);
			System.out.println(ids + "-->" + name);

		}

		// 1,4-->�㽶
		// 3,5,6-->����

	}

}
