package pack1;

public class Hello2 {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.name = "Ram";
		h.age = 34;
		
		Hello h1 = new Hello();
		h1.name = "Rama";
		h1.age = 35;
		
		Hello h2 = new Hello();
		h2.setAge(25);
		h2.setName("Adele");
		
		Hello h3 = new Hello("Rehan", 56);
		
		Hello h4 = new Hello();
		
		System.out.println("Name of h : "+h.name);
		System.out.println("age of h : "+h.age);
		
		System.out.println("Name of h1 : "+h1.name);
		System.out.println("age of h1 : "+h1.age);
		
		System.out.println("Name of h2 : "+h2.getName());
		System.out.println("age of h2 : "+h2.getAge());
		
		System.out.println("Name of h3 : "+h3.name);
		System.out.println("age of h3 : "+h3.age);
		
		System.out.println("Name of h4 : "+h4.name);
		System.out.println("age of h4 : "+h4.age);
		
	}
}

