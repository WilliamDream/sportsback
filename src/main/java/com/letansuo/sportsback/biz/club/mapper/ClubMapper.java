package com.letansuo.sportsback.biz.club.mapper;

import com.letansuo.sportsback.biz.club.model.Club;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public  interface ClubMapper
{
  int insert(Club paramClub);

  Club selectByPrimaryKey(Integer paramInteger);

  List<Club> selectClub(Club paramClub);

  int updateByPrimaryKey(Club paramClub);

  int deleteByPrimaryKey(Integer paramInteger);
}