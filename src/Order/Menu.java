package Order;

public class Menu {

	String name;
	String size;
	Double price;
	int qty;
	
	public Menu(String name, String size, Double price) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
		
	}
	
	public double getPrice() {
		return this.price * this.qty;
		
	}
	
	@Override
	public String toString() {
		return "Menu [name=" + name + ", size=" + size + ", price=" + price + "]";
	}
}
