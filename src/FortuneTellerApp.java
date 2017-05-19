import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first name:");

		String firstName = input.next();

		System.out.println("Enter your last name:");

		String lastName = input.next();

		System.out.println("Enter your age:");

		int age = input.nextInt();
		int divide = (age % 2);
		String retire = "";
		if (divide >= 1) {
			retire = "20 years";
		} else {
			retire = "2 years";
		}

		System.out.println("Enter your birth month (in numbers):");

		int birthMonth = input.nextInt();
		String money = "";
		if ((birthMonth <= 4) && (birthMonth >= 1)) {
			money = "$100,000";
		} else if ((birthMonth >= 5) && (birthMonth <= 8)) {
			money = "$5,000";
		} else if ((birthMonth >= 9) && (birthMonth <= 12)) {
			money = "$57";
		} else {
			money = "$0";
		}

		System.out.println(
				"Enter your favorite ROYGBIV color. Enter 'Help' if you would like a list of the ROYGBIV colors.");

		String color = input.next();
		if (color.toLowerCase().equals("help")) {
			System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, or Violet. Which is your favorite color?");
			color = input.next();
		}
		
		String transport = "";
		if (color.toLowerCase().equals("red")) {
			transport = "scooter";
		} else if (color.toLowerCase().equals("orange")) {
			transport = "pontoon boat";
		} else if (color.toLowerCase().equals("yellow")) {
			transport = "a new pair of running shoes";
		} else if (color.toLowerCase().equals("green")) {
			transport = "Tesla";
		} else if (color.toLowerCase().equals("blue")) {
			transport = "private jet";
		} else if (color.toLowerCase().equals("indigo")) {
			transport = "unicycle";
		} else if (color.toLowerCase().equals("violet")) {
			transport = "pogo stick";
		}

		System.out.println("How many siblings do you have?");

		int siblings = input.nextInt();

		String vacay = "";
		if (siblings == 0) {
			vacay = "Italy";
		} else if (siblings == 1) {
			vacay = "London";
		} else if (siblings == 2) {
			vacay = "New York";
		} else if (siblings == 3) {
			vacay = "Denver";
		} else if (siblings > 3) {
			vacay = "Lake Tahoe";
		} else {
			vacay = "Detroit";
		}
		System.out.println(firstName + " " + lastName + " will retire in " + retire + " with " + money
				+ " in the bank, a vacation home in " + vacay + " and travel by " + transport + ".");
		
		
input.close();
	} 
}
