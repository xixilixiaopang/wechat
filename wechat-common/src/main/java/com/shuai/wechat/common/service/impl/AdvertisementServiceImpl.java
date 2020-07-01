package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.Advertisement;
import com.shuai.wechat.common.mapper.AdvertisementMapper;
import com.shuai.wechat.common.service.IAdvertisementService;
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
public class AdvertisementServiceImpl extends ServiceImpl<AdvertisementMapper, Advertisement> implements IAdvertisementService {
  @Resource
  private AdvertisementMapper  mapper;
}
