package com.hexin.base.service.impl;

import com.hexin.base.dao.BaseDao;
import com.hexin.base.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @param
 * @return
 * @description 业务基类 已注入
 * @author: xiaoying@hexindai.com V1.0 2017/11/30 14:59
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    private BaseDao<T> dao;

    /**
     * @Author: huey
     * <p>@Description: 为了泛型注入</p>
     * @Date: 10:17 2017/8/14
     */
    public void setDao(BaseDao<T> dao) {
        this.dao = dao;
    }

    @Transactional(rollbackFor = Exception.class, readOnly = false, propagation = Propagation.REQUIRED)
    @Override
    public int insert(T entity) throws Exception {
        return dao.insert(entity);
    }

    @Transactional(rollbackFor = Exception.class, readOnly = false, propagation = Propagation.REQUIRED)
    @Override
    public int deleteById(Object id) throws Exception {
        return dao.deleteById(id);
    }

    @Transactional(rollbackFor = Exception.class, readOnly = false, propagation = Propagation.REQUIRED)
    public int update(T t) throws Exception {
        return dao.update(t);
    }

    public T findById(Object objKey) {
        return dao.findById(objKey);

    }

    public List<T> findAll() {
        return dao.findAll();
    }

    public List<T> findBy(Map<String, Object> map) {
        return dao.findBy(map);
    }

    @Override
    public List<T> findBy(T t) {
        return dao.findBy(t);
    }
}
