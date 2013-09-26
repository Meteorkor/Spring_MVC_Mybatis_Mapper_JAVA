package com.meteor.service;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.meteor.model.User;

public class UserDAOex extends SqlSessionDaoSupport {
	
	
	public User getUser(String userId){
		return (User)getSqlSession().selectOne("com.meteor.mapper.UserMapper.getUser",userId);
	}
}
