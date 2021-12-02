package com.mytest.ssm.service;

import com.mytest.ssm.pojo.UserInfo;

public interface UserService {
	public UserInfo findByUsername(String username);
}
