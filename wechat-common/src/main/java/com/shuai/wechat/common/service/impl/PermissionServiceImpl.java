package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.Permission;
import com.shuai.wechat.common.mapper.PermissionMapper;
import com.shuai.wechat.common.service.IPermissionService;
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
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {
  @Resource
  private PermissionMapper  mapper;
}
