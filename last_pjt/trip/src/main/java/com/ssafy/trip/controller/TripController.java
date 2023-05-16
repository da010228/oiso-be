package com.ssafy.trip.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.trip.model.Trip;
import com.ssafy.trip.model.service.TripService;

@RestController
@RequestMapping("/trip")
public class TripController {
	
	@GetMapping("/test")
	public String test() {
		return "제발";
	}


	private TripService service;

	public TripController(TripService service) {
		super();
		this.service = service;
	}

	@PostMapping("/info")
	public List<Trip> attractionList(@RequestBody Trip trip) throws Exception {
		List<Trip> list = service.listTrip(trip);
		return list;
	}
	
}
