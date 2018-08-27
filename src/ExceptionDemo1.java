
public class ExceptionDemo1 {
	public static void main(String[] args) {
		int a, b, c;
		a=10;
		b=1;
		try {
		c=a/b;
		System.out.println("c is : "+c);
		String str = "Hello";
		System.out.println(str.charAt(10));
		}
		catch(ArithmeticException | StringIndexOutOfBoundsException e) {
			System.out.println("Error");
			e.printStackTrace();
//			String str= "e";
//			System.out.println(str.charAt(11));
		}
		catch(Exception e) {
			System.out.println("Generic exception");
		}
		finally{
			String str= "e";
			System.out.println("Excuted always :)");
		}
	}
}
