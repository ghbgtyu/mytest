package com.cosplay.login.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cosplay.login.entity.LoginUserEntity;

public interface ILoginService {
	/***登陆操作
	 * @param request 
	 * @param response */
	public LoginUserEntity doLogin(HttpServletRequest request, HttpServletResponse response, LoginUserEntity loginUser);
}
