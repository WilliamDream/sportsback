package com.letansuo.sportsback.biz.minisetup.controller;

import com.github.pagehelper.PageInfo;
import com.letansuo.sportsback.biz.minisetup.model.ClassImg;
import com.letansuo.sportsback.biz.minisetup.service.ClassImgService;
import com.letansuo.sportsback.common.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/9/26 22:49
 */


@RestController
@RequestMapping({"/classimg"})
public class ClassImgController {
    @Autowired
    private ClassImgService service;

    @GetMapping({"/all"})
    public ResultVo selectClassImg(ClassImg classImg)
    {
        PageInfo data = this.service.selectClassImg(classImg);
        return ResultVo.success(data);
    }
    @GetMapping({"/{imgid}"})
    public ResultVo select(@PathVariable("imgid") Integer imgid) {
        return ResultVo.success(this.service.selectByPrimaryKey(imgid));
    }
    @PostMapping({"/add"})
    public ResultVo add(@RequestBody ClassImg classImg) {
        this.service.insert(classImg);
        return ResultVo.success();
    }
    @PostMapping({"/update"})
    public ResultVo update(@RequestBody ClassImg classImg) {
        this.service.updateByPrimaryKey(classImg);
        return ResultVo.success();
    }
    @GetMapping({"/del/{imgid}"})
    public ResultVo delete(@PathVariable("imgid") Integer imgid) {
        this.service.deleteByPrimaryKey(imgid);
        return ResultVo.success();
    }



}
