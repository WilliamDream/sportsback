package com.letansuo.sportsback.common.vo;


import com.letansuo.sportsback.error.errorCode.basic.IErrorCodeEnum;

public class ResultVo
{
    private Integer code;
    public Object data;
    private ErrorInfo errorInfo;

    public Integer getCode()
    {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    public static ResultVo success(Object object) {
        ResultVo result = new ResultVo();
        result.setCode(Integer.valueOf(0));
        result.setData(object);
        return result;
    }

    public static ResultVo success() {
        return success(null);
    }

    public static ResultVo error(IErrorCodeEnum errorCodeEnum) {
        ResultVo result = new ResultVo();
        result.setCode(Integer.valueOf(1));
        ErrorInfo errorInfo = new ErrorInfo(errorCodeEnum);
        result.setErrorInfo(errorInfo);
        return result;
    }

    public static ResultVo authError(IErrorCodeEnum errorCodeEnum) {
        ResultVo result = new ResultVo();
        result.setCode(Integer.valueOf(2));
        ErrorInfo errorInfo = new ErrorInfo(errorCodeEnum);
        result.setErrorInfo(errorInfo);
        return result;
    }

    public static ResultVo error(String errorCode, String errorMsg) {
        ResultVo result = new ResultVo();
        ErrorInfo errorInfo = new ErrorInfo();
        result.setCode(Integer.valueOf(1));
        errorInfo.setErrorCode(errorCode);
        errorInfo.setErrorMsg(errorMsg);
        result.setErrorInfo(errorInfo);
        return result;
    }
}