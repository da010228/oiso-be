package com.ssafy.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
import com.ssafy.user.model.service.JwtService;
import com.ssafy.user.model.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private final Logger logger = LoggerFactory.getLogger(UserController.class);

	private UserService userService;
	private JwtService jwtService;

	public UserController(UserService memberService, JwtService jwtService) {
		super();
		this.userService = memberService;
		this.jwtService = jwtService;
	}

	@PostMapping("/signup")
	public ResponseEntity<?> join(@RequestBody User user, Model model) {
		logger.debug("memberDto info : {}", user);
		System.out.println(user.toString());
		try {
			int cnt = userService.joinMember(user);
			return new ResponseEntity<Integer>(cnt, HttpStatus.OK); // 200
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT); // 204
		}
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User user) {
		logger.debug("userid : {}, userpwd : {}", user.getUserId(), user.getUserPwd());
		try {
			User loginUser = userService.loginMember(user.getUserId(), user.getUserPwd());
			if (loginUser == null) {
				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT); // 204
			}

			// Access토큰 생성
			String accessToken = jwtService.create("userid", loginUser.getUserId(), "access-token",
					1000 * 10 /* 10초 */);
			// Refresh토큰 생성
			String refreshToken = jwtService.create("userid", loginUser.getUserId(), "access-token",
					1000 * 30 /* 30초 */);

			// refreshToken DB 저장
			userService.updateTokenByUserId(loginUser.getUserId(), refreshToken);

			Map<String, String> resultMap = new HashMap<>();
			resultMap.put("access-token", accessToken);
			resultMap.put("refresh-token", refreshToken);

			return new ResponseEntity<Map<String, String>>(resultMap, HttpStatus.OK); // 200

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED); // 401
		}
	}

	@GetMapping("/info/{userId}")
	public ResponseEntity<?> getInfo(@PathVariable String userId, HttpServletRequest request) {
		String accessToken = request.getHeader("access-token");
		try {
			if (jwtService.checkToken(accessToken)) { //토큰에 이상 없으면
				System.out.println(userId);
				User user = userService.userInfo(userId);
				if(user!=null) {
					Map<String, Object> resultMap = new HashMap<>();
					resultMap.put("userInfo", user);
					return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK); // 200
				}
				else {
					return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED); // 401
				}
			}

			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED); // 401
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT); // 204
		}
	}

	@GetMapping("/member")
	public ResponseEntity<?> userList() throws Exception {

		List<User> list = userService.listMember();
		if (list != null && !list.isEmpty()) {
			System.out.println("컨트롤러 실행");
			return new ResponseEntity<List<User>>(list, HttpStatus.OK); // 200
		} else {
			System.out.println("컨트롤러 실행 _ 빈 정보");
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT); // 204
		}
	}

	@PutMapping("/member/{userId}")
	public ResponseEntity<?> userModify(@RequestBody User memberDto, @PathVariable String userId) throws Exception {
		userService.updateMember(memberDto);
		List<User> list = userService.listMember();
		if (list != null && !list.isEmpty()) {
			return new ResponseEntity<List<User>>(list, HttpStatus.OK); // 200
		} else {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT); // 204
		}
	}

	@DeleteMapping("/member/{userId}")
	public ResponseEntity<?> userDelete(@PathVariable String userId) throws Exception {
		userService.deleteMember(userId);
		List<User> list = userService.listMember();
		if (list != null && !list.isEmpty()) {
			return new ResponseEntity<List<User>>(list, HttpStatus.OK); // 200
		} else {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT); // 204
		}
	}

}