package com.zl.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.LoginInfo;
import com.zl.service.LoginInfoService;

@Controller
public class LoginInfoControll {
	@Autowired
	private LoginInfoService loginInfoService;
	
	@ResponseBody
	@RequestMapping("queryAll")
	public List<LoginInfo> queryAll() {
		return loginInfoService.queryAll();
	}
}
