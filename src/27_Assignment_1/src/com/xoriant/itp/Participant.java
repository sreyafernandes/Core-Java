package com.xoriant.itp;

public class Participant {
	int rollNo; 		
	FullName name;
	float unix_marks;
	float sql_marks;
	float java_marks;
	float total;
	public Participant(int rollNo, FullName name, float unix_marks, float sql_marks, float java_marks) throws LessThanZero{
		super();
		this.rollNo = rollNo;
		this.name = name;
		if(unix_marks<0 || sql_marks<0 || java_marks<0)
		{
			throw new LessThanZero("Marks can not be less than zero");
		}
		else 
		{
			this.unix_marks = unix_marks;
			this.sql_marks = sql_marks;
			this.java_marks = java_marks;
		}
	}
	public float findTotal() {
		float total;
		total = unix_marks+sql_marks+java_marks;
		return total;
	}
	@Override
	public String toString() {
		return "Participant [rollNo=" + rollNo + ", name=" + name + ", unix_marks=" + unix_marks + ", sql_marks="
				+ sql_marks + ", java_marks=" + java_marks + ", total=" + total + "]";
	}
	
}
