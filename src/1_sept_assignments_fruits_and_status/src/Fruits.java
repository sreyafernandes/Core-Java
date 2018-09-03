import java.util.Comparator;

public class Fruits implements Comparator<Fruits>{
	String name; 
	int calories; 
	int price;
	String color;
	
	public Fruits() {
		
	}
	public Fruits(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	@Override
	public String toString() {
		return "Fruits [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public int compare(Fruits arg0, Fruits arg1) {
		Integer a = arg0.getCalories();
		Integer b = arg1.getCalories();
		return a.compareTo(b);
	} 
	
	public static int compareByColor(Fruits p1, Fruits p2)
	{
		return p1.getColor().compareTo(p2.getColor());
	}
	
}
