
public class main {

	public static void main(String[] args) {
		GameCharacter charA = new GameCharacter("Raiden", 10, 20);
		GameCharacter charB = new GameCharacter("SubZero", 5, 25);
		
		//Game Starts
		charA.hit(charB);
		charB.kick(charA);
		for(int i=0; i<3; i++) {
			charB.kick(charA);
		}
		for(int i=0; i<4 ;i++) {
			charA.hit(charB);
		}
		
		System.out.println(charA.getName() + " memiliki " + charA.getLifePoint() + " life point");
		System.out.println(charB.getName() + " memiliki " + charB.getLifePoint() + " life point");
		
		if(charA.getLifePoint() > charB.getLifePoint()) {
			System.out.println("Game dimenangkan oleh " + charA.getName());
		}
		else if(charA.getLifePoint() < charB.getLifePoint()) {
			System.out.println("Game dimenangkan oleh " + charB.getName());
		}
		
	}

}
