/**  
 * @Title:  PlayerTest.java   
 * @Package cn.edu360.javase24.day05.lol   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: CypherLCJ     
 * @date:   2018��11��29�� ����3:11:15   
 * @version V1.0 
 */  
package cn.edu360.javase24.day05.lol;

import java.util.ArrayList;

/**   
 * @ClassName:  PlayerTest   
 * @Description:TODO(������һ�仰��������������)   
 * @author: Cypherlcj 
 * @date:   2018��11��29�� ����3:11:15   
 *     
 */
public class PlayerTest {
  public static void main(String[] args) {
	// create players
	  Player player1=new Player();
	  player1.setAccount("ɧɧ��С����");
	  player1.setMissionId("��������-876");
	  player1.setHero("����");
	  player1.setHeroLevel(1);
	  player1.setAmountScore(1000);
	  player1.setAssistants(0);
	  player1.setKills(0);
	  player1.setKilledSoldiers(0);
	  
	  ArrayList<String> quip=new ArrayList<>();
	  quip.add("����");
	  quip.add("��ҩ");
	  
	 player1.setMissionScore(player1.getMissionScore()+10);
	  
}
}
