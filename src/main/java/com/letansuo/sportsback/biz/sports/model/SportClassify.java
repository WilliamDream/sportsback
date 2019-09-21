package com.letansuo.sportsback.biz.sports.model;

import com.letansuo.sportsback.common.vo.BaseEntity;

public class SportClassify extends BaseEntity
{
  private Integer typeid;
  private String typename;
  private Integer sort;
  private String content;
  private String image;

  public Integer getTypeid()
  {
    return this.typeid;
  }

  public void setTypeid(Integer typeid)
  {
    this.typeid = typeid;
  }

  public String getTypename()
  {
    return this.typename;
  }

  public void setTypename(String typename)
  {
    this.typename = typename;
  }

  public Integer getSort()
  {
    return this.sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getImage() {
    return this.image;
  }

  public void setImage(String image)
  {
    this.image = image;
  }
}