package com.ssafy.trip.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.trip.model.MyTrip;
import com.ssafy.trip.model.MyTripDetail;
import com.ssafy.user.model.User;

@Mapper
public interface TripMapper {
	List<MyTrip> getMyTripList(String id) throws Exception;
	int postPlan(MyTrip plan) throws Exception;
	
	
	List<MyTripDetail> getMyTripDetailList(String id, int sido_code) throws Exception;
	int postDetail(MyTripDetail detail) throws Exception;	
}
