package com.ssafy.trip.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.trip.model.MyTrip;
import com.ssafy.trip.model.MyTripDetail;
import com.ssafy.user.model.User;

@Mapper
public interface TripMapper {
	List<MyTrip> getMyTripList(String id) throws Exception;
	List<MyTripDetail> getMyTripDetailList(int mytripNo) throws Exception;
}
