package com.xoriant.implementitp;
import java.util.Scanner;

import com.xoriant.itp.*;

public class ParticipantMain {
	public static void main(String[] args) throws LessThanZero {
		int rollNo;
		float unix_marks, sql_marks, java_marks;
		String fname, mname, lname;
		Scanner sc = new Scanner(System.in);
		Participant p[] = new Participant[5];
		FullName f[] = new FullName[5];
		for(int i = 0; i<p.length;i++)
		{
			System.out.println("Enter first name: ");
			fname = sc.nextLine();
			System.out.println("Enter middle name: ");
			mname = sc.nextLine();
			System.out.println("Enter last name: ");
			lname = sc.nextLine();
			f[i] = new FullName(fname, mname, lname);
			System.out.println("Enter roll number: ");
			rollNo = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Unix marks: ");
			unix_marks = sc.nextFloat();
			System.out.println("Enter SQL marks: ");
			sql_marks = sc.nextFloat();
			System.out.println("Enter Java marks: ");
			java_marks = sc.nextFloat();
			p[i] = new Participant(rollNo, f[i], unix_marks, sql_marks, java_marks);
			System.out.println(p[i].findTotal());
			p[i].toString();
			
		}
		float total = p[0].findTotal();
		for(int i=1; i<p.length;i++)
		{
			if(p[i].findTotal()>total)
				total = p[i].findTotal();
		}
		System.out.println("Maximum total was : "+total);
	}
}
