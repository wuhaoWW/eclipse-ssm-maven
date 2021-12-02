package com.mytest.ssm.dao;

import org.apache.ibatis.annotations.Param;

import com.mytest.ssm.pojo.UserInfo;

public interface UserMapper {
	 public UserInfo findByUsername(@Param("username")String username);
	
}
