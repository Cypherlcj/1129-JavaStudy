/**  
 * @Title:  UserManageImpl.java   
 * @Package cn.edu360.javase24.day07.interfacedemo2   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: CypherLCJ     
 * @date:   2018��11��29�� ����7:34:37   
 * @version V1.0 
 */  
package cn.edu360.javase24.day07.interfacedemo2;

/**   
 * @ClassName:  UserManageImpl   
 * @Description:TODO(������һ�仰��������������)   
 * @author: Cypherlcj 
 * @date:   2018��11��29�� ����7:34:37   
 *     
 */
public class UserManageImpl implements UserManage{

	/**   
	 * <p>Title: login</p>   
	 * <p>Description: ����DAO��Ĺ�������ѯ���û����Ƿ����</p>   
	 * @param name
	 * @param pwd
	 * @return   
	 * @see cn.edu360.javase24.day07.interfacedemo2.UserManage#login(java.lang.String, java.lang.String)   
	 */
	@Override
	public boolean login(String name, String pwd) {
		// TODO Auto-generated method stub
		UserDao userDao=null;
		User user=userDao.findUserB
	}

	/**   
	 * <p>Title: regist</p>   
	 * <p>Description: </p>   
	 * @param name
	 * @param pwd1
	 * @param pwd2
	 * @return   
	 * @see cn.edu360.javase24.day07.interfacedemo2.UserManage#regist(java.lang.String, java.lang.String, java.lang.String)   
	 */
	@Override
	public String regist(String name, String pwd1, String pwd2) {
		// TODO Auto-generated method stub
		return null;
	}
  
}
