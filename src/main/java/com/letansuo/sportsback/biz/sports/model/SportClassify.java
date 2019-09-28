package com.letansuo.sportsback.biz.sports.model;

import com.letansuo.sportsback.common.vo.BaseEntity;

public class SportClassify extends BaseEntity
{
  private Integer typeId;
  private String typeName;
  private Integer sort;
  private String content;
  private String image;

  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
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