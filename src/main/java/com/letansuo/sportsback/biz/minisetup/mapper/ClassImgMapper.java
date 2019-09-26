package com.letansuo.sportsback.biz.minisetup.mapper;

import com.letansuo.sportsback.biz.minisetup.model.ClassImg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassImgMapper {


    List<ClassImg> selectClassImg(ClassImg classImg);

    int insert(ClassImg classImg);

    int updateByPrimaryKey(ClassImg classImg);

    int deleteByPrimaryKey(Integer paramInteger);
}