package com.laptrinhjava.service;

import com.laptrinhjava.model.UserModel;

public interface IUserService {
UserModel findUserModel(String username,String pass,int status);
}
