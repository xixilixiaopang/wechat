package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.Goods;
import com.shuai.wechat.common.mapper.GoodsMapper;
import com.shuai.wechat.common.service.IGoodsService;
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
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {
  @Resource
  private GoodsMapper  mapper;
}
