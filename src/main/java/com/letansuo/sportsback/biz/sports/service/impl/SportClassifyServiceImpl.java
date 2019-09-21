package com.letansuo.sportsback.biz.sports.service.impl;

import com.github.pagehelper.PageInfo;
import com.letansuo.sportsback.biz.sports.mapper.SportClassifyMapper;
import com.letansuo.sportsback.biz.sports.model.SportClassify;
import com.letansuo.sportsback.biz.sports.service.SportClassifyService;
import com.letansuo.sportsback.error.errorCode.GlobalErrorCode;
import com.letansuo.sportsback.error.exception.BizException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SportClassifyServiceImpl
  implements SportClassifyService
{

  @Autowired
  SportClassifyMapper mapper;

  public PageInfo<SportClassify> selectSportClassify(SportClassify sportClassify)
  {
    List list = null;
    try {
      list = this.mapper.selectSportClassify(sportClassify);
    } catch (Exception e) {
      e.printStackTrace();
      throw new BizException(GlobalErrorCode.QUERY_EXCE);
    }
    return new PageInfo(list);
  }

  public SportClassify selectByPrimaryKey(Integer typeid)
  {
    return this.mapper.selectByPrimaryKey(typeid);
  }

  public int insert(SportClassify sportClassify)
  {
    this.mapper.insert(sportClassify);
    return 0;
  }

  public int updateByPrimaryKey(SportClassify sportClassify)
  {
    this.mapper.updateByPrimaryKey(sportClassify);
    return 0;
  }

  public int deleteByPrimaryKey(Integer typeid)
  {
    this.mapper.deleteByPrimaryKey(typeid);
    return 0;
  }
}