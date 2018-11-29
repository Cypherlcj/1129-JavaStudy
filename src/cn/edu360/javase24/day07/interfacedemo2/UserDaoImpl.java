/**  
 * @Title:  UserDaoImpl.java   
 * @Package cn.edu360.javase24.day07.interfacedemo2   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: CypherLCJ     
 * @date:   2018年11月29日 上午8:35:28   
 * @version V1.0 
 */  
package cn.edu360.javase24.day07.interfacedemo2;

/**   
 * @ClassName:  UserDaoImpl   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Cypherlcj 
 * @date:   2018年11月29日 上午8:35:28   
 *     
 */
public class UserDaoImpl implements UserDao {

	/**   
	 * <p>Title: findUserByName</p>   
	 * <p>Description: 根据一个用户名到数据库中查找该用户</p>   
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
	 * <p>Description: 判断数据库中是否已存在该用户名</p>   
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
	 * <p>Description: 将传入的user对象存入数据库</p>   
	 * @param user   
	 * @see cn.edu360.javase24.day07.interfacedemo2.UserDao#addUser(cn.edu360.javase24.day07.interfacedemo2.User)   
	 */
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		UserDatabase.userMap.put(user.getUserName(), user);
	}

}

















