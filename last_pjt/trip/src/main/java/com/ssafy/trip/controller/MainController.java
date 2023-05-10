package com.ssafy.trip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssafy.user.model.User;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "redirect:/login.html";
	}


}
