package com.letansuo.sportsback.biz.sports.mapper;

import com.letansuo.sportsback.biz.sports.model.SportClassify;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public abstract interface SportClassifyMapper
{
  public abstract List<SportClassify> selectSportClassify(SportClassify paramSportClassify);

  public abstract int deleteByPrimaryKey(Integer paramInteger);

  public abstract int insert(SportClassify paramSportClassify);

  public abstract SportClassify selectByPrimaryKey(Integer paramInteger);

  public abstract List<SportClassify> selectAll();

  public abstract int updateByPrimaryKey(SportClassify paramSportClassify);
}