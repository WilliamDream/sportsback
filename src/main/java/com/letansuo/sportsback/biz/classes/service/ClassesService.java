package com.letansuo.sportsback.biz.classes.service;

import com.github.pagehelper.PageInfo;
import com.letansuo.sportsback.biz.classes.model.Classes;
import com.letansuo.sportsback.biz.experience.model.Experience;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/9/21 16:36
 */
public interface ClassesService {

    public abstract Classes selectByPrimaryKey(Integer classid);

    public abstract PageInfo<Classes> selectClasses(Classes classes);

    public abstract int insert(Classes classes);

    public abstract int updateByPrimaryKey(Classes classes);

    public abstract int deleteByPrimaryKey(Integer paramInteger);
}
