public class Demo {
	public static void main(String[] args) {
		AnInterface aClass = new AClass();
		aClass.m1();
		aClass.m2();
		
		AnInterface aI = new AnInterface() {
			
			@Override
			public void m2() {
				System.out.println("m2");
				
			}
			
			@Override
			public void m1() {
				System.out.println("m1");
				
			}
		};
	}
}
