package com.ssafy.trip.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.trip.model.Trip;
import com.ssafy.trip.model.mapper.TripMapper;

@Service
public class TripServiceImpl implements TripService {
	private TripMapper tripMapper;

	public TripServiceImpl(TripMapper tripMapper) {
		this.tripMapper = tripMapper;
	}
	@Override
	public List<Trip> listTrip(Trip trip) throws Exception {
		return tripMapper.listTrip(trip);
	}

	@Override
	public List<Trip> hotTrip(Trip trip) throws Exception {
		return tripMapper.hotTrip(trip);
	}

}