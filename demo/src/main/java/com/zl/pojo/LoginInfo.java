package com.zl.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class LoginInfo {
	private int id; 
	private String username;
	private String password;
	private int state;
	private int usertype;
}
