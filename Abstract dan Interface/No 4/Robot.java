
interface RobotInterface{
	
	void setNama(String n);
	void setTahunPembuatan(int t);
	void displayData();
}

public class Robot extends Doramini implements RobotInterface {
		
	String nama = super.getNama();
	int tahun = super.tahun; //created package in Doramini
	String pemilik = super.getPemilik();
	
	@Override
	public void setNama(String n) {
		
		this.nama = n;
	}

	@Override
	public void setTahunPembuatan(int t) {
			
		this.tahun = t;
	}

	@Override
	public void displayData() {
		 
		System.out.println("Nama: " + this.nama);
		System.out.println("Tahun Pembuatan: " + this.tahun);
		System.out.println("Pemilik: " + super.getPemilik());
			
	}
	

}
