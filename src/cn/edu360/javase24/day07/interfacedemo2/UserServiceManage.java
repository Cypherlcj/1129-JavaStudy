/**  
 * @Title:  UserManage.java   
 * @Package cn.edu360.javase24.day07.interfacedemo2   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: CypherLCJ     
 * @date:   2018��11��29�� ����7:20:06   
 * @version V1.0 
 */  
package cn.edu360.javase24.day07.interfacedemo2;

/**   
 * @ClassName:  UserManage   
 * @Description:TODO(������һ�仰��������������)   
 * @author: Cypherlcj 
 * @date:   2018��11��29�� ����7:20:06   
 *     
 */
public interface UserServiceManage {
      public boolean login(String name,String pwd);
      public String regist(String name,String pwd1,String pwd2 );
}
