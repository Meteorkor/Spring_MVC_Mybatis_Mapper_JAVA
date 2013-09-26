package com.meteor.service;

import org.apache.ibatis.session.SqlSession;

import com.meteor.model.User;

public class UserDAO {

	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession){
		this.sqlSession = sqlSession;
	}
	
	public User getUser(String userId){
		return (User)sqlSession.selectOne("com.meteor.mapper.UserMapper.getUser",userId);
	}
	
}
