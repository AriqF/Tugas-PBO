
public class Pecahan {
	private int pembilang;
	private int penyebut;
	
	public Pecahan(int pem, int pen) {
		this.pembilang = pem;
		this.penyebut = pen;
	}
	
	public int getPembilang() {
		return this.pembilang;
	}
	
	public int getPenyebut() {
		return this.penyebut;
	}
	
	public void tambah(Pecahan p) {
		int penRes, pemRes;
		penRes = p.penyebut * this.penyebut;
		pemRes = p.pembilang * this.penyebut + this.pembilang * p.penyebut;
		System.out.println("hasil: " + pemRes + "/" + penRes);
		if((pemRes % 2 == 0) && (penRes % 2 == 0)) {
			while((pemRes % 2 == 0) && (penRes % 2 == 0)) {
				pemRes = pemRes/2;
				penRes = penRes/2;
			}
			System.out.println("hasil setelah disederhanakan: " + pemRes + "/" + penRes);
		}
		else if((pemRes % 3 == 0) && (penRes % 3 == 0)) {
			while((pemRes % 3 == 0) && (penRes % 3 == 0)) {
				pemRes = pemRes/3;
				penRes = penRes/3;
			}
			System.out.println("hasil setelah disederhanakan: " + pemRes + "/" + penRes);
		}
		else if((pemRes % 5 == 0) && (penRes % 5 == 0)) {
			while((pemRes % 5 == 0) && (penRes % 5 == 0)) {
				pemRes = pemRes/5;
				penRes = penRes/5;
			}
			System.out.println("hasil setelah disederhanakan: " + pemRes + "/" + penRes);
		}
		else if((pemRes % 7 == 0) && (penRes % 7 == 0)) {
			while((pemRes % 7 == 0) && (penRes % 7 == 0)) {
				pemRes = pemRes/7;
				penRes = penRes/7;				
			}
			System.out.println("hasil setelah disederhanakan: " + pemRes + "/" + penRes);
		}
		
		
		
	}
}
