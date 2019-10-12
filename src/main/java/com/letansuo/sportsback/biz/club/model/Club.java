package com.letansuo.sportsback.biz.club.model;

import com.letansuo.sportsback.common.vo.BaseEntity;

public class Club extends BaseEntity
{
  private Integer clubid;
  private String clubname;
  private String clubicon;
  private String charge;
  private String mobile;
  private String wechat;
  private String address;
  private String logo;
  private String lat;
  private String lng;
  private String content;
  private Integer vipflag;

  public Integer getClubid()
  {
    return this.clubid;
  }

  public void setClubid(Integer clubid) {
    this.clubid = clubid;
  }

  public String getClubname() {
    return this.clubname;
  }

  public void setClubname(String clubname) {
    this.clubname = clubname;
  }

  public String getClubicon() {
    return this.clubicon;
  }

  public void setClubicon(String clubicon) {
    this.clubicon = clubicon;
  }

  public String getCharge() {
    return this.charge;
  }

  public void setCharge(String charge) {
    this.charge = charge;
  }

  public String getMobile() {
    return this.mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getWechat() {
    return this.wechat;
  }

  public void setWechat(String wechat) {
    this.wechat = wechat;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getLat() {
    return this.lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }

  public String getLng() {
    return this.lng;
  }

  public void setLng(String lng) {
    this.lng = lng;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Integer getVipflag() {
    return this.vipflag;
  }

  public void setVipflag(Integer vipflag) {
    this.vipflag = vipflag;
  }

  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }
}