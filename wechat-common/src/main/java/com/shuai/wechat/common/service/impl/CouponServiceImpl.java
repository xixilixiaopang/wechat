package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.Coupon;
import com.shuai.wechat.common.mapper.CouponMapper;
import com.shuai.wechat.common.service.ICouponService;
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
public class CouponServiceImpl extends ServiceImpl<CouponMapper, Coupon> implements ICouponService {
  @Resource
  private CouponMapper  mapper;
}
