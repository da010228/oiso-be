package com.ssafy.trip.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.trip.model.Trip;
import com.ssafy.user.model.User;

@Mapper
public interface TripMapper {
	List<Trip> listTrip(Trip trip) throws Exception;
	List<Trip> hotTrip() throws Exception;
}
