
interface DoraemonInterface{
	
	void sayDora();
	void displayKantongAjaib();
	
}

public class Doraemon implements DoraemonInterface {

	@Override
	public void sayDora() {
		
		System.out.println("Halo, Saya Dora Mini");
		
	}

	@Override
	public void displayKantongAjaib() {
		
		System.out.println("Saya juga seperti Doraemon yang memiliki kantung ajaib");
		
	}
	
	

}
