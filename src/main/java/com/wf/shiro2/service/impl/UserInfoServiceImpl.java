package com.wf.shiro2.service.impl;

import com.wf.shiro2.dao.UserInfoRepository;
import com.wf.shiro2.entity.UserInfo;
import com.wf.shiro2.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	
	@Resource
	private UserInfoRepository userInfoRepository;
	
	@Override
	public UserInfo findByUsername(String username) {
		System.out.println("UserInfoServiceImpl.findByUsername()");
		return userInfoRepository.findByUsername(username);
	}
	
}
