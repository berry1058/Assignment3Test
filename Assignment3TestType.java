package com.descriptions;


public class Assignment3TestType extends Assignment3Abstract {

	String testType = null;
	String testGrade = null;
	
	
	public Assignment3TestType(String testType, String testGrade) {
		super();
		this.testType = testType;
		this.testGrade = testGrade;
	}
	
	

	public String getTestType() {
		return testType;
	}



	public void setTestType(String testType) {
		this.testType = testType;
	}



	public String getTestGrade() {
		return testGrade;
	}



	public void setTestGrade(String testGrade) {
		this.testGrade = testGrade;
	}



	public Assignment3TestType() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void isDue() {
		// TODO Auto-generated method stub

	}

	@Override
	public void isGraded() {
		// TODO Auto-generated method stub

	}

}
