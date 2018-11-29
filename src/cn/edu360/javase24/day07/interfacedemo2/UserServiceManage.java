/**  
 * @Title:  UserManage.java   
 * @Package cn.edu360.javase24.day07.interfacedemo2   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: CypherLCJ     
 * @date:   2018年11月29日 上午7:20:06   
 * @version V1.0 
 */  
package cn.edu360.javase24.day07.interfacedemo2;

/**   
 * @ClassName:  UserManage   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Cypherlcj 
 * @date:   2018年11月29日 上午7:20:06   
 *     
 */
public interface UserServiceManage {
      public boolean login(String name,String pwd);
      public String regist(String name,String pwd1,String pwd2 );
}
