package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.System;
import com.shuai.wechat.common.mapper.SystemMapper;
import com.shuai.wechat.common.service.ISystemService;
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
public class SystemServiceImpl extends ServiceImpl<SystemMapper, System> implements ISystemService {
  @Resource
  private SystemMapper  mapper;
}
