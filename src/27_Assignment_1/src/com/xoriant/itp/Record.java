package com.xoriant.itp;
import java.util.Scanner;

import com.xoriant.implementitp.Employee;
import com.xoriant.implementitp.InvalidBGException;

public class Record {
	
	static String[] BGS = {"A","B","O","AB","A+","B+","O+","AB+"};
	static int count[] = new int[8];
	
	public static void main(String[] args) throws InvalidBGException {
		int empID;
		String empName, iDU, bloodGroup;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("WELCOME TO XORIANT");
		Employee e[] = new Employee[2];
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Enter EmployeeID : ");
			empID = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter employee name: ");
			empName = sc.nextLine();
			System.out.println("Enter IDU: ");
			iDU = sc.nextLine();
			System.out.println("Enter bloodgroup: ");
			bloodGroup = sc.nextLine();
//			System.out.println(bloodGroup);
			e[i] = new Employee(empID, empName, iDU, bloodGroup);
			for(int n=0;n<BGS.length;n++)
			{
				if(BGS[n].equals(bloodGroup))
					count[n]++;
			}
		}
		Record.display();
	}
	public static void display() {
		System.out.println("BloodGroup   Count");
		for(int j=0;j<BGS.length; j++)
		{
			if(count[j]!=0)
				System.out.println("    "+BGS[j]+"    "+count[j]);
		}
	}
	
}
