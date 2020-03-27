package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.SysUser;
import com.shuai.wechat.common.entity.dto.SysUserDto;
import com.shuai.wechat.common.mapper.SysUserMapper;
import com.shuai.wechat.common.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: TODO
 * @Author: zhengshaoshuai
 * @Date: 2020/3/27 13:53
 */
@Slf4j
@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;
    @Override
    public void saveSysUser(SysUserDto dto) {
        SysUser sysUser = new SysUser();
        BeanUtils.copyProperties(dto, sysUser);
        sysUserMapper.insertSelective(sysUser);
    }
}
