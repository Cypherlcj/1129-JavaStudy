/**  
 * @Title:  ShopMenu.java   
 * @Package cn.edu360.javase24.day05.shopdemo   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: CypherLCJ     
 * @date:   2018��11��29�� ����4:52:54   
 * @version V1.0 
 */  
package cn.edu360.javase24.day05.shopdemo;

import java.util.Scanner;

/**   
 * @ClassName:  ShopMenu   
 * @Description:TODO(������һ�仰��������������)   
 * @author: Cypherlcj 
 * @date:   2018��11��29�� ����4:52:54   
 *     
 */
public class ShopMenu {
   //
	public static void main(String[] args) {
		ProductManagement pmgmt=new ProductManagement();
		//
		CreateSomeProducts.create(pmgmt);
		
		//
		CartManagement cartMgmt=new CartManagement();
		
		System.out.println("��ӭ������Сţ�̳�����ѡ����Ҫ���еĲ���");
		Scanner scanner=new Scanner(System.in);
		
		boolean flag=true;
		while(flag) {
			System.out.println();
			System.out.println();
			System.out.println("1.�����Ʒ; 2.����; 3.�鿴���ﳵ; 4.�޸Ĺ��ﳵ; 5.�ύ����;6.����;7.�˳�");
			
			String command=scanner.nextLine();
			
			switch (command) {
			case "1":
				pmgmt.showProduct();
				break;
				 
            case "2":
            	System.out.println("��ѡ������Ҫ�������Ʒ����ʽ�磺 pdt1:1,pdt2:3");
            	String selectPdts=scanner.nextLine();
            	
            	cartMgmt.addToCart(selectPdts);
            	break;
            case "3":
            	System.out.println("��Ĺ��ﳵ���Լ���");
            	break;
            case "4":
            	System.out.println("����û�գ����Լ���취ȥ�޸İ�");
            	break;
            case "5":
            	System.out.println("����û�գ����Լ���취ȥ�ύ������");
            case "6":
            	System.out.println("��æ��Ҳ����Ǯ");
            	break;
            	case "7":
            		flag=false;
            		break;
			default:
				System.out.println("��sb���㣬�㲻�ῴ�˵�����û��ѧ������ʶ�ְ�.....");
				break;
			}
		}
	}
}


























