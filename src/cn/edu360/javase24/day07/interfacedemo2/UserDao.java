/**  
 * @Title:  UserDao.java   
 * @Package cn.edu360.javase24.day07.interfacedemo2   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: CypherLCJ     
 * @date:   2018年11月29日 上午7:58:42   
 * @version V1.0 
 */  
package cn.edu360.javase24.day07.interfacedemo2;

/**   
 * @ClassName:  UserDao   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Cypherlcj 
 * @date:   2018年11月29日 上午7:58:42   
 *     
 */
public interface UserDao {
    public User findUserByName(String userName);
    
}
