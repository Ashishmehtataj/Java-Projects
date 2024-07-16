import java.util.*;
class practice{

	float add(float a,float b){
		return a+b;
	}
	float sub(float a,float b){
		return a-b;
	}
	float mul(float a,float b){
		return  a*b;
	}
	float div(float a,float b){
		return a/b;
	}
	float rem(float a,float b){
		return a%b;
	}

	void intro(){
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Subtraction");
		System.out.println("Enter 3 for Multiplication");
		System.out.println("Enter 4 for Division");
		System.out.println("Enter 5 for Reminder");
		System.out.println("Enter 6 for Exit");
		System.out.print("Enter your choice : ");
	}

	void thanks(){
		System.out.println("Thankyou for using calculator!");
		System.out.println("-------------------------------------------------------------");
		System.out.println();
	}

	public static void main(String args[]){
		practice p = new practice();
		Scanner input = new Scanner(System.in);
		int choice=0;
		while(choice!=6){	
			p.intro();
			choice = input.nextInt();
			switch(choice){
				case 1:
					float a,b;
					System.out.print("Enter first number : ");
					a = input.nextFloat();
					System.out.print("Enter second number : ");
					b = input.nextFloat();
					float addition = p.add(a,b);
					System.out.println("The addition of "+a+" and "+b+" is "+addition);
					p.thanks();
					break;

				case 2:
					float c,d;
					System.out.print("Enter first number : ");
					c = input.nextFloat();
					System.out.print("Enter second number : ");
					d = input.nextFloat();
					float subtraction = p.sub(c,d);
					System.out.println("The Subtraction of "+c+" and "+d+" is "+subtraction);
					p.thanks();
					break;

				case 3:
					float e,f;
					System.out.print("Enter first number : ");
					e = input.nextFloat();
					System.out.print("Enter second number : ");
					f = input.nextFloat();
					float multiplication = p.mul(e,f);
					System.out.println("The Multiplication of "+e+" and "+f+" is "+multiplication);
					p.thanks();
					break;

				case 4:
					float g,h;
					System.out.print("Enter first number : ");
					g = input.nextFloat();
					System.out.print("Enter second number : ");
					h = input.nextFloat();
					float division = p.div(g,h);
					System.out.println("The Division of "+g+" and "+h+" is "+division);
					p.thanks();
					break;

				case 5:
					float i,j;
					System.out.print("Enter first number : ");
					i = input.nextFloat();
					System.out.print("Enter second number : ");
					j = input.nextFloat();
					float reminder = p.rem(i,j);
					System.out.println("The Reminder of "+i+" and "+j+" is "+reminder);
					p.thanks();
					break;

				case 6:
					p.thanks();
					System.exit(0);
					break;

				default:
					System.out.println("Invalid choice please select a valid choice!!");
					p.thanks();
					break;
			}
		}
	}
}
