
public class main {

	public static void main(String[] args) {
		Pecahan a = new Pecahan(3,2);
		Pecahan b = new Pecahan(5,6);
		System.out.println(a.getPembilang() + "/" + a.getPenyebut() + " + " + b.getPembilang() + "/" + b.getPenyebut());
		a.tambah(b);

	}

}
