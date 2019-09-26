package com.letansuo.sportsback.biz.minisetup.model;

import java.util.Date;

public class ClassImg {
    private Integer imgid;

    private Integer flagid;

    private Integer typeid;

    private Integer clubid;

    private Integer classid;

    private String img;

    private String url;

    private Date showstart;

    private Date showend;

    private Date createtime;

    public Integer getImgid() {
        return imgid;
    }

    public void setImgid(Integer imgid) {
        this.imgid = imgid;
    }

    public Integer getFlagid() {
        return flagid;
    }

    public void setFlagid(Integer flagid) {
        this.flagid = flagid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getClubid() {
        return clubid;
    }

    public void setClubid(Integer clubid) {
        this.clubid = clubid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getShowstart() {
        return showstart;
    }

    public void setShowstart(Date showstart) {
        this.showstart = showstart;
    }

    public Date getShowend() {
        return showend;
    }

    public void setShowend(Date showend) {
        this.showend = showend;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}