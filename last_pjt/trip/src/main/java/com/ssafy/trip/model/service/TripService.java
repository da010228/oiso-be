package com.ssafy.trip.model.service;

import java.util.List;

import com.ssafy.trip.model.Trip;

public interface TripService {
	
	List<Trip> listTrip(Trip trip) throws Exception;
	List<Trip> hotTrip(Trip trip) throws Exception;
	
}