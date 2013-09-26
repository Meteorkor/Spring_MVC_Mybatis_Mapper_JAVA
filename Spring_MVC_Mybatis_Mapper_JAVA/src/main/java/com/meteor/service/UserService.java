package com.meteor.service;

import java.util.List;

import com.meteor.mapper.UserMapper;
import com.meteor.model.User;

public class UserService {

	private UserMapper userMapper;
	
	public void setUserMapper(UserMapper userMapper){
		this.userMapper = userMapper;		
	}
	public User getUser(String userId){
		return this.userMapper.getUser(userId);
	}
	public List<User> getUser_All(){
		return this.userMapper.getUser_All();
	}
	public void insertUser(User user){
		this.userMapper.insertUser(user);
	}
	
	
	
	/*
	@Select("select * from user")
	List<User> getUser_All();
	
	@Insert("insert into user(name,age) value (#{name},#{age})")
	void insertUser(User user);

	  
	  
	*/
	
}
