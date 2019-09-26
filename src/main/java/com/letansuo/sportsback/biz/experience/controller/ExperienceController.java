package com.letansuo.sportsback.biz.experience.controller;

import com.github.pagehelper.PageInfo;
import com.letansuo.sportsback.biz.experience.model.Experience;
import com.letansuo.sportsback.biz.experience.service.ExperienceService;
import com.letansuo.sportsback.common.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/experi"})
public class ExperienceController
{

  @Autowired
  private ExperienceService service;

  @GetMapping({"/all"})
  public ResultVo selectSportClassify(Experience experience)
  {
    PageInfo data = this.service.selectExpricence(experience);
    return ResultVo.success(data);
  }
  @GetMapping({"/{experienceid}"})
  public ResultVo select(@PathVariable("experienceid") Integer experienceid) {
    return ResultVo.success(this.service.selectByPrimaryKey(experienceid));
  }
  @PostMapping({"/add"})
  public ResultVo add(@RequestBody Experience experience) {
    this.service.insert(experience);
    return ResultVo.success();
  }
  @PostMapping({"/update"})
  public ResultVo update(@RequestBody Experience experience) {
    this.service.updateByPrimaryKey(experience);
    return ResultVo.success();
  }
  @GetMapping({"/del/{experienceid}"})
  public ResultVo delete(@PathVariable("experienceid") Integer experienceid) {
    this.service.deleteByPrimaryKey(experienceid);
    return ResultVo.success();
  }

}