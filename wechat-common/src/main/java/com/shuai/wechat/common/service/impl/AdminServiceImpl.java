package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.Admin;
import com.shuai.wechat.common.mapper.AdminMapper;
import com.shuai.wechat.common.service.IAdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {
  @Resource
  private AdminMapper  mapper;
}
