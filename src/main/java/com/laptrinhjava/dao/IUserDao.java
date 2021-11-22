package com.laptrinhjava.dao;

import java.util.List;

import com.laptrinhjava.model.UserModel;

public interface IUserDao extends GenericDAO<UserModel> {
 UserModel findUserNameAndPassAndStt(String username,String pass,int status );
}
