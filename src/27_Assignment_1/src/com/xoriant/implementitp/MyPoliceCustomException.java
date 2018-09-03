package com.xoriant.implementitp;

public class MyPoliceCustomException extends Exception{
	 public MyPoliceCustomException() {
		 System.out.println("Either number of medal holsd or posting is zero");
	}
}
