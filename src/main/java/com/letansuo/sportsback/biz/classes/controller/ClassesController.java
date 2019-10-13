package com.letansuo.sportsback.biz.classes.controller;

import com.github.pagehelper.PageInfo;
import com.letansuo.sportsback.biz.classes.model.Classes;
import com.letansuo.sportsback.biz.classes.service.ClassesService;
import com.letansuo.sportsback.common.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/9/21 16:37
 */

@RestController
@RequestMapping({"/class"})
public class ClassesController {

    @Autowired
    private ClassesService service;

    @GetMapping({"/all"})
    public ResultVo selectSportClassify(Classes classes)
    {
        PageInfo data = this.service.selectClasses(classes);
        return ResultVo.success(data.getList(),data.getTotal());
    }
    @GetMapping({"/{classid}"})
    public ResultVo select(@PathVariable("classid") Integer classid) {
        return ResultVo.success(this.service.selectByPrimaryKey(classid),null);
    }
    @PostMapping({"/add"})
    public ResultVo add(@RequestBody Classes classes) {
        this.service.insert(classes);
        return ResultVo.success();
    }
    @PostMapping({"/update"})
    public ResultVo update(@RequestBody Classes classes) {
        this.service.updateByPrimaryKey(classes);
        return ResultVo.success();
    }
    @GetMapping({"/del/{classid}"})
    public ResultVo delete(@PathVariable("classid") Integer classid) {
        this.service.deleteByPrimaryKey(classid);
        return ResultVo.success();
    }

}
