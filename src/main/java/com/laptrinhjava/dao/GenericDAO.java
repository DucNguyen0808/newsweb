package com.laptrinhjava.dao;

import java.util.List;

import com.laptrinhjava.mapper.RowMapper;
import com.laptrinhjava.model.News;

public interface GenericDAO <T>  {
<T> List<T> query(String sql,RowMapper<T> rowMapper,Object...parameters);
void updateAndDelete(String sql,Object...parameter);
Long insert(String sql,Object...parameter);
int count(String sql,Object...parameter);
}
