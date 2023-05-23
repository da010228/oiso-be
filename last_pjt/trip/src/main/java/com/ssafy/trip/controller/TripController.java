package com.ssafy.trip.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	// 여행 계획 (큰 틀)
	@GetMapping("/{id}")
	public List<MyTrip> getMyTripList(@PathVariable String id) throws Exception {
		List<MyTrip> list = service.getMyTripList(id);
		return list;
	}

	@PostMapping("/plan/{id}")
	public int postPlan(@RequestBody MyTrip plan) throws Exception {
		return service.postPlan(plan);
	}

	@DeleteMapping("/plan/{mytripNo}")
	int delPlan(@PathVariable int mytripNo) throws Exception {
		System.out.println(mytripNo);
		int cnt = service.delPlan(mytripNo);
		return cnt;
	}

	// 여행 상세 정보
	@GetMapping("/{id}/{sido_code}")
	public List<MyTripDetail> getMyTripDetailList(@PathVariable String id, @PathVariable int sido_code)
			throws Exception {
		System.out.println(id + " " + sido_code);
		List<MyTripDetail> list = service.getMyTripDetailList(id, sido_code);
		System.out.println(list);
		return list;
	}

	// 하나 추가
	@PostMapping("/{id}")
	public int postDetail(@RequestBody MyTripDetail detail) throws Exception {
		System.out.println(detail);
		return service.postDetail(detail);
	}

	// 데이터 수정
	@PutMapping("/{detailNo}/{sequence}")
	public int putDetail(/* @RequestBody List<MyTripDetail> MyTripDetail detail, */ 
			@PathVariable int detailNo,
			@PathVariable int sequence) throws Exception {
		System.out.println(detailNo+" "+sequence);
		return service.putDetail(detailNo, sequence);
	}

	@DeleteMapping("/{id}/{contentId}")
	int delDetail(@PathVariable String id, @PathVariable int contentId) throws Exception {
		int cnt = service.delDetail(id, contentId);
		return cnt;
	}
}
