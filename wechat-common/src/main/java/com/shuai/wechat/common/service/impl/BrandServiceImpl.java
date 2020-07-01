package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.Brand;
import com.shuai.wechat.common.mapper.BrandMapper;
import com.shuai.wechat.common.service.IBrandService;
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
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {
  @Resource
  private BrandMapper  mapper;
}
