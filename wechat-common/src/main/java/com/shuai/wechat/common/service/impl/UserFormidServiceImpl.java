package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.UserFormid;
import com.shuai.wechat.common.mapper.UserFormidMapper;
import com.shuai.wechat.common.service.IUserFormidService;
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
public class UserFormidServiceImpl extends ServiceImpl<UserFormidMapper, UserFormid> implements IUserFormidService {
  @Resource
  private UserFormidMapper  mapper;
}
