package com.ssafy.trip.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.article.model.Article;
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
	
	//여행 계획 만들기
	@PostMapping("/plan/{id}")
	public int postPlan(@RequestBody MyTrip plan) throws Exception {
		return service.postPlan(plan);
	}

	
	@GetMapping("/{id}/{sido_code}")
	public List<MyTripDetail> getMyTripDetailList(@PathVariable String id, @PathVariable int sido_code) throws Exception {
		System.out.println(id+" "+ sido_code);
		List<MyTripDetail> list = service.getMyTripDetailList(id, sido_code);
		System.out.println(list);
		return list;
	}
	
	@PostMapping("/{id}")
	public int postDetail(@RequestBody MyTripDetail detail) throws Exception {
		System.out.println(detail);
		return service.postDetail(detail);
	}
}
