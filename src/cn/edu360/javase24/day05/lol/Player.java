/**  
 * @Title:  Player.java   
 * @Package cn.edu360.javase24.day05.lol   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: CypherLCJ     
 * @date:   2018年11月29日 上午3:07:33   
 * @version V1.0 
 */  
package cn.edu360.javase24.day05.lol;

import java.util.ArrayList;

/**   
 * @ClassName:  Player   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Cypherlcj 
 * @date:   2018年11月29日 上午3:07:33   
 *     
 */
public class Player {
    private String account;
    private String missionId;
    private String hero;
    private ArrayList<String> equipment;
    private int assistants;
    private int kills;
    private int killedSoldiers;
    private int missionScore;
    private int amountScore;
    private int heroLevel;
    
    
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(String account, String missionId, String hero, ArrayList<String> equipment, int assistants, int kills,
			int killedSoldiers, int missionScore, int amountScore, int heroLevel) {
		super();
		this.account = account;
		this.missionId = missionId;
		this.hero = hero;
		this.equipment = equipment;
		this.assistants = assistants;
		this.kills = kills;
		this.killedSoldiers = killedSoldiers;
		this.missionScore = missionScore;
		this.amountScore = amountScore;
		this.heroLevel = heroLevel;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getMissionId() {
		return missionId;
	}
	public void setMissionId(String missionId) {
		this.missionId = missionId;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public ArrayList<String> getEquipment() {
		return equipment;
	}
	public void setEquipment(ArrayList<String> equipment) {
		this.equipment = equipment;
	}
	public int getAssistants() {
		return assistants;
	}
	public void setAssistants(int assistants) {
		this.assistants = assistants;
	}
	public int getKills() {
		return kills;
	}
	public void setKills(int kills) {
		this.kills = kills;
	}
	public int getKilledSoldiers() {
		return killedSoldiers;
	}
	public void setKilledSoldiers(int killedSoldiers) {
		this.killedSoldiers = killedSoldiers;
	}
	public int getMissionScore() {
		return missionScore;
	}
	public void setMissionScore(int missionScore) {
		this.missionScore = missionScore;
	}
	public int getAmountScore() {
		return amountScore;
	}
	public void setAmountScore(int amountScore) {
		this.amountScore = amountScore;
	}
	public int getHeroLevel() {
		return heroLevel;
	}
	public void setHeroLevel(int heroLevel) {
		this.heroLevel = heroLevel;
	}
    
    
}
