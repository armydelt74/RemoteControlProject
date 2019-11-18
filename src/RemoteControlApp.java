import java.util.Scanner;

public class RemoteControlApp {

	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		printMenu();
		boolean on = true; //Used boolean for True/False until caps "ON" condition met
		while (on == true) {

			System.out.println("TO BEGIN TURN ON THE REMOTE CONTROL 5000");

			String turnon = kb.next();

			if (turnon.equals("ON")) {
				on = false;
				System.out.println("TURNING ON");
				greetIn();
			}

		}
		powerOn();
		kb.close();
	}

	public static void powerOn() {
		Scanner kb = new Scanner(System.in);
		String choice = "";
		choice = kb.next().toLowerCase();
		switch (choice) {

		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "0":
			printButtonboop(); // Case 0-9 call printButton method (fall through method)
			break;		
			
		case "off":			
			printOff();
			break;
			
		default: 
			printWrong(); // Command not recognized mirrors printButtonboop method with nested powerOn method creating a looping fall through method.
		}
	//while (!choice.equalsIgnoreCase("Off")) {

		kb.close();
	}

	public static void printMenu() {
		System.out.println("?????????????????");
		System.out.println("|***** ON ******|");
		System.out.println("|*1* *2* *3* *4*|");
		System.out.println("|***************|");
		System.out.println("|*5* *6* *7* *8*|");
		System.out.println("|***************|");
		System.out.println("| *9* *0* *00*  |");
		System.out.println("&&&&&&&&&&&&&&&&&");

	}

	public static void greetIn() {
		System.out.println(
				"Welcome to JAVA TV+ - where every channel takes a part of your soul, please select your channel");
	}

	public static void printButtonboop() {
		System.out.println("BOOOOP");
		System.out.println("Please enter 0-9");
		powerOn();

	}
	
	public static void printWrong() {
		System.out.println("Command not recognized");
		powerOn();
		
	}

	public static void printOff() {
		System.out.println("You have enrolled in Java TV+ autobill for $59 per month, Goodbye");
	}

}
//
//// TODO: ADD pressButton() method
//// TODO: Add turnOn() method
