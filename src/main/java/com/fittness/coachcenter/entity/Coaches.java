package com.fittness.coachcenter.entity;

public class Coaches {

	private int coachRefNum;
	private String coachName;
	private int coachContactNumber;
	private String coachEmailId;

	public Coaches(int coachRefNum, String coachName, int coachContactNumber, String coachEmailId) {
		this.coachRefNum = coachRefNum;
		this.coachName = coachName;
		this.coachContactNumber = coachContactNumber;
		this.coachEmailId = coachEmailId;
	}

	public int getCoachRefNum() {
		return coachRefNum;
	}

	public void setCoachRefNum(int coachRefNum) {
		this.coachRefNum = coachRefNum;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public int getCoachContactNumber() {
		return coachContactNumber;
	}

	public void setCoachContactNumber(int coachContactNumber) {
		this.coachContactNumber = coachContactNumber;
	}

	public String getCoachEmailId() {
		return coachEmailId;
	}

	public void setCoachEmailId(String coachEmailId) {
		this.coachEmailId = coachEmailId;
	}

	@Override
	public String toString() {
		return "Coaches [coachRefNum=" + coachRefNum + ", coachName=" + coachName + ", coachContactNumber="
				+ coachContactNumber + ", coachEmailId=" + coachEmailId + "]";
	}

}
