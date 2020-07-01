package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.GoodsAttribute;
import com.shuai.wechat.common.mapper.GoodsAttributeMapper;
import com.shuai.wechat.common.service.IGoodsAttributeService;
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
public class GoodsAttributeServiceImpl extends ServiceImpl<GoodsAttributeMapper, GoodsAttribute> implements IGoodsAttributeService {
  @Resource
  private GoodsAttributeMapper  mapper;
}
