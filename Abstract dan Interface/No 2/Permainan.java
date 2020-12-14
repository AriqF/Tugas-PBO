
abstract class Permainan {
	
	private String namaPemain;
	private int levelPemain;
	
	public void setNamaPemain(String np) {
		
		this.namaPemain = np;
	}
	
	public void setLevelPemain(int lp) {
		
		this.levelPemain = lp;
	}
	
	public String getNamaPemain() {
		
		return this.namaPemain;
	}
	
	public int getLevelPemain() {	
		
		if(this.levelPemain >= 1 && this.levelPemain <= 20) {
			System.out.println("Level Pemain: Normal");
		}
		else if(this.levelPemain >= 21 && this.levelPemain <= 80) {
			System.out.println("Level Pemain: Medium");
		}
		else if(this.levelPemain >= 81 && this.levelPemain <= 100) {
			System.out.println("Level Pemain: Hard");
		}
		
		return this.levelPemain;
	}
	
	public void jalankan() {
		
		System.out.println("Nama: " + this.getNamaPemain());
		System.out.println("Level: " + this.getLevelPemain());
		//add hitungSkor ??
	}
	
	public abstract int hitungSkor(int hit, int miss);
	
}
