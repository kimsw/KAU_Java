import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTest {
	public static void main(String args[]){
		Valuable[] objectList = new Valuable[4];
		
		objectList[0] = new CheckingAccount(100,50,0.01,0.07);
		objectList[1] = new SavingsAccount(100,0.05);
		objectList[2] = new Human("Mark", 20);
		objectList[3] = new Car("MyCar", 5000);
		
		for(Valuable objectItem : objectList){
			System.out.printf("%s \n", objectItem.toString());
			System.out.printf("1 month later Valuable : %.2f\n\n", objectItem.estimateValue());
		}
		
		Account account1 = new CheckingAccount(100,50,0.01,0.07);
		Account account2 = new SavingsAccount(100,0.05);
		double amount;
		
		try{
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter deposit amount for Account1: ");
			amount=scan.nextDouble();
			account1.debit(amount);
			System.out.println("Account1 balance: $"+account1.getBalance());
			account1.passTime();
			System.out.println("1month later account1 : "+ account1.getBalance());
			
			System.out.println("Enter deposit amount for Account2: ");
			amount=scan.nextDouble();
			account2.debit(amount);
			System.out.println("Account1 balance: $"+account1.getBalance());
		}catch(InputMismatchException e){
			System.out.println("예외발생 : 숫자를 입력하세요\n" + e.toString());
		}
		catch(Exception e){
			System.out.println("예외발생   "+e.toString());		
		}
	} 

}