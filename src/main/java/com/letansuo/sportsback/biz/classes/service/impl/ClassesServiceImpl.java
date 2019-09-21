package com.letansuo.sportsback.biz.classes.service.impl;

import com.github.pagehelper.PageInfo;
import com.letansuo.sportsback.biz.classes.mapper.ClassesMapper;
import com.letansuo.sportsback.biz.classes.model.Classes;
import com.letansuo.sportsback.biz.classes.service.ClassesService;
import com.letansuo.sportsback.error.errorCode.GlobalErrorCode;
import com.letansuo.sportsback.error.exception.BizException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/9/21 16:36
 */

@Service
public class ClassesServiceImpl implements ClassesService{

    @Autowired
    private ClassesMapper mapper;

    @Override
    public Classes selectByPrimaryKey(Integer classid) {
        return mapper.selectByPrimaryKey(classid);
    }

    @Override
    public PageInfo<Classes> selectClasses(Classes classes) {
        List list = null;
        try {
            list = this.mapper.selectClasses(classes);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BizException(GlobalErrorCode.QUERY_EXCE);
        }
        return new PageInfo(list);
    }

    @Override
    public int insert(Classes classes) {
        return mapper.insert(classes);
    }

    @Override
    public int updateByPrimaryKey(Classes classes) {
        return mapper.updateByPrimaryKey(classes);
    }

    @Override
    public int deleteByPrimaryKey(Integer classid) {
        return mapper.deleteByPrimaryKey(classid);
    }
}
