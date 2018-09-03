package pack1;

public class ArrayDemo {
	public static void main(String[] args) {
//		int[] b;
//		b = new int[5];
//		int[] a = {1,2,3,4,5};
//		for(int val: a)
//		{
//			System.out.println(val);
//		}
		Hello hellos[] = new Hello[2];
		for(int i =0 ; i< hellos.length; i++)
		{
			hellos[i]= new Hello();
			System.out.println(hellos[i].getName());
			System.out.println(hellos[i].getAge());
		}
	}
}
