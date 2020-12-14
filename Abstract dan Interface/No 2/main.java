
public class main {

	public static void main(String[] args) {
		
		System.out.println("Permainan Arcade");
		
		PermainanArcade pa = new PermainanArcade();
		
		pa.setNamaPemain("Aether");
		pa.setLevelPemain(100);
		pa.jalankan();
		System.out.println("Skor:" + pa.hitungSkor(3, 1));
		
		System.out.println("Permainan Strategy");
		
		PermainanStrategy ps = new PermainanStrategy();
		
		ps.setNamaPemain("Lumine");
		ps.setLevelPemain(90);
		ps.jalankan();
		System.out.println("Skor:" + ps.hitungSkor(5, 0));
	
	}

}
