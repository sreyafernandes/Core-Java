package pack1;

public class diffAnds {
	public static void main(String[] args) {
		int a[]  = {1,2,3,4,5,6,7,8};
		int b=a[0],s=a[0];
		for(int i=0; i<a.length;i++)
		{
			if(a[i]<s)
				s=a[i];
			if(a[i]>b)
				b=a[i];
		}
		System.out.println("Difference : "+(b-s));
	}
}
