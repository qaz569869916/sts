package com.zl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.LoginInfoMapper;
import com.zl.pojo.LoginInfo;
@Service
public class LoginInfoServiceImpl implements LoginInfoService {
	@Autowired
	private LoginInfoMapper loginInfoMapper;
	
	@Override
	public List<LoginInfo> queryAll() {
		
		return loginInfoMapper.queryAll();
	}

}
