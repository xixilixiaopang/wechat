package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.OrderGoods;
import com.shuai.wechat.common.mapper.OrderGoodsMapper;
import com.shuai.wechat.common.service.IOrderGoodsService;
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
public class OrderGoodsServiceImpl extends ServiceImpl<OrderGoodsMapper, OrderGoods> implements IOrderGoodsService {
  @Resource
  private OrderGoodsMapper  mapper;
}
