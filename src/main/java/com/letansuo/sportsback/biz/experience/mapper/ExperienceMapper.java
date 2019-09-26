package com.letansuo.sportsback.biz.experience.mapper;

import com.letansuo.sportsback.biz.experience.model.Experience;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public  interface ExperienceMapper
{
  Experience selectByPrimaryKey(Integer paramInteger);

  List<Experience> selectExpricence(Experience paramExperience);

  int insert(Experience paramExperience);

  int updateByPrimaryKey(Experience paramExperience);

  int deleteByPrimaryKey(Integer paramInteger);
}