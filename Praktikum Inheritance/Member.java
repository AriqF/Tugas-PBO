
public class Member {
	protected String nama;
	protected int umur;
	
	public Member(String nama, int umur) {
		this.nama = nama;
		this.umur = umur;
	}
	
	public void setUmur(int umur) {
		this.umur = umur;
	}
	
	public void display() {
		System.out.println("Nama: " + this.nama);
		System.out.println("Umur: " + this.umur);
	}

}
