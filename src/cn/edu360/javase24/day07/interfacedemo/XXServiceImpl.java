/**  
 * @Title:  XXServiceImpl.java   
 * @Package cn.edu360.javase24.day07.interfacedemo   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: CypherLCJ     
 * @date:   2018年11月29日 上午6:57:08   
 * @version V1.0 
 */  
package cn.edu360.javase24.day07.interfacedemo;

import java.util.HashMap;

/**   
 * @ClassName:  XXServiceImpl   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Cypherlcj 
 * @date:   2018年11月29日 上午6:57:08   
 *     
 */
public class XXServiceImpl implements XXService{

	/**   
	 * <p>Title: step1</p>   
	 * <p>Description: </p>   
	 * @return   
	 * @see cn.edu360.javase24.day07.interfacedemo.XXService#step1()   
	 */
	@Override
	public String step1() {
		// TODO Auto-generated method stub
		return "step1";
	}

	/**   
	 * <p>Title: step2</p>   
	 * <p>Description: </p>   
	 * @param id   
	 * @see cn.edu360.javase24.day07.interfacedemo.XXService#step2(java.lang.String)   
	 */
	@Override
	public void step2(String id) {
		// TODO Auto-generated method stub
		System.out.println("step2");
	}

	/**   
	 * <p>Title: step3</p>   
	 * <p>Description: </p>   
	 * @param a
	 * @return   
	 * @see cn.edu360.javase24.day07.interfacedemo.XXService#step3(int)   
	 */
	@Override
	public HashMap<String, Integer> step3(int a) {
		// TODO Auto-generated method stub
		HashMap<String, Integer>map=new HashMap<>();
		map.put("1", a);
		return map;
	}
   
}




















