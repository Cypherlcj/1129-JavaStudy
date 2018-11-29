package cn.edu360.javase24.day06.hashmapdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import cn.edu360.javase24.day05.shop.Product;

/**
 * HashSet��һ��������������
 * һ�������HashSet�п���װ��������
 * hashset�е����ݲ����ظ�
 * hashset�����ݴ洢�������
 * @author ThinkPad
 *
 */
public class HashSetDemo {
	
	public static void main(String[] args) {
		
		
		HashSet<String> set1 = new HashSet<>();
		
		set1.add("�װٺ�");
		set1.add("����");
		set1.add("�˽���");
		set1.add("�����");
		set1.add("�Է���");
		set1.add("���Ѿ�");
		set1.add("��ʩ");
		
		// ��ȡset�ĳ���
		int size = set1.size();
		System.out.println(size);
		
		
		// �Ƴ�Ԫ��
		set1.remove("����");
		System.out.println(set1.size());
		
		
		// ����set����:�õ�������ȡ����
		Iterator<String> iterator = set1.iterator();
		while(iterator.hasNext()) {   // hasNext()�������������ơ�����ָ�롱�����ж��Ƿ�������
			String next = iterator.next();   // next()��ȡ��ǰ������ָ�롱�ϵ�����
			System.out.println(next);
		}
		
		// ��ǿforѭ��:�ڲ���װ�˵�������ʹ��
		for(String tmp:set1) {
			System.out.println(tmp);
		}
		
		
		// ����Ҳ��������ǿforѭ��������
		int[] arr = new int[] {3,5,7,9,2};
		for(int x:arr) {
			System.out.println(x);
		}
		
		
		// arraylistҲ��������ǿforѭ��������
		ArrayList<Product> pdts = new ArrayList<>();
		pdts.add(new Product("1", "����", 12.45f, 2));
		pdts.add(new Product("2", "����", 12.45f, 3));
		pdts.add(new Product("3", "ϴ�·�", 12.45f, 1));
		
		for(Product p:pdts) {
			System.out.println(p.getProductName());
		}
	}
}
