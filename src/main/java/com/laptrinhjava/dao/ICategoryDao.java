package com.laptrinhjava.dao;

import java.util.List;

import com.laptrinhjava.model.Category;


public interface ICategoryDao extends GenericDAO<Category>{
	List<Category> findALL();
	Category findOne(Long id);
	Category findOne(String code);
	
}
