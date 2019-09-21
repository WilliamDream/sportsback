package com.letansuo.sportsback.biz.experience.mapper;

import com.letansuo.sportsback.biz.experience.model.Experience;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public abstract interface ExperienceMapper
{
  public abstract Experience selectByPrimaryKey(Integer paramInteger);

  public abstract List<Experience> selectExpricence(Experience paramExperience);

  public abstract int insert(Experience paramExperience);

  public abstract int updateByPrimaryKey(Experience paramExperience);

  public abstract int deleteByPrimaryKey(Integer paramInteger);
}