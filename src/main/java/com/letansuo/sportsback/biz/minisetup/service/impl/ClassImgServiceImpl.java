package com.letansuo.sportsback.biz.minisetup.service.impl;

import com.github.pagehelper.PageInfo;
import com.letansuo.sportsback.biz.minisetup.mapper.ClassImgMapper;
import com.letansuo.sportsback.biz.minisetup.model.ClassImg;
import com.letansuo.sportsback.biz.minisetup.service.ClassImgService;
import com.letansuo.sportsback.error.errorCode.GlobalErrorCode;
import com.letansuo.sportsback.error.exception.BizException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/9/26 22:47
 */

@Service
public class ClassImgServiceImpl implements ClassImgService {

    @Autowired
    private ClassImgMapper mapper;

    @Override
    public ClassImg selectByPrimaryKey(Integer paramInteger) {
        return null;
    }

    @Override
    public PageInfo<ClassImg> selectClassImg(ClassImg classImg) {
        List list = null;
        try {
            list = this.mapper.selectClassImg(classImg);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BizException(GlobalErrorCode.QUERY_EXCE);
        }
        return new PageInfo(list);
    }

    @Override
    public int insert(ClassImg classImg) {
        return mapper.insert(classImg);
    }

    @Override
    public int updateByPrimaryKey(ClassImg classImg) {
        return mapper.updateByPrimaryKey(classImg);
    }

    @Override
    public int deleteByPrimaryKey(Integer paramInteger) {
        return mapper.deleteByPrimaryKey(paramInteger);
    }
}
