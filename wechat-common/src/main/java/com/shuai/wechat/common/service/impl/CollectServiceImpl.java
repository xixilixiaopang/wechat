package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.Collect;
import com.shuai.wechat.common.mapper.CollectMapper;
import com.shuai.wechat.common.service.ICollectService;
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
public class CollectServiceImpl extends ServiceImpl<CollectMapper, Collect> implements ICollectService {
  @Resource
  private CollectMapper  mapper;
}
