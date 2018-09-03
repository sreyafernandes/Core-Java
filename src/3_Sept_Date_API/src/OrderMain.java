public class OrderMain {
	public static void main(String[] args) {
		Order o = new Order(1, "apples", 4, 50, "new");
		String s = o.getOrderStatus().toUpperCase();
		
	}
}
