/**  
 * @Title:  UserDao.java   
 * @Package cn.edu360.javase24.day07.interfacedemo2   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: CypherLCJ     
 * @date:   2018��11��29�� ����7:58:42   
 * @version V1.0 
 */  
package cn.edu360.javase24.day07.interfacedemo2;

/**   
 * @ClassName:  UserDao   
 * @Description:TODO(������һ�仰��������������)   
 * @author: Cypherlcj 
 * @date:   2018��11��29�� ����7:58:42   
 *     
 */
public interface UserDao {
    public User findUserByName(String userName);
    
}
