/**  
 * @Title:  UserDaoImpl.java   
 * @Package cn.edu360.javase24.day07.interfacedemo2   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: CypherLCJ     
 * @date:   2018��11��29�� ����8:35:28   
 * @version V1.0 
 */  
package cn.edu360.javase24.day07.interfacedemo2;

/**   
 * @ClassName:  UserDaoImpl   
 * @Description:TODO(������һ�仰��������������)   
 * @author: Cypherlcj 
 * @date:   2018��11��29�� ����8:35:28   
 *     
 */
public class UserDaoImpl implements UserDao {

	/**   
	 * <p>Title: findUserByName</p>   
	 * <p>Description: ����һ���û��������ݿ��в��Ҹ��û�</p>   
	 * @param userName
	 * @return   
	 * @see cn.edu360.javase24.day07.interfacedemo2.UserDao#findUserByName(java.lang.String)   
	 */
	@Override
	public User findUserByName(String userName) {
		// TODO Auto-generated method stub
		 User user=UserDatabase.userMap.get(userName);
		 return user;
	}

	/**   
	 * <p>Title: checkUserIsExist</p>   
	 * <p>Description: �ж����ݿ����Ƿ��Ѵ��ڸ��û���</p>   
	 * @param userName
	 * @return   
	 * @see cn.edu360.javase24.day07.interfacedemo2.UserDao#checkUserIsExist(java.lang.String)   
	 */
	@Override
	public boolean checkUserIsExist(String userName) {
		// TODO Auto-generated method stub
		boolean containsKey=UserDatabase.userMap.containsKey(userName);
		return containsKey;
	}

	/**   
	 * <p>Title: addUser</p>   
	 * <p>Description: �������user����������ݿ�</p>   
	 * @param user   
	 * @see cn.edu360.javase24.day07.interfacedemo2.UserDao#addUser(cn.edu360.javase24.day07.interfacedemo2.User)   
	 */
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		UserDatabase.userMap.put(user.getUserName(), user);
	}

}

















