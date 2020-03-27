package com.shuai.wechat.system.controller;

import com.shuai.wechat.common.entity.dto.SysUserDto;
import com.shuai.wechat.common.entity.result.Result;
import com.shuai.wechat.common.enums.HttpStatusEnum;
import com.shuai.wechat.common.service.SysUserService;
import com.shuai.wechat.common.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 用户相关接口
 * @Author: zhengshaoshuai
 * @Date: 2020/3/27 10:37
 */
@Slf4j
@RestController
@RequestMapping(value = "/sysUser")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @PostMapping(value = "/save")
    public Result saveUser(@RequestBody SysUserDto dto) {
        try {
            sysUserService.saveSysUser(dto);
            return ResultUtil.successResult(HttpStatusEnum.OK);
        } catch (Exception e) {
            return ResultUtil.successResult(HttpStatusEnum.BAD_REQUEST);
        }
    }
}
