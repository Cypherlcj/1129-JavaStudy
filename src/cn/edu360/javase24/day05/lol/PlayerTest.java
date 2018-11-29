/**  
 * @Title:  PlayerTest.java   
 * @Package cn.edu360.javase24.day05.lol   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: CypherLCJ     
 * @date:   2018年11月29日 上午3:11:15   
 * @version V1.0 
 */  
package cn.edu360.javase24.day05.lol;

import java.util.ArrayList;

/**   
 * @ClassName:  PlayerTest   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Cypherlcj 
 * @date:   2018年11月29日 上午3:11:15   
 *     
 */
public class PlayerTest {
  public static void main(String[] args) {
	// create players
	  Player player1=new Player();
	  player1.setAccount("骚骚的小狐狸");
	  player1.setMissionId("德玛西亚-876");
	  player1.setHero("瑞雯");
	  player1.setHeroLevel(1);
	  player1.setAmountScore(1000);
	  player1.setAssistants(0);
	  player1.setKills(0);
	  player1.setKilledSoldiers(0);
	  
	  ArrayList<String> quip=new ArrayList<>();
	  quip.add("长剑");
	  quip.add("红药");
	  
	 player1.setMissionScore(player1.getMissionScore()+10);
	  
}
}
