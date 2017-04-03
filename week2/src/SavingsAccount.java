
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
	   public void debit(double amount){
	      if(getWithdrawableAccount()>0){
	         setBalance(getBalance() - amount);
	      }
	      else
	         System.out.println("아직 출금할 수 없습니다.");
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

	@Override
	public double EstimateValue(int month){
		return getBalance()*Math.pow((1+interest),month);
	}
	
	@Override
	public String toString(){
		return String.format( "SavingsAccount_Balance: %.2f", getBalance());
	} 
}
