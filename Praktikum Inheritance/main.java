
public class main {
	

	public main(String[] args) {

		Member m1 = new Member("Fischl", 18);
		Member m2 = new Member("Keqing", 16);
		Member m3 = new Member("Razor", 17);
		
		Trainee t1 = new Trainee("Jean", 21, 40);
		
		System.out.println("== Trainee: ==");
		
		t1.display();
		
		System.out.println("==== List Member in Team ====");
		//set team name
		Tim.setNama("ABC");
		//add member to tim
		Tim.setMember(m1);
		Tim.setMember(m2);
		Tim.setMember(m3);
		Tim.displayFullMember();

	}

}
