package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.Feedback;
import com.shuai.wechat.common.mapper.FeedbackMapper;
import com.shuai.wechat.common.service.IFeedbackService;
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
public class FeedbackServiceImpl extends ServiceImpl<FeedbackMapper, Feedback> implements IFeedbackService {
  @Resource
  private FeedbackMapper  mapper;
}
