package com.letansuo.sportsback.biz.sports.controller;

import com.github.pagehelper.PageInfo;
import com.letansuo.sportsback.biz.sports.model.SportClassify;
import com.letansuo.sportsback.biz.sports.service.SportClassifyService;
import com.letansuo.sportsback.common.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/sporttype"})
public class SportClassifyController
{

  @Autowired
  private SportClassifyService service;

  @GetMapping({"/all"})
  public ResultVo selectSportClassify(SportClassify sportClassify)
  {
    PageInfo data = this.service.selectSportClassify(sportClassify);
    return ResultVo.success(data.getList(),data.getTotal());
  }
  @GetMapping({"/{typeid}"})
  public ResultVo select(@PathVariable("typeid") Integer typeid) {
    return ResultVo.success(this.service.selectByPrimaryKey(typeid),null);
  }
  @PostMapping({"/add"})
  public ResultVo add(@RequestBody SportClassify sportClassify) {
    this.service.insert(sportClassify);
    return ResultVo.success();
  }
  @PostMapping({"/update"})
  public ResultVo update(@RequestBody SportClassify sportClassify) {
    this.service.updateByPrimaryKey(sportClassify);
    return ResultVo.success();
  }
  @GetMapping({"/del/{typeid}"})
  public ResultVo delete(@PathVariable("typeid") Integer typeid) {
    this.service.deleteByPrimaryKey(typeid);
    return ResultVo.success();
  }
}