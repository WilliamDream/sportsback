package com.letansuo.sportsback.biz.experience.service;

import com.github.pagehelper.PageInfo;
import com.letansuo.sportsback.biz.experience.model.Experience;

public abstract interface ExperienceService {
  public abstract Experience selectByPrimaryKey(Integer paramInteger);

  public abstract PageInfo<Experience> selectExpricence(Experience paramExperience);

  public abstract int insert(Experience paramExperience);

  public abstract int updateByPrimaryKey(Experience paramExperience);

  public abstract int deleteByPrimaryKey(Integer paramInteger);
}