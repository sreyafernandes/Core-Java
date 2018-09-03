package com.xoriant.implementitp;

public class PoliceCommisioner {
	int NoOfPoliceReporting;			 
	String WorkPlace;		
	int MedalHolds;			
	int NoOfPosting;
	public PoliceCommisioner(int noOfPoliceReporting, String workPlace, int medalHolds, int noOfPosting) {
		super();
		NoOfPoliceReporting = noOfPoliceReporting;
		WorkPlace = workPlace;
		MedalHolds = medalHolds;
		NoOfPosting = noOfPosting;
	}
	public int getNoOfPoliceReporting() {
		return NoOfPoliceReporting;
	}
	public void setNoOfPoliceReporting(int noOfPoliceReporting) {
		NoOfPoliceReporting = noOfPoliceReporting;
	}
	public String getWorkPlace() {
		return WorkPlace;
	}
	public void setWorkPlace(String workPlace) {
		WorkPlace = workPlace;
	}
	public int getMedalHolds() {
		return MedalHolds;
	}
	public void setMedalHolds(int medalHolds) {
		MedalHolds = medalHolds;
	}
	public int getNoOfPosting() {
		return NoOfPosting;
	}
	public void setNoOfPosting(int noOfPosting) {
		NoOfPosting = noOfPosting;
	}
	
}
