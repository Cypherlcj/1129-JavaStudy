/**  
 * @Title:  UserMenu.java   
 * @Package cn.edu360.javase24.day07.interfacedemo2   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: CypherLCJ     
 * @date:   2018��11��29�� ����7:21:22   
 * @version V1.0 
 */  
package cn.edu360.javase24.day07.interfacedemo2;

import java.util.Scanner;

/**   
 * @ClassName:  UserMenu   
 * @Description:TODO(������һ�仰��������������)   
 * @author: Cypherlcj 
 * @date:   2018��11��29�� ����7:21:22   
 *     
 */
public class UserMenu {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//
		UserServiceManage userServiceManage=new UserServiceManageImpl() ;
			boolean flag=true;
		while(flag=true) {	 
		
		System.out.println("1.��¼;2.ע��");
		String nextLine=sc.nextLine();
		switch (nextLine) {
		case "1":
			System.out.println("�������˺�:");
			String username=sc.nextLine();
			System.out.println("����������:");
			String pwd=sc.nextLine();
			//
			boolean login=userServiceManage.login(username,pwd);
			if(login) {
				System.out.println("��ϲ������¼�ɹ�");
			}else {
				System.out.println("��Ǹ�������û��������벻��ȷ");
			}
			
			break;
		case "2":
			System.out.println("�������û�����");
			String name=sc.nextLine();
			System.out.println("���������룺");
			String pwd1=sc.nextLine();
			System.out.println("���ٴ���������");
			String pwd2=sc.nextLine();
			
			//
			String res=userServiceManage.regist(name,pwd1,pwd2);
			//System.out.println(res);
			switch (res) {
			case "1":
				System.out.println("�������������벻һ��");
				break;
			case "2":
				System.out.println("����ѡ���˺��ѱ�ע��.");
				break;
			case "3":
				System.out.println("��ϲ����ע��ɹ�");
				break;
			default:
				break;
			}
			break;
			
		case "quit":
			System.out.println("bye......");
			flag = false;
			break;			
			 
	}
}

}

}

























