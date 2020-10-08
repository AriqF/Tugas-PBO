public class Employee {
	String firstName;
	String lastName;
	int monthSalary;
	int yearSalary;
	
	//constructor
	Employee(String fName, String lName){
		this.firstName = fName;
		this.lastName = lName;
	}
	
	public void addMonthSalary(int mSalary) {
		if(mSalary < 0) {
			mSalary = 0;
			System.out.println("Monthly Salary Can't Less Than 0!");
			System.out.println("Salary Will Be Adjusted To 0!");
		}
		this.monthSalary = mSalary;		
	}
	public void getMonthSalary() {
		System.out.println(this.firstName + " " + this.lastName + " has " + this.monthSalary + " per month ");
	}
	public void getYearSalary() {
		this.yearSalary = this.monthSalary * 12;
		System.out.println(this.firstName + " " + this.lastName + " has " + this.yearSalary + " per Year ");
	}
	public void raiseMonthSalary(int r) {
		float x = 100;
		float raise = ((r/x) * this.monthSalary) + this.monthSalary;
		this.monthSalary = Math.round(raise);
	}
	public static void main(String[] args) {
			Employee one = new Employee("Maimy", "Laily");			
			one.addMonthSalary(1000);
			one.getMonthSalary();
			one.raiseMonthSalary(10);
			one.getMonthSalary();
			one.getYearSalary();
			Employee two = new Employee("Ben", "Casey");
			two.addMonthSalary(500);
			two.getMonthSalary();
			two.raiseMonthSalary(10);
			two.getMonthSalary();
			two.getYearSalary();
			
		}	
}

