package pack1;

public class Qyes11 {
	public static void main(String[] args) {
		int[] a = {0,0,1,1,2,2,3,3,4,4};
		boolean flag=false;
		int[] b = new int[20];
		int j,count=0;
		for(int i=0; i< a.length; i++)
		{
			flag=false;
			for(j=0;j<count;j++)
			{
				if(a[i]==b[j])
				{
					flag=true;
				}
			}
			if(flag==false)
			{
				b[count]=a[i];
				count++;
			}
			
		}
		for(int val: b)
			System.out.println(val);
		System.out.println("Length of the array is "+count);
	}
}
