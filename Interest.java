// Julia Wang
// APCS, Period 1
// creates an interest calculator.


import java.util.*;

public class Interest {
	
	// creates static variables
	static double investment;
	static double deposit;
	static int years;
	static double interest;
	
	
	public static void main(String[] args) {
		input();
		table();
	}
	
	
	public static void input() {
	// implements a scanner that asks user for investment, deposit, years, and interest rate
		Scanner console = new Scanner(System.in);
		System.out.println("Enter your initial investment:");
		investment = console.nextDouble();
		System.out.println("Enter your annual deposit:");
		deposit = console.nextDouble();
		System.out.println("Enter number of years:");
		years = console.nextInt();
		System.out.println("Enter interest rate:");
		interest = console.nextDouble();
		System.out.println();
	}
	
	
	public static void table() {		
		System.out.println("Year\tInterest\tDeposit\t\tBalance");
		System.out.println("start\t\t\t\t\t" + investment);
		
		// calculates interest and final balance after x years
		
		for (int i = 1; i <= years; i++) {
			double interestMade = interest / 100 * investment;
			interestMade = (Math.floor(interestMade * 100.0)) / 100.0;
			investment = interestMade + deposit + investment;
			investment = (Math.floor(investment * 100.0)) / 100.0;
			System.out.println(i + "\t" + interestMade + "\t\t" + deposit + "\t\t" + investment);
		}
	}

}
