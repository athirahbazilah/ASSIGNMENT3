import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		
		printCustomer();
		printTicket();
	}
	public static void printCustomer() {
		
		System.out.println("**********WELCOME TO OUR TRAIN STATION**********");
		System.out.println();
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter Name: ");
		String name = in.nextLine();
		System.out.println("Name: " + name);
		System.out.println();
		System.out.print("Enter Work: ");
		String work = in.nextLine();
		System.out.println("Work: " + work);
		System.out.println();
		System.out.print("Enter Age: ");
		int age = in.nextInt();
		System.out.println("Age: " + age);
		System.out.println();
		
		System.out.print("How many person with you?" );
        int person = in.nextInt();
        for (int i=0; i<=person; i++); {
        	System.out.print("Enter Your Partner Name: ");
        	String name2 = in.next();
        }
		
		System.out.print("Enter salary: ");
		int salary = in.nextInt();
		System.out.println("Salary: " + salary);
		System.out.println();
		
		System.out.println("Enter customer background: " + name + "\n\t\t " + age + "\n\t\t " + work + "\n\t\t " + salary);
		System.out.println();
	}

	
		public static void printTicket() {
			
			Scanner in = new Scanner (System.in);
			
			String[] routes = {"Batu Cave to Pulau Sebang", "Tanjung Malim to Pelabuhan Klang", "Padang Rengas to Bukit Mertajam", "Butterworth to Padang Besar", "Pulau Sebang to Batu Cave", "Pelabuhan Klang to Tanjung Malim", "Bukit Mertajam to Padang Rengas", "Padang Besar to Butterworth"};
			
			System.out.println("These are the routes that our station provided: ");
			
			for (int i = 0; i < routes.length; i++) {
				System.out.println(routes[i]);
				System.out.println();
				
			}
			
			int[] fee = new int[8];
			fee[0] = 35;
			fee[1] = 30;
			fee[2] = 32;
			fee[3] = 40;
			fee[4] = 33;
			fee[5] = 31;
			fee[6] = 34;
			fee[7] = 38;
			
			System.out.println("These are the list of fee base on the route: ");
			
			for (int j = 0; j < fee.length; j++) {
				System.out.println(fee[j]);
		
			}
			
			int i1 = 35;
			int i2 = 30;
			int i3 = 32;
			int i4 = 40;
			int i5 = 33;
			int i6 = 31;
			int i7 = 34;
			int i8 = 38;
				
			if (i1 < i4) {
				System.out.println("Route4 cheaper");
			}
			if (i1 > i4) {
				System.out.println("Route1 more pricey");
			}
			if (i2 > i6) {
				System.out.println("Route2 more pricey");
			}
			if (i2 < i6) {
				System.out.println("Route2 cheaper");
			}
			if (i3 >= i7) {
				System.out.println("Route3 much pricey");
			}
			if (i3 <= i7) {
				System.out.println("Route3 much cheaper");
			}
			if (i4 <= i8) {
				System.out.println("Route4 much cheaper");
			}
			if (i4 >= i8) {
				System.out.println("Route4 much pricey");
			}
			
			System.out.print("What route path that you want to go: " + routes[0]);
			System.out.println();
			System.out.print("Fee that customer need to pay: " + fee[0]);
			System.out.println();
			
			System.out.println("**********THANK YOU FOR YOUR PURCHASE**********");
		
		
		
		
		
		

	}

}
