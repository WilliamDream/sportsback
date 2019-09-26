package com.letansuo.sportsback.biz.experience.service;

import com.github.pagehelper.PageInfo;
import com.letansuo.sportsback.biz.experience.model.Experience;

public interface ExperienceService {

  Experience selectByPrimaryKey(Integer paramInteger);

  PageInfo<Experience> selectExpricence(Experience paramExperience);

  int insert(Experience paramExperience);

  int updateByPrimaryKey(Experience paramExperience);

  int deleteByPrimaryKey(Integer paramInteger);

}