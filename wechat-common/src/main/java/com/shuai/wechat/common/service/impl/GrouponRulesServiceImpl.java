package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.GrouponRules;
import com.shuai.wechat.common.mapper.GrouponRulesMapper;
import com.shuai.wechat.common.service.IGrouponRulesService;
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
public class GrouponRulesServiceImpl extends ServiceImpl<GrouponRulesMapper, GrouponRules> implements IGrouponRulesService {
  @Resource
  private GrouponRulesMapper  mapper;
}
