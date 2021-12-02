package com.mytest.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytest.ssm.dao.UserMapper;
import com.mytest.ssm.pojo.UserInfo;
import com.mytest.ssm.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public UserInfo findByUsername(String name) {
		// TODO Auto-generated method stub
		return userMapper.findByUsername(name);
	}

}
