package com.ssafy.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.user.model.User;
import com.ssafy.user.model.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private final Logger logger = LoggerFactory.getLogger(UserController.class);

	private UserService userService;

	public UserController(UserService memberService) {
		super();
		this.userService = memberService;
	}

	@PostMapping("/signup")
	public ResponseEntity<?> join(@RequestBody User user, Model model) {
		logger.debug("memberDto info : {}", user);
		System.out.println(user.toString());
		try {
			int cnt = userService.joinMember(user);
			System.out.println("asdhflkjsdfhk");
			return new ResponseEntity<Integer>(cnt, HttpStatus.OK); // 200
		} catch (Exception e) {
			e.printStackTrace();
//			model.addAttribute("msg", "회원 가입 중 문제 발생!!!");
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT); // 204
		}
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User user) {
		User user2 = null;
//		logger.debug("userid : {}, userpwd : {}", userId, userPwd);
		try {
			user2 = userService.loginMember(user.getUserId(), user.getUserPwd());
			if(user2 == null) {
				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT); // 204
			}
			return new ResponseEntity<User>(user2, HttpStatus.OK); // 200

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT); // 204
		}
	}

	@GetMapping("/member")
	public ResponseEntity<?> userList() throws Exception {
		List<User> list = userService.listMember();
		if (list != null && !list.isEmpty()) {
			return new ResponseEntity<List<User>>(list, HttpStatus.OK); // 200
		} else {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT); // 204
		}
	}
	
	@PutMapping("/member/{userId}")
	public ResponseEntity<?> userModify(@RequestBody User memberDto, @PathVariable String userId) throws Exception {
		userService.updateMember(memberDto);
		List<User> list = userService.listMember();
		if (list != null && !list.isEmpty()) {
			return new ResponseEntity<List<User>>(list, HttpStatus.OK); // 200
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT); // 204
		}
	}
	
	@DeleteMapping("/member/{userId}")
	public ResponseEntity<?> userDelete(@PathVariable String userId) throws Exception {
		userService.deleteMember(userId);
		List<User> list = userService.listMember();
		if (list != null && !list.isEmpty()) {
			return new ResponseEntity<List<User>>(list, HttpStatus.OK); // 200
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT); // 204
		}
	}


}