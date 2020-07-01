package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.Groupon;
import com.shuai.wechat.common.mapper.GrouponMapper;
import com.shuai.wechat.common.service.IGrouponService;
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
public class GrouponServiceImpl extends ServiceImpl<GrouponMapper, Groupon> implements IGrouponService {
  @Resource
  private GrouponMapper  mapper;
}
