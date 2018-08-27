public class ImplementingSortable {
	public static void main(String[] args) {
		Circle c1  = new Circle();
		Circle c2  = new Circle();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		c1.setArea(51);
		c2.setArea(50);
		c1.compare(c1.getArea(), c2.getArea());
		e1.setId(1);
		e2.setId(2);
		e2.compare(e1.getId(), e2.getId());
	}
}
