package com.ssafy.trip.model;

public class MyTrip {
	private int mytripNo;
	private String id;
	private int sido_code;
	private String title;
	private String regTime;
	private String startPeriod;
	private String endPeriod;
	
	public MyTrip() {
		super();
	}

	public MyTrip(String id, int sido_code, String title, String startPeriod, String endPeriod) {
		super();
		this.id = id;
		this.sido_code = sido_code;
		this.title = title;
		this.startPeriod = startPeriod;
		this.endPeriod = endPeriod;
	}

	public MyTrip(int mytripNo, String id, int sido_code, String title, String regTime, String startPeriod, String endPeriod) {
		super();
		this.mytripNo = mytripNo;
		this.id = id;
		this.sido_code = sido_code;
		this.title = title;
		this.regTime = regTime;
		this.startPeriod = startPeriod;
		this.endPeriod = endPeriod;
	}

	public int getMytripNo() {
		return mytripNo;
	}

	public void setMytripNo(int mytripNo) {
		this.mytripNo = mytripNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSido_code() {
		return sido_code;
	}

	public void setSido_code(int sido_code) {
		this.sido_code = sido_code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRegTime() {
		return regTime;
	}

	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}

	public String getStartPeriod() {
		return startPeriod;
	}

	public void setStartPeriod(String startPeriod) {
		this.startPeriod = startPeriod;
	}

	public String getEndPeriod() {
		return endPeriod;
	}

	public void setEndPeriod(String endPeriod) {
		this.endPeriod = endPeriod;
	}

	@Override
	public String toString() {
		return "Trip [mytripNo=" + mytripNo + ", id=" + id + ", sido_code=" + sido_code + ", title=" + title
				+ ", regTime=" + regTime + ", startPeriod=" + startPeriod + ", endPeriod=" + endPeriod + "]";
	}
	
}
