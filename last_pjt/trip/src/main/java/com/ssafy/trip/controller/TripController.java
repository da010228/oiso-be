package com.ssafy.trip.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.trip.model.MyTrip;
import com.ssafy.trip.model.MyTripDetail;
import com.ssafy.trip.model.service.TripService;

@RestController
@RequestMapping("/mytrip")
public class TripController {

	private TripService service;

	public TripController(TripService service) {
		super();
		this.service = service;
	}

	@GetMapping("/{id}")
	public List<MyTrip> getMyTripList(@PathVariable String id) throws Exception {
		List<MyTrip> list = service.getMyTripList(id);
		return list;
	}
	
	@GetMapping("/{id}/{mytripNo}")
	public List<MyTripDetail> getMyTripDetailList(@PathVariable int mytripNo) throws Exception {
		List<MyTripDetail> list = service.getMyTripDetailList(mytripNo);
		System.out.println(list);
		return list;
	}
	
}
