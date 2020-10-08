public class Account {
	String name;
	int currBalance;
	
	//constructor
	Account(String n, int b){
		if(b < 0) {
			b = 0;
			System.out.println("Error! Balance Couldn't Less Than 0!");
			System.out.println("Balance Will Be Adjusted To 0!");
		}
		this.name = n;
		this.currBalance = b;
	}
	public void Credit(int cred) {
		this.currBalance = currBalance + cred;
	}
	public void Debit(int debt) {
		if(debt < currBalance) {
			this.currBalance = this.currBalance - debt;	
		}
		else if(debt > currBalance) {
			System.out.println(this.name + " Debit's amount exceed account balance!");
		}
	}
	public void getBalance() {
		System.out.println(this.name + " has " + this.currBalance);
	}
	
	public static void main(String[] args) {
		Account A1 = new Account("Maimy", 0);
		Account A2 = new Account("Lia", 100);
		A1.getBalance(); 
		System.lineSeparator();
		A1.Credit(100);
		A1.getBalance();
		A1.Debit(30);
		A1.getBalance();
		A2.getBalance();
		A2.Debit(120);
		Account A3 = new Account("Sumi", -10);
		A3.getBalance();
		
		

	}

}
