package pack1;

import java.util.Scanner;

public class DictionaryUtility {
	
	String name;
	String meaning[] = new String[3];
	int nom;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
//		DictionaryUtility d = new DictionaryUtility(3);
//		d.setName("dog");
//		System.out.println(d.getName());
//		for(int i=0;i<d.nom; i++)
//		{
//			d.meaning[i]="doggie";
//			System.out.println(d.meaning[i]);
//		}
//		
//		DictionaryUtility a = new DictionaryUtility(2);
//		a.setName("apple");
//		System.out.println(a.getName());
//		for(int i=0;i<a.nom; i++)
//		{
//			a.meaning[i]="appy";
//			System.out.println(a.meaning[i]);
//		}
		Scanner sc = new Scanner(System.in);
		
		DictionaryUtility dicts[] = new DictionaryUtility[5];
		for(int i=0; i<5; i++)
		{
			dicts[i] = new DictionaryUtility();
			System.out.println("Enter a name");
			dicts[i].setName(sc.nextLine());
			sc.nextLine();
			for(int j=0; j<dicts[i].meaning.length; j++)
			{
			System.out.println("Enter meaning "+(j+1)+" for "+dicts[i].getName()+":");
			dicts[i].meaning[j]=sc.nextLine();
			}
		}

	}
}

