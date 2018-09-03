
package pack1;

public class VarargsDemo {

	private void print(String s, int...intVarargs) {
		for(int i: intVarargs) 
		{
			System.out.println(i);
		}
	}
	private void print(int...intVarargs) {
		for(int i: intVarargs) {
			System.out.println(i);
		}


	}
	public static void main(String[] args) {
		VarargsDemo s = new VarargsDemo();
		s.print(1,2,3,4);
		s.print(0);
//		s.print("Hello..","How","are","you","?");
	}

}
