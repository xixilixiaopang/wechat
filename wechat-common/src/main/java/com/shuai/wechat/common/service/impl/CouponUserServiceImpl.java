package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.CouponUser;
import com.shuai.wechat.common.mapper.CouponUserMapper;
import com.shuai.wechat.common.service.ICouponUserService;
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
public class CouponUserServiceImpl extends ServiceImpl<CouponUserMapper, CouponUser> implements ICouponUserService {
  @Resource
  private CouponUserMapper  mapper;
}
