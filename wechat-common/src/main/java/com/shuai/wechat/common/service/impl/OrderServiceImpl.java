package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.Order;
import com.shuai.wechat.common.mapper.OrderMapper;
import com.shuai.wechat.common.service.IOrderService;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {
  @Resource
  private OrderMapper  mapper;
}
