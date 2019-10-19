package com.letansuo.sportsback.common.vo;


import com.github.pagehelper.PageInfo;
import com.letansuo.sportsback.error.errorCode.basic.IErrorCodeEnum;

public class ResultVo
{
    private String code;
    private Object data;
    private Long count;
    private String msg;

    public String getCode()
    {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public static ResultVo success(Object object) {
        ResultVo result = new ResultVo();
        result.setCode("0");
        result.setData(object);
        result.setCount(null);
        result.setMsg("操作成功");
        return result;
    }

    public static ResultVo success(PageInfo pageInfo) {
        ResultVo result = new ResultVo();
        result.setCode("0");
        result.setData(pageInfo.getList());
        result.setCount(pageInfo.getTotal());
        result.setMsg("操作成功");
        return result;
    }

    public static ResultVo success(Object object,Long count) {
        ResultVo result = new ResultVo();
        result.setCode("0");
        result.setData(object);
        result.setCount(count);
        result.setMsg("操作成功");
        return result;
    }

    public static ResultVo success(Object object,Long count,String msg) {
        ResultVo result = new ResultVo();
        result.setCode("0");
        result.setData(object);
        result.setCount(count);
        result.setMsg(msg);
        return result;
    }

    public static ResultVo success() {
        return success(null,null);
    }

    public static ResultVo success(String msg) {
        return success(null,null,msg);
    }

    public static ResultVo error(IErrorCodeEnum errorCodeEnum) {
        ResultVo result = new ResultVo();
        result.setCode(errorCodeEnum.getErrorCode());
        result.setMsg(errorCodeEnum.getErrorMsg());
        return result;
    }

    public static ResultVo authError(IErrorCodeEnum errorCodeEnum) {
        ResultVo result = new ResultVo();
        result.setCode("2");
        result.setCode(errorCodeEnum.getErrorCode());
        result.setMsg(errorCodeEnum.getErrorMsg());
        return result;
    }

    public static ResultVo error() {
        ResultVo result = new ResultVo();
        result.setCode("1");
        result.setMsg("操作失败");
        return result;
    }

    public static ResultVo error(String errorMsg) {
        ResultVo result = new ResultVo();
        result.setCode("1");
        result.setMsg(errorMsg);
        return result;
    }

    public static ResultVo error(String errorCode, String errorMsg) {
        ResultVo result = new ResultVo();
        result.setCode(errorCode);
        result.setMsg(errorMsg);
        return result;
    }
}