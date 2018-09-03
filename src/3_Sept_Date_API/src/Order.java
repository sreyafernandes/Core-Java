public class Order {
	
	private int id;
	private String name;
	private int quantity;
	private int price;
	private String orderStatus;

	public Order(int id, String name, int quantity, int price, String orderStatus) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.orderStatus = orderStatus;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getPrice() {
		return price;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

}
