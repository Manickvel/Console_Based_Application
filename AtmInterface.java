import java.util.Scanner;
class Atm extends UserBankAccount{
	public void Withdraw(int Amount) {
		if(AccountBalance == 0) {
			System.out.println("Please Deposit Some Amount before Withdrawing");
		}
		else if(AccountBalance < Amount) {
			System.out.println("Your Withdraw Amount is Higher Than Your balance... Please Check Bank Balance Before Withdrawing");
		}
		else {
			System.out.println("You Withdraw the Amount " + Amount + " Successfully ");
			AccountBalance-=Amount;
		}
	}
	public void Depositing(int Amount){
		System.out.println("You Deposit the Amount " + Amount + " Successfully ");
		AccountBalance+=Amount;
	}
	public void CheckBalance() {
		System.out.println("Your Current Account Balance is " + AccountBalance);
	}
}
class UserBankAccount{
	int AccountBalance=0;
}
class Bank{
	Atm a = new Atm();
	Scanner sc = new Scanner(System.in);
	void input(int Option) {
		if(Option == 1) {
			System.out.println("Please enter the Amount to Withdraw:");
			int Amount = sc.nextInt();
			a.Withdraw(Amount);
		}
		else if(Option == 2) {
			System.out.println("Please enter the Amount to Deposit:");
			int Amount = sc.nextInt();
			a.Depositing(Amount);
		}
		else if(Option == 3) {
			a.CheckBalance();
		}
		else {
			System.out.println("Please Enter the Correct Option");
		}
	}
	}
public class AtmInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		Bank b = new Bank();
		System.out.println("You Already Have a Bank Account in this Bank [Y/N]");
			while(true){
				System.out.printf("Please Enter the Operation\n 1.Withdraw \n 2.Deposit\n 3.Check Balance \n 4.Exit\n");
				int Option = sc.nextInt();
				if(Option == 4) {
					System.out.println("Thanks for Visiting and Come Back Again");
					break;
				}
				b.input(Option);
				}
			sc.close();
		}
}

