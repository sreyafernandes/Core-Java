public class SearchArray {
	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int a[] = {7,25,5,13,30};
		int flag1=0,flag2=0;
		for(int i=0; i<a.length;i++)
		{
			if(a[i]==n1)
				flag1 = 1;
			else if(a[i]==n2)
				flag2 = 1;
			if(flag1==1 && flag2==1)
			{
				System.out.println("BINGO");
				break;
			}
		}
	}
}
