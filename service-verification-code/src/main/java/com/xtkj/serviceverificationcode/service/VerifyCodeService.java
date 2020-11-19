package com.xtkj.serviceverificationcode.service;

import com.xtkj.internalcommon.dto.ResponseResult;
import com.xtkj.internalcommon.serviceverificationcode.VerifyCodeResponse;

public interface VerifyCodeService {
    //获取验证码
    public ResponseResult<VerifyCodeResponse> generate(int identity,String phoneNumber);
    //校验验证码
    public ResponseResult<VerifyCodeResponse> verify(int identity,String phoneNumber,int code);
}
