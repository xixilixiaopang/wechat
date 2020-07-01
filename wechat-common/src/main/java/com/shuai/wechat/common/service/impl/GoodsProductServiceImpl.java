package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.GoodsProduct;
import com.shuai.wechat.common.mapper.GoodsProductMapper;
import com.shuai.wechat.common.service.IGoodsProductService;
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
public class GoodsProductServiceImpl extends ServiceImpl<GoodsProductMapper, GoodsProduct> implements IGoodsProductService {
  @Resource
  private GoodsProductMapper  mapper;
}
