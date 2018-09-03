public class Palindrome {
	public static void main(String[] args) {
		String s = args[0];
		int len=s.length(), flag=0;
		System.out.println(s.toUpperCase());
		System.out.println(s.length());
		for(int i=0 ; i<len/2;i++)
		{
			if(s.charAt(i)!=s.charAt(len-i-1))
			{
				flag=1;
				System.out.println("Not a palindrome");
				break;
			}
		}
		if(flag==0)
			System.out.println("Palindrome");
	}
}
