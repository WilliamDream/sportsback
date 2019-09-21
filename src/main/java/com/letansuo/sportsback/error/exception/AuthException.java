package com.letansuo.sportsback.error.exception;

import com.letansuo.sportsback.error.errorCode.AuthErrorCode;

public class AuthException extends BizException
{
  private static final long serialVersionUID = 1L;

  public AuthException(AuthErrorCode authErrorCode)
  {
    super(authErrorCode);
  }
}