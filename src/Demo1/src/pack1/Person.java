package pack1;

import java.util.Scanner;

public class Person {
	String person_name;
	int person_id;
	long person_Telephone;
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public long getPerson_Telephone() {
		return person_Telephone;
	}
	public void setPerson_Telephone(long person_Telephone) {
		this.person_Telephone = person_Telephone;
	}
	public static void main(String[] args) 
	{
		Person p[] = new Person[3];
		DOB d[] = new DOB[3];
		int i=0, input=0;
		Scanner sc = new Scanner(System.in);
		while(i<3 && input!=4)
		{
			System.out.println("Menu");
			System.out.println("1. Add Person");
			System.out.println("2. Search Person");	
			System.out.println("3. Display all");
			System.out.println("4. Exit");
			input = sc.nextInt();
			sc.nextLine();
				switch(input)
				{
				case 1: p[i] = new Person();
						d[i] = new DOB();
						p[i].setPerson_id(sc.nextInt());
						sc.nextLine();
						p[i].setPerson_name(sc.nextLine());
						p[i].setPerson_Telephone(sc.nextLong());
						sc.nextLine();
						d[i].setDay(sc.nextInt());
						sc.nextLine();
						d[i].setMonth(sc.nextLine());
						i++;
				case 2: System.out.println("Please enter the person's name or id");
						
				}
		}
		if(i==3)
			System.out.println("You have entered data for more than 3 people");
		if(input==4)
			System.out.println("You hit exit");
			
	}
}

