package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.Role;
import com.shuai.wechat.common.mapper.RoleMapper;
import com.shuai.wechat.common.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zheng
 */
@Slf4j
@Service
@Transactional
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {
  @Resource
  private RoleMapper  mapper;
}
