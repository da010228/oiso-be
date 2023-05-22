package com.ssafy.trip.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.trip.model.MyTrip;
import com.ssafy.trip.model.MyTripDetail;
import com.ssafy.trip.model.mapper.TripMapper;

@Service
public class TripServiceImpl implements TripService {
	private TripMapper tripMapper;

	public TripServiceImpl(TripMapper tripMapper) {
		this.tripMapper = tripMapper;
	}
	@Override
	public List<MyTrip> getMyTripList(String id) throws Exception {
		return tripMapper.getMyTripList(id);
	}
	@Override
	public int postPlan(MyTrip plan) throws Exception {
		return tripMapper.postPlan(plan);
	}
	
	
	
	@Override
	public List<MyTripDetail> getMyTripDetailList(String id, int sido_code) throws Exception {
		return tripMapper.getMyTripDetailList(id, sido_code);
	}
	@Override
	public int postDetail(MyTripDetail detail) throws Exception {
		return tripMapper.postDetail(detail);
	}

}