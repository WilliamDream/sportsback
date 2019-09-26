package com.letansuo.sportsback.biz.minisetup.service;

import com.github.pagehelper.PageInfo;
import com.letansuo.sportsback.biz.minisetup.model.ClassImg;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/9/26 22:47
 */
public interface ClassImgService {

    ClassImg selectByPrimaryKey(Integer paramInteger);

    PageInfo<ClassImg> selectClassImg(ClassImg classImg);

    int insert(ClassImg classImg);

    int updateByPrimaryKey(ClassImg classImg);

    int deleteByPrimaryKey(Integer paramInteger);

}
