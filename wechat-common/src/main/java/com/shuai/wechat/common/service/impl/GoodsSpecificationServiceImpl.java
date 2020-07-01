package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.GoodsSpecification;
import com.shuai.wechat.common.mapper.GoodsSpecificationMapper;
import com.shuai.wechat.common.service.IGoodsSpecificationService;
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
public class GoodsSpecificationServiceImpl extends ServiceImpl<GoodsSpecificationMapper, GoodsSpecification> implements IGoodsSpecificationService {
  @Resource
  private GoodsSpecificationMapper  mapper;
}
