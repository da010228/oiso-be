package com.ssafy.user.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.user.model.User;
import com.ssafy.user.model.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	private UserMapper userMapper;


	public UserServiceImpl(UserMapper memberDao) {
		this.userMapper = memberDao;
	}

	@Override
	public int joinMember(User user) throws Exception {
		System.out.println(user.toString());
		return userMapper.joinMember(user);
	}

	@Override
	public User loginMember(String userId, String userPwd) throws Exception {
		User u = userMapper.loginMember(userId, userPwd);
		return u;
	}

	@Override
	public List<User> listMember() throws Exception {
		return userMapper.listMember();
	}

	@Override
	public void updateMember(User memberDto) throws Exception {
		userMapper.updateMember(memberDto);
	}

	@Override
	public void deleteMember(String userId) throws Exception {
		userMapper.deleteMember(userId);
	}

}
