import java.util.ArrayList; //importing array function library
import java.util.Scanner; //importing function library
//start of code
public class BankApp {
	
public static void main(String[] args) {
	ArrayList<CDetails> al = new ArrayList<CDetails>(); //creating an array
	Scanner sc = new Scanner(System.in);  //sets input mode to keyboard **
	for (int j = 0; j < 10; j++) {
		System.out.println("What would you like to perform?\n1. Search for a customer\n2. Create a new customer\n3. Review customer list\n4. Exit");
		int option1 = sc.nextInt(); //takes input from keyboard
		boolean found = false; //sets the value of "found" as false
		if (option1 == 1)
			search_for_customer(al, sc, found);
		
		else if (option1 == 2)
			create_a_new_customer(sc, al);
		
		else if (option1 == 3) {
			for (int k = 0; k < al.size(); k++) {
				//CDetails c2 = al.get(k);
				System.out.println("Name: " +al.get(k).getName() +", Account number: " +al.get(k).getAccno() +", Balance: " +al.get(k).getblc());
			}
		}
		else if (option1 == 4) {
			System.out.println("Thank you!");
			break;
		}
	}
}

/*---Extracted methods---*/

private static void search_for_customer(ArrayList<CDetails> al, Scanner sc, boolean found) {
	System.out.println("Please enter the customer name: ");
	String name1 = sc.next();
	for (int k = 0; k < al.size(); k++) {
		if (name1.equals(al.get(k).getName())) {
			System.out.println("Your balance for account number " +al.get(k).getAccno() +" is: " +al.get(k).getblc());
			found = true;
		}
	}
	if (found == false) {
		System.out.println("The account doesn't exist.");
	}
}

private static void create_a_new_customer(Scanner sc, ArrayList<CDetails> al) {
	CDetails c1 = new CDetails(); //sets storage mode to CDetails
	System.out.print("Enter a new customer name: "); //displays string to console
	String name = sc.next(); //takes string value from keyboard
	c1.setName(name); //sets name variable
	System.out.print("Enter customer address: ");
	String address = sc.next();
	c1.setAddress(address); //sets address variable
	System.out.print("\nYour account number is " +c1.getAccno() +"\n");
	/* starts "for loop" */
	for (int i = 0; i < 10; i++) {
		System.out.println("Please perform an operation:\n Enter 1 for : Deposit\n Enter 2 for: Withdrawl\n Enter 3 for: Balance inquiry\n Enter 4 for: Exit");
		int option = sc.nextInt(); //sc.nextInt() takes input from assigned scanner
		/* start of "if else if statement" */
		if (option == 1) {
			System.out.println("Enter the deposit amount: ");
			double deposit = sc.nextDouble(); //double is bigger integer
			c1.addToBlc(deposit); //sets the value of deposit in "blc" subject
		}
		
		else if (option == 2) {
			System.out.println("Enter the withdrawl amount: ");
			double withdrawl = sc.nextDouble();
				if (c1.getblc() > withdrawl) {
					c1.addToBlc(withdrawl*-1);
					System.out.println("Your current balance is: "+c1.getblc());
				}
			else {
				System.out.println("You do not have sufficient funds.\nCurrent balance = " +c1.getblc() +"\n");
			}
		}
		
		else if (option == 3) {
			System.out.println("Your balance is: " +c1.getblc());
		}
		else if (option == 4) {
			System.out.println("Thank you!");
			break;
		}
		else {
			System.out.print("Please enter a valid option.\n\n");
		}
	
	}
	
al.add(c1);
}
}



