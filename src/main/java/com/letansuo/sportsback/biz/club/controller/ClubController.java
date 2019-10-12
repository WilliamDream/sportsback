package com.letansuo.sportsback.biz.club.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.letansuo.sportsback.biz.club.model.Club;
import com.letansuo.sportsback.biz.club.service.ClubService;
import com.letansuo.sportsback.common.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping({"/club"})
@RestController
public class ClubController
{

    @Autowired
    private ClubService service;

    @GetMapping({"/all"})
    public ResultVo selectSportClassify(Club club)
    {
        PageInfo data = this.service.selectClub(club);
        return ResultVo.success(data.getList());
    }
    @GetMapping({"/{clubid}"})
    public ResultVo select(@PathVariable("typeid") Integer clubid) {
        return ResultVo.success(this.service.selectByPrimaryKey(clubid));
    }
    @PostMapping({"/add"})
    public ResultVo add(@RequestBody Club club) {
        this.service.insert(club);
        return ResultVo.success();
    }
    @PostMapping({"/update"})
    public ResultVo update(@RequestBody Club club) {
        this.service.updateByPrimaryKey(club);
        return ResultVo.success();
    }
    @GetMapping({"/del/{clubid}"})
    public ResultVo delete(@PathVariable("typeid") Integer clubid) {
        this.service.deleteByPrimaryKey(clubid);
        return ResultVo.success();
    }
}