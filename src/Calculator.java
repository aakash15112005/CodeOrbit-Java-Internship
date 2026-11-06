import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		
		// Create Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		// Store user's menu choice
		int choice=0;
		// Repeat calculator until user chooses exit
		do {
			// Display available arithmetic operations 
			System.out.println();
			System.out.println("---Select an operation---");
			System.out.println();
			System.out.println(" 1. Addition");
			System.out.println(" 2. Subtraction");
			System.out.println(" 3. Multiplication");
			System.out.println(" 4 .Division");
			System.out.println(" 5 .Exit");
			System.out.println();
			
			// Handle invalid input from user
			try {
				System.out.print("Enter your choice : ");
				choice=sc.nextInt();
					if(choice==5) {
						System.out.println("Thank you for using calculator");
					}
					else if(choice < 1 || choice > 5) {
						System.out.println("Invalid choice");
					}
					else {
						System.out.print("Enter a number : ");
						double a = sc.nextDouble();
				
						System.out.print("Enter a number : ");
						double b = sc.nextDouble();
			
						System.out.println();			
		
						// Perform operation based on user's choice
						switch(choice)
						{
						case 1:
							System.out.println("Addition is : " + (a+b));
							break;
						case 2:
							System.out.println("Subtraction is : "+ (a-b));
							break;
						case 3:
							System.out.println("Multiplication is : "+ (a*b));
							break;
							
						// Perform division with zero handling
						case 4:
							try {
								if(b==0) {
									throw new ArithmeticException("Can not divide by zero");
								}
								else {
									System.out.println("Division is : " + (a/b));
									break;
								}
							}
							// Handle division by zero exception
							catch(ArithmeticException e) {
								System.out.println(e.getMessage());
								break;
							}
						default:
							System.out.println("Invalid input");
							break;
						}
					}
			}
			// Handle non-numeric input
			catch(InputMismatchException e){
				System.out.println("Please enter numbers only...");
				sc.next();
			}			
		}
		while(choice!=5);
		
		sc.close();
	}

}
