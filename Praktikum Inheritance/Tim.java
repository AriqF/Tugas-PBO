import java.util.*;
public class Tim{
	
	static String namaTim;
	static ArrayList<String> m = new ArrayList<String>();
	
	public static void setMember(Member mem) {
		m.add(mem.nama);
	}
	
	public static void displayFullMember() {
		System.out.println("Member Tim " + getNama() + ":");
		System.out.println(m);
	}
	
	public void displayTrainee() {
		//trainee display method inherit member
	}
	
	public static String getNama() {
		return namaTim;
	}
	
	public static void setNama(String nama) {
		namaTim = nama;
	}
	
	public static void main(String[] args) {

		Member m1 = new Member("Fischl", 18);
		Member m2 = new Member("Keqing", 16);
		Member m3 = new Member("Razor", 17);
		
		Trainee t1 = new Trainee("Jean", 21, 40);
		
		System.out.println("== Trainee: ==");
		
		t1.display();
		
		System.out.println("==== List Member in Team ====");
		//set team name
		setNama("ABC");
		
		Tim.setMember(m1);
		Tim.setMember(m2);
		Tim.setMember(m3);
		displayFullMember();

	}
}
