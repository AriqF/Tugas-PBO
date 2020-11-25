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
	
	
}
