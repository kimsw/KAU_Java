
public class SavingsAccount extends Account {
	private int contract_month;
	private boolean expiration_date;
	private double interest;
	
	public SavingsAccount(double balance, double interest){
		super(balance);
		this.interest = interest;
		this.contract_month = 12;
		this.expiration_date = false;
	}
	
	@Override
	public void debit(double balance) throws Exception{
		if(getWithdrawableAccount()>0){
			setBalance(getBalance() - balance);
		}
		else if(balance<0)
			throw new Exception("음수 입력!");
		else
			throw new Exception("아직 출금할 수 없습니다.");
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
	      if(contract_month<=0 && !expiration_date){
	         setBalance(getBalance() * Math.pow((1+interest), 12));
	         expiration_date = true;
	      }
	}
	
	public void passTime(){
		if(contract_month > 0)
			contract_month -= 1;
		if(contract_month<=0 && !expiration_date){
			setBalance(getBalance() * Math.pow((1+interest), 12));
			expiration_date = true;
		}
	}

	@Override
	public double estimateValue(int month){
		return getBalance()*Math.pow((1+interest),month);
	}
	@Override
	public double estimateValue() {
		int month = 1;
		return (getBalance() * Math.pow((1+interest), month));
	}
	
	@Override
	public String toString(){
		return String.format( "SavingsAccount_Balance: %.2f", getBalance());
	} 
}
