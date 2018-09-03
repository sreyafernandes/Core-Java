public class Fibonnaci {
	public static void main(String[] args) 
	{
		System.out.print(args[0]);
		System.out.print(" "+args[1]);
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int temp;
		for(int i=0;i<13;i++)
		{
			System.out.print(" "+(n1+n2));			
			temp=n2;
			n2=n1+n2;
			n1=temp;
//			System.out.println("n1: "+n1);
//			System.out.println("n2 : "+n2);
		}
	}
	
}
