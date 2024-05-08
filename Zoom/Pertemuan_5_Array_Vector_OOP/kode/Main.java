import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	ArrayList<Burger> burgers = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	
	public Main() {
		burgers.add(new Burger("Cheese Burger", 15, (float)4.30));
		burgers.add(new Burger("Chicken Burger", 20, (float)4.70));
		burgers.add(new Burger("Beef Burger", 23, (float)5.40));
		burgers.add(new Burger("Salad Burger", 13, (float)4.00));
		
		String nama;
		int qty;
		float price;
		
		nama = scan.nextLine();
		qty = scan.nextInt();
		price = scan.nextFloat();
		
		burgers.add(new Burger(nama, qty, price));
		
		for(Burger b : burgers) {
			System.out.println("-----------------------");
			b.printBurger();
		}
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
