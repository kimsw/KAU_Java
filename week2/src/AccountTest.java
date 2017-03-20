import java.util.Scanner;


public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account();
		Account account2 = new Account();
		Scanner input = new Scanner(System.in);
		double amount=0;
	
		int a = 0;
		while(a!=4){
			a=input.nextInt();
			switch(a){
			case 1:
				System.out.print("Account1에 입금할 금액: ");
				amount = input.nextDouble();
				account1.credit(amount);
				System.out.print("Account1에 입금할 금액: ");
				amount = input.nextDouble();
				account2.credit(amount);
			
				System.out.printf("Account1의 잔액 : $%.2f\n",account1.getBalance());
				System.out.printf("Account2의 잔액 : $%.2f\n", account2.getBalance());
				break;
			case 2:
				System.out.print("Account1에서 출금 할 금액: \n");
				amount = input.nextDouble();
				account1.debit(amount);
				System.out.print("Account2에서 출금 할 금액: \n");
				amount = input.nextDouble();
				account2.debit(amount);
			
				System.out.printf("Account1의 잔액 : $%.2f\n",account1.getBalance());
				System.out.printf("Account2의 잔액 : $%.2f\n", account2.getBalance());
				break;
			case 3:
				System.out.printf("Account1의 잔액 : $%.2f\n",account1.getBalance());
				System.out.printf("Account2의 잔액 : $%.2f\n", account2.getBalance());
				break;
	
			}
			
		}
	}

}
