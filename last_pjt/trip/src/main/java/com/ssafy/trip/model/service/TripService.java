package com.ssafy.trip.model.service;

import java.util.List;

import com.ssafy.trip.model.MyTrip;
import com.ssafy.trip.model.MyTripDetail;

public interface TripService {
	
	List<MyTrip> getMyTripList(String id) throws Exception;
	List<MyTripDetail> getMyTripDetailList(int mytripNo) throws Exception;
	
}