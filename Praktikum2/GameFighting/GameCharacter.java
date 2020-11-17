public class GameCharacter {
	private String name;
	private int lifePoint = 100;
	private int attackHitPoint;
	private int attackKickPoint;


	//constructor
	public GameCharacter(String n, int atkH, int atkK){
		this.name = n;
		this.attackHitPoint = atkH;
		this.attackKickPoint = atkK;
	}
	
	public void hit(GameCharacter karB) {
		karB.lifePoint -= this.attackHitPoint;
	}
	
	public void kick(GameCharacter karB) {
		karB.lifePoint -= this.attackKickPoint;
	}
	
	public int getLifePoint() {
		//System.out.println(this.name + " has " + this.lifePoint);
		return this.lifePoint;
	}
	public String getName() {
		return this.name;
	}
	
}
