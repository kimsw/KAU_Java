
public class CheckingAccount extends Account{
	private double credit_limit, interest, loan_interest;
	
	CheckingAccount(double balance, double credit_limit, double interest, double loan_interest){
		super(balance);
		this.credit_limit = credit_limit;
		this.interest = interest;
		this.loan_interest = loan_interest;
	}
	
	public void deposit(double balance){
		if(getBalance()-balance<(-1*credit_limit))
			System.out.println("Debit amount exceeded account balance.1");
		else
			setBalance(getBalance()-balance);
	}
	
	public void nextMonth(){
		if(getBalance()>=0)
			setBalance(getBalance() * (1+interest));
		else
			setBalance(getBalance() * (1+loan_interest));
	}
	
}
