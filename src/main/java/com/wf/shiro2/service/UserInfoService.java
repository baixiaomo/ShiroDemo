package com.wf.shiro2.service;


import com.wf.shiro2.entity.UserInfo;

public interface UserInfoService {
	
	/**通过username查找用户信息;*/
	public UserInfo findByUsername(String username);
	
}
