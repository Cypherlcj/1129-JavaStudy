/**  
 * @Title:  UserManageImpl.java   
 * @Package cn.edu360.javase24.day07.interfacedemo2   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: CypherLCJ     
 * @date:   2018年11月29日 上午7:34:37   
 * @version V1.0 
 */  
package cn.edu360.javase24.day07.interfacedemo2;

/**   
 * @ClassName:  UserManageImpl   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Cypherlcj 
 * @date:   2018年11月29日 上午7:34:37   
 *     
 */
public class UserServiceManageImpl implements UserServiceManage {
	
	   UserDao userDao=new UserDaoImpl();
	/**   
	 * <p>Title: login</p>   
	 * <p>Description: 调用DAO层的功能区查询该用户名是否存在</p>   
	 * @param name
	 * @param pwd
	 * @return   
	 * @see cn.edu360.javase24.day07.interfacedemo2.UserManage#login(java.lang.String, java.lang.String)   
	 */
	@Override
	public boolean login(String name, String pwd) {
		// TODO Auto-generated method stub
	
		User user=userDao.findUserByName(name);
		if(user==null) {
			return false;
		} 
			if(user.getPassword().equals(pwd)) {
				return true;
			}
			return false;
		 
		
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
	public String regist(String userName, String pwd1, String pwd2) {
		// TODO Auto-generated method stub
		//检查两次密码是否一致，如果不一致，直接返回1
		if(!pwd1.equals(pwd2)) {
			return "1";
		}
		//调dao层的功能区建成该用户名是否存在
		boolean ifExist=userDao.checkUserIsExist(userName);
		
		//如果用户已经存在，返回2
		if(ifExist) {
		return "2";
	}
   //
		User user=new User();
        user.setUserName(userName);
        user.setPassword(pwd1);
        userDao.addUser(user);
        return "3";
}

}














