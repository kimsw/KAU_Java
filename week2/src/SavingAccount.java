
public class SavingAccount extends Account {
	private int contract_month;
	private boolean expiration_date;
	private double interest;
	
	public SavingAccount(double balance, double interest){
		super(balance);
		this.interest = interest;
		this.contract_month = 12;
		this.expiration_date = false;
	}
	
	@Override
	public void debit(double amount){
		if(contract_month!=0)
			System.out.println("Can't withdraw");
		else{
			if(amount>=getWithdrawableAccount())
				setBalance(getBalance()-amount);
			else
				System.out.println("exceeded amount!!");
		}
	}
	
	public double getWithdrawableAccount(){
		if(contract_month == 0)
			return getBalance();
		else
			return 0;
	}
	
	public void passTime(int month){
		if(contract_month > 0)
			contract_month -= month;
		if(contract_month <=0 && !expiration_date){
			setBalance(getBalance()+Math.pow((1+interest), 12));
			expiration_date = true;
		}		
	}
}
