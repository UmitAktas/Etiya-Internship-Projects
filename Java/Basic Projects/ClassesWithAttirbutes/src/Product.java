public class Product {

	public Product(int id, String name, String description, double price, int stockAmount) {
		System.out.println("Product constructor çalıştı.");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
	}

	public Product() {

	}

	// attribute & field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String kod;

	public String getKod() {
		return this.name.substring(0, 1) + id;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// getter
	public int getId() {
		return id;
	}

	// setter
	public void setId(int id) {
		// this.id = id; //This.id = Product classında tanımlanmış private int id'deki
		// id'dir.
		id = id;
	}

}
