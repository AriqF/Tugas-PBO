
public class Monster extends Creature {
	 
	
	public Monster() { 
		
		this.setMaxHp(3600);
		this.setMaxAtk(150);
		this.setCurrHp(maxHp);
		
		double minAtk = maxAtk - (0.2*maxAtk);
		double datk = (int)(Math.random()*(this.maxAtk - minAtk) + 1) + minAtk;
		this.atk = (int)(Math.round(datk * 100))/100.0;
		this.setName("Cicin");
		
		if(this.currHp < 0) {
			
			this.setCurrHp(0);
		}
	}
	
	
	public void baseAtk(Player playerA) {
		
		playerA.currHp -= this.atk;
		System.out.println(this.getName() + " Attack " + playerA.getName() + " "+ this.atk);
		
	}
}
