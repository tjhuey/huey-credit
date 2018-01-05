package com.hexin.base.dao;

import java.util.List;
import java.util.Map;

/**
 * @param
 * @return
 * @description BaseDao
 * @author: xiaoying@hexindai.com V1.0 2017/11/29 14:47
 */
public interface BaseDao<T> {

    public int insert(T t);

    public int update(T t);

    public int deleteById(Object objKey);

    public T findById(Object objKey);

    public List<T> findBy(Map<String, Object> map);

    public List<T> findBy(T t);

     /**
       * @param
       * @return
       * @description 分页同用 配合pagehelper使用即可
       * @author: xiaoying@hexindai.com V1.0 2017/11/30 14:53
      */
    public List<T> findAll();
}
