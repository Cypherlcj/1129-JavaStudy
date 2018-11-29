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
public class UserServiceManageImpl implements UserServiceManage {
	
	   UserDao userDao=new UserDaoImpl();
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
		//������������Ƿ�һ�£������һ�£�ֱ�ӷ���1
		if(!pwd1.equals(pwd2)) {
			return "1";
		}
		//��dao��Ĺ��������ɸ��û����Ƿ����
		boolean ifExist=userDao.checkUserIsExist(userName);
		
		//����û��Ѿ����ڣ�����2
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














