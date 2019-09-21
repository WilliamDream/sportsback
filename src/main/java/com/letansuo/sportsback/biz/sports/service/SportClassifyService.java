package com.letansuo.sportsback.biz.sports.service;

import com.github.pagehelper.PageInfo;
import com.letansuo.sportsback.biz.sports.model.SportClassify;

public abstract interface SportClassifyService
{
  public abstract PageInfo<SportClassify> selectSportClassify(SportClassify paramSportClassify);

  public abstract SportClassify selectByPrimaryKey(Integer paramInteger);

  public abstract int insert(SportClassify paramSportClassify);

  public abstract int updateByPrimaryKey(SportClassify paramSportClassify);

  public abstract int deleteByPrimaryKey(Integer paramInteger);
}