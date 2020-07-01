package com.shuai.wechat.system.controller;


import com.shuai.wechat.common.entity.dto.LoginInfoDTO;
import com.shuai.wechat.common.entity.result.Result;
import com.shuai.wechat.common.entity.vo.UserVo;
import com.shuai.wechat.common.enums.HttpStatusEnum;
import com.shuai.wechat.common.service.IUserService;
import com.shuai.wechat.common.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * @author zheng
 */
@Slf4j
@RestController
@RequestMapping("/user")
@Api(description = "用户信息相关接口")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/login")
    @ApiOperation(value = "登录接口")
    public Result<UserVo> login(@Valid @RequestBody LoginInfoDTO loginInfoDTO,
                                BindingResult bindingResult,
                                HttpServletRequest request,
                                HttpServletResponse response) {
        if (bindingResult.hasErrors()) {
            String message = bindingResult.getFieldError().getDefaultMessage();
            log.error("【用户登录】用户登录参数异常， 异常信息：{}", message);
            response.setStatus(HttpStatusEnum.UNAUTHORIZED.getCode());
            return ResultUtil.successResult(HttpStatusEnum.UNAUTHORIZED.getCode(), message, null);
        }
        try {
            return userService.login(loginInfoDTO);
        } catch (Exception e) {
            log.error("【用户登录】用户登录出现服务器异常， 异常信息：" + e);
            response.setStatus(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode());
            return ResultUtil.successResult(HttpStatusEnum.INTERNAL_SERVER_ERROR, null);
        }
    }

}
