import java.util.Scanner;
import java.io.IOException;
import java.util.*;
public class main {
	
	private static Scanner scan;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println("My Adventure Game"); 
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		System.out.println("Create your character:");
		System.out.println("====================");
		
		Player p1 = new Player();
		Monster m1 = new Monster();
		
		scan = new Scanner(System.in);
		
		System.out.print("Name: ");
		String inName = scan.nextLine();		
		p1.setName(inName);
		//Thread.sleep(100);

		System.out.println("Role: ");
		System.out.println("~~~~");
		System.out.println("1. flame");
		System.out.println("Skill: Flaming phoniex (600% Dmg), Energy required: 100");
		System.out.println("Unique>> Hp: -20%");
		System.out.println("~~~~");
		System.out.println("2. geo");
		System.out.println("Skill: Falling earth (Dmg Scale 20% Max Hp), Energy required: 80");
		System.out.println("Unique>> Hp: +30%");
		System.out.println("~~~~");
		System.out.println("3. wind");
		System.out.println("Skill: Typhoon (420% Dmg), Energy required: 100");
		System.out.println("Unique>> Atk: +20");
		System.out.println("~~~~");
		System.out.println("4. lightning");
		System.out.println("Skill: Lightning Slash (75% Dmg), Energy required: 25");
		System.out.println("Unique>> Hp: -35% Atk: +70 ");
		System.out.println("~~~~");
		System.out.println("5. water");
		System.out.println("Skill: Tidal Pool (Heal 25% Max Hp), Energy required: 50");
		System.out.println("Unique>> Atk: +35 ");
		System.out.println("====================");
		System.out.print("Select Role: ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			p1.setRole("flame");
			System.out.println("flame selected");	
			break;
		case 2: 
			p1.setRole("geo"); 
			System.out.println("geo selected");
			break;
		case 3:
			p1.setRole("wind");
			System.out.println("wind selected");
			break;
		case 4:
			p1.setRole("lightning");
			System.out.println("lightning selected");
			break;
		case 5:
			p1.setRole("water");
			System.out.println("water selected");
			break;
		default:
			System.out.println("Tidak tersedia!");
		}
		
		System.out.println("##Player Role Stats#####");
		System.out.println("maxAtk: " + p1.getMaxAtk());
		System.out.println("maxHp: " + p1.getMaxHp());
		System.out.println("=========================");
		
		//deleted code goes to notepad (Roleplay test debug)

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enable auto play? (yes/no): ");
		String question = in.nextLine();
		String questionLwr = question.toLowerCase();
		if(questionLwr.equals("yes")) {
			
			//auto play
			System.out.println("Game Starts! (Auto Play)");
			System.out.println(p1.toString());
			System.out.println(m1.toString());
			do {

				p1.autoAtk(m1);
				Thread.sleep(420);
				m1.baseAtk(p1);
				Thread.sleep(420);
			}while(p1.currHp >= 0 && m1.currHp >= 0);		
		}
		else if(questionLwr.equals("no")) {
			
			//manual play
			int num = 0;
			
			System.out.println("Game Starts!");
			System.out.println("=============");
			System.out.println("Hotkey: \n 1. Attack \n 2. Skill Attack");
			System.out.println(p1.toString());
			System.out.println(m1.toString());
			do {
				
				if(num % 2 == 0) {
					
					System.out.println(p1.getName() + " energy: " + p1.getEnergy());
					System.out.print("Enter attack type: ");
					int chc = scan.nextInt();     
					switch(chc) {
					case 1:
						p1.baseAtk(m1);
						break;
					case 2:
						p1.skillAtk(m1);
						break;
					default:
						System.out.println("**System: Pilihan tak tersedia!");
						System.out.println("*Changing to base attack..");
						p1.baseAtk(m1);
						Thread.sleep(300);
					}
				}
				else if(num % 2 != 0) {
					
					m1.baseAtk(p1);
				}
				System.out.println("=------------=");
				System.out.println(p1.toString());
				System.out.println(m1.toString());
				System.out.println("--------------");
				num++;
				Thread.sleep(500);
			}while(p1.currHp >= 0 && m1.currHp >= 0);
		}
				
		if(p1.isDead() == true) {
			
			p1.setCurrHp(0);
			System.out.println("You Lose!!");
		}
		else if(m1.isDead() == true){
			
			m1.setCurrHp(0);
			System.out.println("You Win!!");
			
		}
		
		System.out.println(m1.toString());
		System.out.println(p1.toString());

		//1.3 build 3 updated >> enhanced display, added delay 
		//1.3 build 4 updated >> add 'press any key to continue', key to attack, added delay
		//next patch display storyline (?), enhance display if got ideas
		Thread.sleep(300);
		System.out.println("Press any key to exit program..");
		System.in.read();
		scan.close();
		in.close();
	}

}
