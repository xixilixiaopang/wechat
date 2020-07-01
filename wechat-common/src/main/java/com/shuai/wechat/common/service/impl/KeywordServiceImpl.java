package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.Keyword;
import com.shuai.wechat.common.mapper.KeywordMapper;
import com.shuai.wechat.common.service.IKeywordService;
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
public class KeywordServiceImpl extends ServiceImpl<KeywordMapper, Keyword> implements IKeywordService {
  @Resource
  private KeywordMapper  mapper;
}
