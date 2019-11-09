
public class RemoteControlApp {

	public static void main(String[] args) {

				printMenu();
				java.util.Scanner kb = new java.util.Scanner(System.in);
			    	
				System.out.println("This is the Remote Control 5000... a glowing ON button calls to you...");
				String turnon = kb.next();
				
				if (turnon.equals("ON") || turnon.equals("On") || turnon.equals("on")) {
					System.out.println("Welcome to JAVA TV+ - where every channel takes a part of your soul");
				}
				
				else {
					System.err.println("You need to turn me on... cough - try again");
				}
					
				String choice = "";
				do {
					choice = kb.next();
					switch (choice) {
					
					case "1":
						printButtonboop();
						break;

					case "2":
						printButtonboop();
						break;

					case "3":
						printButtonboop();
						break;

					case "4":
						printButtonboop();
						break;

					case "5":
						printButtonboop();
						break;

					case "6":
						printButtonbeep();
						break;
						
					case "7":
						printButtonbeep();
						break;
						
					case "8":
						printButtonbeep();
						break;
						
					case "9":
						printButtonbeep();
						break;
						
					case "0":
						printButtonbeep();
						break;

					case "00":
						printButtontime();
						break;
					
					case "Off":
						printOff();
						break;

					case "off":
						printOff();
						break;
					}

				} while (!choice.equalsIgnoreCase("Off"));
				
//				int counter = 0; // thought make counter variable requires 2 digit input on remote
			  
//				while (counter < 2)
//			    	counter = counter +1;
			    
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

			public static void printOn() {
				System.out.println("Welcome To Java TV+");
			}

			public static void printButtonboop() {
				System.out.println("BOOOOP");
			}

			public static void printButtonbeep() {
				System.out.println("BEEEEP");
			}

			public static void printOff() {
				System.out.println("You have enrolled in Java TV+ autobill for $59 per month");
			}

			public static void printButtontime() {
				System.out.println("You have entered an infinite loop");
			}

		
			

}

// TODO: ADD pressButton() method
// TODO: Add turnOn() method

