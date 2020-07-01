package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.Topic;
import com.shuai.wechat.common.mapper.TopicMapper;
import com.shuai.wechat.common.service.ITopicService;
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
public class TopicServiceImpl extends ServiceImpl<TopicMapper, Topic> implements ITopicService {
  @Resource
  private TopicMapper  mapper;
}
