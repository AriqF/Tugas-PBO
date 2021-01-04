
abstract class Creature {
	
	public String name;
	public double maxHp;
	public double maxAtk;
	public double atk;
	public double currHp;
	public int energy;
	
	public boolean isDead() {
		
		if(this.currHp <= 0) {
			
			return true;
		}
		else {
			
			return false;
		}
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public void setMaxHp(double maxHp) {
		
		this.maxHp = maxHp;
	}
	
	public double getMaxHp() {
		
		return this.maxHp;
	}
	
	public void setMaxAtk(double maxAtk) {
		
		this.maxAtk = maxAtk;
	}
	
	public double getMaxAtk() {
		
		return this.maxAtk;
	}
	
	public void setEnergy(int energy) {
		
		this.energy = energy;
	}
	
	public int getEnergy() {
		
		return this.energy;
	}
	
	public double getAtk() {
		
		return this.atk;
	}
	
	public void setCurrHp(double currHp) {
		
		this.currHp = currHp; 
	}
	
	public double getCurrHp() {
		
		return this.currHp;
	}
	
	public String toString() {
		
		return this.name + " Hp is " + this.currHp; 
	}
}
