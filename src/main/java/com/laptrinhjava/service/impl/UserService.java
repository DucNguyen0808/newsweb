package com.laptrinhjava.service.impl;

import javax.inject.Inject;

import com.laptrinhjava.dao.IUserDao;
import com.laptrinhjava.dao.impl.UserDao;
import com.laptrinhjava.model.UserModel;
import com.laptrinhjava.service.IUserService;

public  class UserService implements IUserService{
@Inject private UserDao user;

@Override
public UserModel findUserModel(String username, String pass, int status) {
	
	return user.findUserNameAndPassAndStt(username, pass, status);
}
	
}
