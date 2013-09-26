package com.meteor.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.meteor.model.User;

public interface UserMapper {

	@Select("select * from user where id = #{userId}")
	User getUser(@Param("userId") String userId);
	
	@Select("select * from user")
	List<User> getUser_All();
	
	@Insert("insert into user(name,age) value (#{name},#{age})")
	void insertUser(User user);
}
