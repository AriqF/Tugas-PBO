
public class main {

	public static void main(String[] args) {
		
		Robot r = new Robot();
		Doraemon dr = new Doraemon();
		 
		r.setNama("Fatui");
		r.setTahunPembuatan(2020);
		r.setPemilik("Childe");
		r.displayData();
		
		dr.sayDora();
		dr.displayKantongAjaib();
		
	}

}
