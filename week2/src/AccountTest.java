import java.util.Scanner;


public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new CheckingAccount(100,50,0.01,0.07);
		Account account2 = new SavingAccount(100,0.05);
		
		Scanner input = new Scanner(System.in);
		double amount=0;
		
	/*	System.out.print("Account1에 입금할 금액: ");
		amount = input.nextDouble();
		account1.credit(amount);
	*/	
		
		System.out.print("Account1에서 출금 할 금액: \n");
		amount = input.nextDouble();
		account1.debit(amount);			
		System.out.printf("Account1의 잔액 : $%.2f, 출금가능금액 : $%.2f\n",
				account1.getBalance(), account1.getWithdrawableAccount());
		CheckingAccount c = (CheckingAccount)account1;
		c.isBankrupted();
		account1.passTime(1);
		System.out.printf("Account1의 잔액 : $%.2f, 출금가능금액 : $%.2f\n",
				account1.getBalance(), account1.getWithdrawableAccount());
		c.isBankrupted();
		account1.passTime(5);;
		System.out.printf("Account1의 잔액 : $%.2f, 출금가능금액 : $%.2f\n",
				account1.getBalance(), account1.getWithdrawableAccount());
		c.isBankrupted();
		
		
		System.out.printf("Account1의 잔액 : $%.2f\n",account1.getBalance());
		System.out.printf("Account2의 잔액 : $%.2f\n", account2.getBalance());
		
			
		
	}

}
