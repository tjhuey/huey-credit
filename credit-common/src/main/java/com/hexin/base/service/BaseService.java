package com.hexin.base.service;

import java.util.List;
import java.util.Map;

/**
 * @param
 * @return
 * @description BaseService
 * @author: xiaoying@hexindai.com V1.0 2017/11/29 14:49
 */
public interface BaseService<T> {

    public int insert(T t) throws Exception;

    public int update(T t) throws Exception;

    public int deleteById(Object objKey) throws Exception;

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
