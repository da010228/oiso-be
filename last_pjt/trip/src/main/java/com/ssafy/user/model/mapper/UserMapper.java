package com.ssafy.user.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.user.model.User;

@Mapper
public interface UserMapper {
	int joinMember(User user) throws Exception;
	User loginMember(String userId, String userPwd) throws Exception;
	List<User> listMember() throws Exception;
	void updateMember(User user) throws Exception;
	void deleteMember(String userId) throws Exception;

}
