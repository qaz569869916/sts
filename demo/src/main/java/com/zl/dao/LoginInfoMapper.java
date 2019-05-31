package com.zl.dao;

import java.util.List;

import com.zl.pojo.LoginInfo;

//ggggg
public interface LoginInfoMapper {
	public List<LoginInfo> queryAll();
	public LoginInfo queryOne();
}

