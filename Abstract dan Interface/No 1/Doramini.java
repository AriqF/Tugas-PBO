
public class Doramini extends Robot {

	public void sayDora() {
		System.out.println("Halo, Saya Doramini");
	}
	
	public void setNama(String name) {
		this.nama = name;
	}
	
	public void setTahunPembuatan(int thn) {
		this.tahun = thn;
	}
	
	public void setPemilik(String pemilik) {
		this.pemilik = pemilik;
	}
	
	public void displayData() {
		System.out.println("Nama: " + this.nama);
		System.out.println("Tahun: " + this.tahun);
		System.out.println("pemilik: " + this.pemilik);
	}
	
}
