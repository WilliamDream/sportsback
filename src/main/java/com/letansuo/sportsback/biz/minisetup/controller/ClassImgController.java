package com.letansuo.sportsback.biz.minisetup.controller;

import com.github.pagehelper.PageInfo;
import com.letansuo.sportsback.biz.minisetup.model.ClassImg;
import com.letansuo.sportsback.biz.minisetup.service.ClassImgService;
import com.letansuo.sportsback.common.vo.FileUploadVo;
import com.letansuo.sportsback.common.vo.ResultVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/9/26 22:49
 */


@RestController
@RequestMapping({"/classimg"})
public class ClassImgController {

    private Logger logger = LoggerFactory.getLogger(ClassImgController.class);

    @Autowired
    private ClassImgService service;

    @GetMapping({"/all"})
    public ResultVo selectClassImg(ClassImg classImg)
    {
        PageInfo data = this.service.selectClassImg(classImg);
        return ResultVo.success(data.getList(),data.getTotal());
    }
    @GetMapping({"/{imgid}"})
    public ResultVo select(@PathVariable("imgid") Integer imgid) {
        return ResultVo.success(this.service.selectByPrimaryKey(imgid),null);
    }
    @PostMapping({"/add"})
    public ResultVo add(@RequestBody ClassImg classImg) {
        this.service.insert(classImg);
        return ResultVo.success();
    }

    @RequestMapping(value="/upload", method = RequestMethod.POST)
    public ResultVo uploadFile(@RequestParam MultipartFile file, HttpServletRequest request) throws Exception{
        /// 先注释掉
        if(file==null)
            return ResultVo.error("1", "上传不能为空");
        String fileName = file.getOriginalFilename();
        if (!fileName.matches("^.+\\.(?i)(jpg)$") && !fileName.matches("^.+\\.(?i)(png)$")) {
            return ResultVo.error("1", "上传图片格式错误，请上传后缀为.jpg .png  .gif的文件");
        }
        File f = new File(this.getClass().getResource("/").getPath()+"/static/upfile");
        String wenjian = "";
        if(!StringUtils.isEmpty(request.getParameter("filename"))){
            wenjian = request.getParameter("filename") + "\\";
        }
        wenjian = new String(wenjian.getBytes("UTF-8"), "UTF-8");
        String filePath = "";
        String os =System.getProperty("os.name");
        if(os.equalsIgnoreCase("linux")) {
            filePath = f.getPath() + "/"+ wenjian;
        }else {
            filePath = f.getPath() + "\\"+ wenjian;
            filePath = "D:/tmp/import/upload/"+ wenjian;
        }

        String path = filePath + fileName;
        try {
            File targetFile = new File(filePath);
            if(!targetFile.exists()){
                targetFile.mkdirs();
            }
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(path));
            out.write(file.getBytes());
            out.flush();
            out.close();

        } catch (Exception e) {
            logger.error("上传失败!原因是:",e);
            return ResultVo.error( "上传失败!");
        }
//        List<FileUploadVo> reslist = new ArrayList<>();
        FileUploadVo fileUploadVo = new FileUploadVo();
        fileUploadVo.setTitle(fileName);
        fileUploadVo.setSrc(path);
//        reslist.add(fileUploadVo);
        return ResultVo.success(fileUploadVo);
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

    public static void main(String[] args) {



    }


}
