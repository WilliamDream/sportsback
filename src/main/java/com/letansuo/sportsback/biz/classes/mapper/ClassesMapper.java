package com.letansuo.sportsback.biz.classes.mapper;

import com.letansuo.sportsback.biz.classes.model.Classes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassesMapper {

    Classes selectByPrimaryKey(Integer classid);

    List<Classes> selectClasses(Classes classes);

    int insert(Classes classes);

    int updateByPrimaryKey(Classes record);

    int deleteByPrimaryKey(Integer classid);

}