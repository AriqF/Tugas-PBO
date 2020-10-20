import java.util.Scanner;
public class Invoice {
	String desc;
	String id;
	int quantity;
	int price;
//constructor 
	Invoice(String desc, String id, int n, int price){
		if(n < 0 ) {
			n = 0;
		}
		this.desc = desc;
		this.id = id;
		this.quantity = n;
		this.price = price;
	}
	public void getInvoiceAmount(){
		int total = this.price * this.quantity;
		System.out.println("Total: " + total);
	}
	public void showInvoice() {
		System.out.println("Desc: " + this.desc);
		System.out.println("ID: " + this.id);
		System.out.println("Quantity: " + this.quantity);
		System.out.println("Price per Item: " + this.price);
		this.getInvoiceAmount();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Desc: ");
		String inDesc = scan.nextLine();
		System.out.println("Input Price: ");
		int price = scan.nextInt();
		System.out.println("Input Id: ");
		String id =  scan.next();
		System.out.println("Input Quantity: ");
		int n = scan.nextInt();
		Invoice one = new Invoice(inDesc, id, n, price);

		one.showInvoice();

	}

}
