/**  
 * @Title:  UserMenu.java   
 * @Package cn.edu360.javase24.day07.interfacedemo2   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: CypherLCJ     
 * @date:   2018年11月29日 上午7:21:22   
 * @version V1.0 
 */  
package cn.edu360.javase24.day07.interfacedemo2;

import java.util.Scanner;

/**   
 * @ClassName:  UserMenu   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Cypherlcj 
 * @date:   2018年11月29日 上午7:21:22   
 *     
 */
public class UserMenu {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//
		UserServiceManage userServiceManage=new UserServiceManageImpl() ;
			boolean flag=true;
		while(flag=true) {	 
		
		System.out.println("1.登录;2.注册");
		String nextLine=sc.nextLine();
		switch (nextLine) {
		case "1":
			System.out.println("请输入账号:");
			String username=sc.nextLine();
			System.out.println("请输入密码:");
			String pwd=sc.nextLine();
			//
			boolean login=userServiceManage.login(username,pwd);
			if(login) {
				System.out.println("恭喜您，登录成功");
			}else {
				System.out.println("抱歉，您的用户名或密码不正确");
			}
			
			break;
		case "2":
			System.out.println("请输入用户名：");
			String name=sc.nextLine();
			System.out.println("请输入密码：");
			String pwd1=sc.nextLine();
			System.out.println("请再次输入密码");
			String pwd2=sc.nextLine();
			
			//
			String res=userServiceManage.regist(name,pwd1,pwd2);
			//System.out.println(res);
			switch (res) {
			case "1":
				System.out.println("您可能两次密码不一致");
				break;
			case "2":
				System.out.println("您所选的账号已被注册.");
				break;
			case "3":
				System.out.println("恭喜您，注册成功");
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

























