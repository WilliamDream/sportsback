package com.letansuo.sportsback.biz.experience.service.impl;

import com.github.pagehelper.PageInfo;
import com.letansuo.sportsback.biz.experience.mapper.ExperienceMapper;
import com.letansuo.sportsback.biz.experience.model.Experience;
import com.letansuo.sportsback.biz.experience.service.ExperienceService;
import com.letansuo.sportsback.error.errorCode.GlobalErrorCode;
import com.letansuo.sportsback.error.exception.BizException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceServiceImpl implements ExperienceService {

  @Autowired
  private ExperienceMapper mapper;

  public Experience selectByPrimaryKey(Integer experienceid)
  {
    return this.mapper.selectByPrimaryKey(experienceid);
  }

  public PageInfo<Experience> selectExpricence(Experience experience)
  {
    List list = null;
    try {
      list = this.mapper.selectExpricence(experience);
    } catch (Exception e) {
      e.printStackTrace();
      throw new BizException(GlobalErrorCode.QUERY_EXCE);
    }
    return new PageInfo(list);
  }

  public int insert(Experience experience)
  {
    this.mapper.insert(experience);
    return 0;
  }

  public int updateByPrimaryKey(Experience experience)
  {
    this.mapper.updateByPrimaryKey(experience);
    return 0;
  }

  public int deleteByPrimaryKey(Integer experienceid)
  {
    this.mapper.deleteByPrimaryKey(experienceid);
    return 0;
  }
}