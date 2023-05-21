package com.ssafy.trip.model;

public class MyTripDetail {
	private int detailNo;
	private int contentId;
	private int contentTypeId;
	private String id;
	private int mytripNo;
	private String day;
	
	public MyTripDetail() {
		super();
	}

	public MyTripDetail(int detailNo, int contentId, int contentTypeId, int mytripNo, String day) {
		super();
		this.detailNo = detailNo;
		this.contentId = contentId;
		this.contentTypeId = contentTypeId;
		this.mytripNo = mytripNo;
		this.day = day;
	}

	public MyTripDetail(int detailNo, int contentId, int contentTypeId, String id, int mytripNo, String day) {
		super();
		this.detailNo = detailNo;
		this.contentId = contentId;
		this.contentTypeId = contentTypeId;
		this.id = id;
		this.mytripNo = mytripNo;
		this.day = day;
	}

	public int getDetailNo() {
		return detailNo;
	}

	public void setDetailNo(int detailNo) {
		this.detailNo = detailNo;
	}

	public int getContentId() {
		return contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

	public int getContentTypeId() {
		return contentTypeId;
	}

	public void setContentTypeId(int contentTypeId) {
		this.contentTypeId = contentTypeId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getMytripNo() {
		return mytripNo;
	}

	public void setMytripNo(int mytripNo) {
		this.mytripNo = mytripNo;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "MyTripDetail [detailNo=" + detailNo + ", contentId=" + contentId + ", contentTypeId=" + contentTypeId
				+ ", id=" + id + ", mytripNo=" + mytripNo + ", day=" + day + "]";
	}
	
}
