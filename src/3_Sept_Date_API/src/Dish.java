import java.util.*;
import static java.util.stream.Collectors.toList;
import static java.util.Comparator.comparing;

public class Dish {
	public enum Type{ MEAT, FISH, OTHER};
	private String name;
	private boolean veg;
	private Integer calories;
	private Type type;
	
	public Dish(String name, boolean veg, Integer calories, Type type) {
		super();
		this.name = name;
		this.veg = veg;
		this.calories = calories;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Dish [name=" + name + "]";
	}
	public boolean isVeg() {
		return veg;
	}
	public Integer getCalories() {
		return calories;
	}
	public Type getType() {
		return type;
	}
	
	public static final List<Dish> d = Arrays.asList(new Dish("ramen", false, 400, Dish.Type.MEAT),
													 new Dish("nato", false, 450, Dish.Type.FISH),
													 new Dish("pork cutlets", false, 540, Dish.Type.MEAT),
													 new Dish("french fries", true, 340, Dish.Type.OTHER),
													 new Dish("rice", true, 480, Dish.Type.OTHER),
													 new Dish("prawns", false, 940, Dish.Type.FISH),
													 new Dish("salmon", false, 470, Dish.Type.FISH),
													 new Dish("takoyaki", false, 340, Dish.Type.FISH),
													 new Dish("amazake", true, 407, Dish.Type.OTHER));
	
	public static int compareByCalories(Dish p1, Dish p2)
	{
		return p1.getCalories().compareTo(p2.getCalories());
	}
	
	public Dish() {
		super();
	}
	public List<Dish> gLCD(List<Dish> dishes){
		List<Dish> ld = new ArrayList<>();
		for (Dish dish : dishes) {
			if(dish.getCalories()<400)
			{
				ld.add(dish);
			}
		}
		Collections.sort(ld, Dish::compareByCalories);
		System.out.println(ld);
		return null;
	}
	
	//java 8
	public static List<String> gLCDJava8(List<Dish> dishes)
	{
		return dishes.stream()
				.filter(d -> d.getCalories()<400)
				.sorted(comparing(Dish::getName))
				.map(Dish::getName)
				.collect(toList());
	}
}
