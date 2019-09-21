package com.letansuo.sportsback.common.vo;

import com.letansuo.sportsback.error.errorCode.basic.IErrorCodeEnum;

public class ErrorInfo
{
    private String errorCode;
    private String errorMsg;

    public ErrorInfo()
    {
    }

    public ErrorInfo(IErrorCodeEnum errorCodeEnum)
    {
        this.errorCode = errorCodeEnum.getErrorCode();
        this.errorMsg = errorCodeEnum.getErrorMsg();
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

}