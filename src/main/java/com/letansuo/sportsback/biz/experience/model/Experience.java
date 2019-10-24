package com.letansuo.sportsback.biz.experience.model;

import com.letansuo.sportsback.common.InitData;

import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;

public class Experience {
    private Integer experienceId;

    private String name;

    private Integer typeId;

    private Integer clubId;

    private Integer operatorId;

    private BigDecimal price;

    private BigDecimal specialPrice;

    private BigDecimal bottomPrice;

    private BigDecimal groupPrice;

    private Byte priceFlag;

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

    private String createTime;

    private String descrite;

    @Transient
    private String createStart;

    @Transient
    private String createEnd;

    @Transient
    private String sportClassify;

    @Transient
    private String clubName;

    @Transient
    private String priceStrategy;

    public Integer getExperienceId() {
        return experienceId;
    }

    public void setExperienceId(Integer experienceId) {
        this.experienceId = experienceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getClubId() {
        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(BigDecimal specialPrice) {
        this.specialPrice = specialPrice;
    }

    public BigDecimal getBottomPrice() {
        return bottomPrice;
    }

    public void setBottomPrice(BigDecimal bottomPrice) {
        this.bottomPrice = bottomPrice;
    }

    public BigDecimal getGroupPrice() {
        return groupPrice;
    }

    public void setGroupPrice(BigDecimal groupPrice) {
        this.groupPrice = groupPrice;
    }

    public Byte getPriceFlag() {
        return priceFlag;
    }

    public void setPriceFlag(Byte priceFlag) {
        this.priceFlag = priceFlag;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(Integer stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDescrite() {
        return descrite;
    }

    public void setDescrite(String descrite) {
        this.descrite = descrite;
    }

    public String getCreateStart() {
        return createStart;
    }

    public void setCreateStart(String createStart) {
        this.createStart = createStart;
    }

    public String getCreateEnd() {
        return createEnd;
    }

    public void setCreateEnd(String createEnd) {
        this.createEnd = createEnd;
    }

    public String getSportClassify() {
        if(typeId!=null){
            return InitData.SprotClassifyMap.get(typeId);
        }
        return sportClassify;
    }

    public void setSportClassify(String sportClassify) {

        this.sportClassify = sportClassify;
    }

    public String getClubName() {
        if(clubId!=null){
            return InitData.ClubMap.get(clubId);
        }
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getPriceStrategy() {
        if(priceFlag!=null){
            return InitData.PriceStrategyMap.get(priceFlag);
        }
        return priceStrategy;
    }

    public void setPriceStrategy(String priceStrategy) {
        this.priceStrategy = priceStrategy;
    }
}