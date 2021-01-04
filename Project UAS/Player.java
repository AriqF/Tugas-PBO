
public class Player extends Creature{
	
	public String role;
	public double minAtk = this.maxAtk - (0.2 * this.maxAtk);
	public int reqEnergy;
	
	public Player() {
		
		this.setMaxHp(2200);
		this.setMaxAtk(200);
		this.setEnergy(100);
		this.setCurrHp(maxHp);
		
		if(this.energy < 0) {
			
			this.setEnergy(0);
		}
		
		if(this.currHp < 0) {
			
			this.setCurrHp(0);
		}
				
	}
		
	public void setRole(String role) {
		
		this.role = role;
		
		//set role status
		if(this.role == "flame") {
				
			this.setMaxHp(this.maxHp - (0.2 * this.maxHp));		
		}
		else if(this.role == "geo") {
			
			this.setMaxHp(this.maxHp + (0.3 * this.maxHp));
		}
		else if(this.role == "wind") {
			
			this.setMaxAtk(this.maxAtk + 20);
		}
		else if(this.role == "lightning") {
			
			this.setMaxAtk(this.maxAtk + 70);
		}
		else if(this.role == "water") {
			
			this.setMaxAtk(this.maxAtk + 80);      
		}
			
	}
	
	public String getRole() {
		
		return this.role;
	}	
	
	public void baseAtk(Monster mobsA) {
		
		//double atk = (double)(Math.random() * (this.maxAtk - this.atk) + this.atk);
		
		double datk = (int)(Math.random()*(this.maxAtk - minAtk) + 1) + minAtk;
		this.atk = (int)(Math.round(datk * 100))/100.0;
		mobsA.currHp -= this.atk;
		this.setEnergy(this.energy + 15);
		System.out.println(this.getName() + " Attack " + mobsA.getName() + " "+ this.atk);
		
	}
	
	public void skillAtk(Monster mobsA) {
		
		double dmg, minDmg, skillDmg;	
		
		if(this.role == "flame") {
			
			reqEnergy = 100;
			if(this.energy >= reqEnergy) {
				
				System.out.println("Flaming Phoneix!!");
				minDmg = this.maxAtk + (6 * this.maxAtk);
				this.setEnergy(this.energy - 100);
				
				dmg = (int)(Math.random()*((minDmg + this.maxAtk)- minDmg) + 1) + minDmg; 
				skillDmg =  (int)(Math.round(dmg*100))/100.0;
				mobsA.currHp -= skillDmg;
				System.out.println(mobsA.getName() + " Deals " + skillDmg);
			}
			else {
				System.out.println("Energy is Insufficient!");
				System.out.println("Changin to base attack..");
				this.baseAtk(mobsA);
			}
			
		}
		else if(this.role == "geo") {
			
			reqEnergy = 80;
			if(this.energy >= reqEnergy) {
				
				System.out.println("Falling Earth!!");
				minDmg = this.maxAtk + (0.2 * this.maxHp);
				this.setEnergy(this.energy - 80);
				
				dmg = (int)(Math.random()*((minDmg + this.maxAtk)- minDmg) + 1) + minDmg; 
				skillDmg =  (int)(Math.round(dmg*100))/100.0;
				mobsA.currHp -= skillDmg;
				System.out.println(mobsA.getName() + " Deals " + skillDmg);
			}
			else {
				System.out.println("Energy is Insufficient!");
				System.out.println("Changin to base attack..");
				this.baseAtk(mobsA);
			}
			
			
		}
		else if(this.role == "wind") {
			
			reqEnergy = 100;
			if(this.energy >= 100) {
				
				System.out.println("Typhoon!!");
				minDmg = this.maxAtk + (4.2 * this.maxAtk);
				this.setEnergy(this.energy - 100);
				
				dmg = (int)(Math.random()*((minDmg + this.maxAtk)- minDmg) + 1) + minDmg; 
				skillDmg =  (int)(Math.round(dmg*100))/100.0;
				mobsA.currHp -= skillDmg;
				System.out.println(mobsA.getName() + " Deals " + skillDmg);
			}
			else {
				System.out.println("Energy is Insufficient!");
				System.out.println("Changin to base attack..");
				this.baseAtk(mobsA);
			}
			
		}
		else if(this.role == "lightning") {
			
			reqEnergy = 25;
			if(this.energy >= reqEnergy) {
				
				System.out.println("Lightning Slash!!");
				minDmg = this.maxAtk + (0.75 * this.maxAtk);
				this.setEnergy(this.energy - 25); 
				
				dmg = (int)(Math.random()*((minDmg + this.maxAtk)- minDmg) + 1) + minDmg; 
				skillDmg =  (int)(Math.round(dmg*100))/100.0;
				mobsA.currHp -= skillDmg;
				System.out.println(mobsA.getName() + " Deals " + skillDmg);
			}
			else {
				System.out.println("Energy is Insufficient!");
				System.out.println("Changin to base attack..");
				this.baseAtk(mobsA);
			}
			
		}
		else if(this.role == "water") {
			
			reqEnergy = 30;
			if(this.energy >= reqEnergy) {
				
				System.out.println("Re:Generate!!");  
				double heal = (0.15 * this.maxHp);
				this.setCurrHp(this.currHp + heal);
				//nerfed water role, delete attack skill regen only
				//minDmg = this.maxAtk + (0.50 * this.maxAtk);
				this.setEnergy(this.energy - 50);
				System.out.println(this.getName() + "heal " + heal + " Hp");
			}
			else {
				
				System.out.println("Energy is Insufficient!");
				System.out.println("Changin to base attack..");
				this.baseAtk(mobsA);
			}
					
		}
		
	}
	
	public void autoAtk (Monster mobsA) {
		
		if(this.energy >= reqEnergy) {
			
			this.skillAtk(mobsA);
		}
		else {
			
			this.baseAtk(mobsA);
		}
	}
		
}
