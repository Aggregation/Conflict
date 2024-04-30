package ClassInterface;

public class Sbi extends Rbi implements Atm{
	int pin;
	double bal;
	public Sbi(int pin,double bal)
	{
		this.pin=pin;
		this.bal=bal;
	}
	public void intrestRate()
	{
		System.out.println("Housing Loan Intrest Rate is 8.9%");
		System.out.println("Vehicle loan Intrest rate is 5.5%");
	}
	
	public void withdraw()
	{
		System.out.println("Enter your ammount and pin, di=o verification and then you can withdraw");
		
	}
	public void checkbal()
	{
		System.out.println("Enter your pin and do verification you can know your balance");
	}
	public static void main(String[] args) {
//		System.out.println("hi");
		Sbi s=new Sbi(1122,50000d);
		s.intrestRate();
	}
	

}
