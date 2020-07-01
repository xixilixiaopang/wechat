package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.Footprint;
import com.shuai.wechat.common.mapper.FootprintMapper;
import com.shuai.wechat.common.service.IFootprintService;
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
public class FootprintServiceImpl extends ServiceImpl<FootprintMapper, Footprint> implements IFootprintService {
  @Resource
  private FootprintMapper  mapper;
}
