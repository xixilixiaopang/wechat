package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.Region;
import com.shuai.wechat.common.mapper.RegionMapper;
import com.shuai.wechat.common.service.IRegionService;
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
public class RegionServiceImpl extends ServiceImpl<RegionMapper, Region> implements IRegionService {
  @Resource
  private RegionMapper  mapper;
}
