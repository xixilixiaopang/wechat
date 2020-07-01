package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.Issue;
import com.shuai.wechat.common.mapper.IssueMapper;
import com.shuai.wechat.common.service.IIssueService;
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
public class IssueServiceImpl extends ServiceImpl<IssueMapper, Issue> implements IIssueService {
  @Resource
  private IssueMapper  mapper;
}
