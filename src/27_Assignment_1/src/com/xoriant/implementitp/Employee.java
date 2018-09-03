package com.xoriant.implementitp;

import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

public class Employee {
	int empID;
	String empName;
	String IDU;
	public String bloodGroup;
	public Employee(int empID, String empName, String iDU, String bloodGroup) throws InvalidBGException {
		super();
		this.empID = empID;
		this.empName = empName;
		IDU = iDU;
		if(bloodGroup.equals("A") || bloodGroup.equals("B") || bloodGroup.equals("AB") || bloodGroup.equals("O") || bloodGroup.equals("A+") || bloodGroup.equals("B+") || bloodGroup.equals("AB+") || bloodGroup.equals("O+"))
			this.bloodGroup = bloodGroup;
		else
			throw new InvalidBGException();
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getIDU() {
		return IDU;
	}
	public void setIDU(String iDU){
		IDU = iDU;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
//	public void setBloodGroup(String bloodGroup) throws InvalidBGException {
//		if(bloodGroup.equals("A") || bloodGroup.equals("B") || bloodGroup.equals("AB") || bloodGroup.equals("O") || bloodGroup.equals("A+") || bloodGroup.equals("B+") || bloodGroup.equals("AB+") || bloodGroup.equals("O+"))
//			this.bloodGroup = bloodGroup;
//		else
//			throw new InvalidBGException();
//	}
}
