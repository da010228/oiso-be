package com.ssafy.trip.model.service;

import java.util.List;

import com.ssafy.trip.model.MyTrip;
import com.ssafy.trip.model.MyTripDetail;

public interface TripService {
	
	List<MyTrip> getMyTripList(String id) throws Exception;
	int postPlan(MyTrip plan) throws Exception;

	
	List<MyTripDetail> getMyTripDetailList(String id, int sido_code) throws Exception;
	int postDetail(MyTripDetail detail) throws Exception;	
}