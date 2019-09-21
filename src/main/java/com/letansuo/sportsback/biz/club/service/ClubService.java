package com.letansuo.sportsback.biz.club.service;

import com.github.pagehelper.PageInfo;
import com.letansuo.sportsback.biz.club.model.Club;

public abstract interface ClubService
{
  public abstract Club selectByPrimaryKey(Integer paramInteger);

  public abstract PageInfo<Club> selectClub(Club paramClub);

  public abstract int insert(Club paramClub);

  public abstract int updateByPrimaryKey(Club paramClub);

  public abstract int deleteByPrimaryKey(Integer paramInteger);
}