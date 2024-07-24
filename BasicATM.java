import java.util.*;
class ATM{
	Scanner input = new Scanner(System.in);
	float Balance;
	int PIN = 2580;
	
	void Check_Pin() {
		System.out.print("Enter your PIN : ");
		int pin;
		pin  = input.nextInt();
		if(pin==PIN) {
			menu();
		}else {
			System.out.println("Invalid PIN please enter a valid PIN");
		}
	}
	
	void menu() {
		int choice = 0;
		while(choice!=4) {
			System.out.println("Enter 1 for Deposite");
			System.out.println("Enter 2 for Withdraw");
			System.out.println("Enter 3 for Check Balance");
			System.out.println("Enter 4 for Exit");
			System.out.print("Enter your choice : ");
			choice = input.nextInt();
			switch(choice) {
				case 1:
					float deposite;
					System.out.print("Enter amount you want to Deposite : ");
					deposite = input.nextFloat();
					if(deposite>0) {
						Balance = Balance + deposite;
						System.out.println("Your amount is Deposite successfully");
					}else {
						System.out.println("Invalid input!!");
					}
					System.out.println("Thankyou for using ATM");
					System.out.println();
					System.out.println();
					break;
					
				case 2:
					System.out.print("Enter amount you want to Withdraw : ");
					float withdraw = input.nextFloat();
					if(withdraw>Balance) {
						System.out.println("Insufficient Balance!!");
					}else {
						Balance  = Balance-withdraw;
						System.out.println("Please collect your money");
					}
					System.out.println("Thankyou fou using ATM");
					System.out.println();
					System.out.println();
					break;
					
				case 3:
					System.out.println("Your Balance is "+Balance);
					System.out.println();
					System.out.println();
					break;
					
				case 4:
					System.out.println("Thankyou for using ATM");
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid choice please select a valid choice!!");
					System.out.println();
					System.out.println();
					break;
			}
		}
	}
}
public class ATMM {
	public static void main(String args[]) {
		ATM atm = new ATM();
		atm.Check_Pin();
	}
}
