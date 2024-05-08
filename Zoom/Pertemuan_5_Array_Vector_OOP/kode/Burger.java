
public class Burger {

	private String name;
	private int qty;
	private float price;
	
	public Burger(String name, int qty, float price) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	
	public void printBurger() {
		System.out.println("Nama burger: " + name);
		System.out.println("Quantity: " + qty);
		System.out.println("Price: " + price);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
