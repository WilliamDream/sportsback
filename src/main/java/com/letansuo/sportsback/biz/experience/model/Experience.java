package com.letansuo.sportsback.biz.experience.model;

import java.math.BigDecimal;
import javax.persistence.Transient;

public class Experience
{
  private Integer experienceid;
  private String name;
  private Integer typeid;
  private Integer clubid;
  private Integer operatorid;
  private BigDecimal price;
  private BigDecimal specialPrice;
  private BigDecimal bottomPrice;
  private BigDecimal groupPrice;
  private Integer priceFlag;
  private String age;
  private String address;
  private String lng;
  private String lat;
  private Integer status;
  private Integer flag;
  private String teacher;
  private String phone;
  private Integer stuNumber;
  private String startDate;
  private String endDate;
  private String createtime;
  private String descrite;

  @Transient
  private String createStart;

  @Transient
  private String createEnd;

  public Integer getExperienceid()
  {
    return this.experienceid;
  }

  public void setExperienceid(Integer experienceid) {
    this.experienceid = experienceid;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getTypeid() {
    return this.typeid;
  }

  public void setTypeid(Integer typeid) {
    this.typeid = typeid;
  }

  public Integer getClubid() {
    return this.clubid;
  }

  public void setClubid(Integer clubid) {
    this.clubid = clubid;
  }

  public Integer getOperatorid() {
    return this.operatorid;
  }

  public void setOperatorid(Integer operatorid) {
    this.operatorid = operatorid;
  }

  public BigDecimal getPrice() {
    return this.price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public BigDecimal getSpecialPrice() {
    return this.specialPrice;
  }

  public void setSpecialPrice(BigDecimal specialPrice) {
    this.specialPrice = specialPrice;
  }

  public BigDecimal getBottomPrice() {
    return this.bottomPrice;
  }

  public void setBottomPrice(BigDecimal bottomPrice) {
    this.bottomPrice = bottomPrice;
  }

  public BigDecimal getGroupPrice() {
    return this.groupPrice;
  }

  public void setGroupPrice(BigDecimal groupPrice) {
    this.groupPrice = groupPrice;
  }

  public Integer getPriceFlag() {
    return this.priceFlag;
  }

  public void setPriceFlag(Integer priceFlag) {
    this.priceFlag = priceFlag;
  }

  public String getAge() {
    return this.age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Integer getStatus() {
    return this.status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Integer getFlag() {
    return this.flag;
  }

  public void setFlag(Integer flag) {
    this.flag = flag;
  }

  public String getTeacher() {
    return this.teacher;
  }

  public void setTeacher(String teacher) {
    this.teacher = teacher;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Integer getStuNumber() {
    return this.stuNumber;
  }

  public void setStuNumber(Integer count) {
    this.stuNumber = count;
  }

  public String getCreatetime() {
    return this.createtime;
  }

  public void setCreatetime(String createtime) {
    this.createtime = createtime;
  }

  public String getDescrite() {
    return this.descrite;
  }

  public void setDescrite(String descrite) {
    this.descrite = descrite;
  }

  public String getLng() {
    return this.lng;
  }

  public void setLng(String lng) {
    this.lng = lng;
  }

  public String getLat() {
    return this.lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }

  public String getStartDate() {
    return this.startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return this.endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public String getCreateStart() {
    return this.createStart;
  }

  public void setCreateStart(String createStart) {
    this.createStart = createStart;
  }

  public String getCreateEnd() {
    return this.createEnd;
  }

  public void setCreateEnd(String createEnd) {
    this.createEnd = createEnd;
  }
}