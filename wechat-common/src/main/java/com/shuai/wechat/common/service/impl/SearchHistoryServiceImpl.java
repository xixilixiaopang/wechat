package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.SearchHistory;
import com.shuai.wechat.common.mapper.SearchHistoryMapper;
import com.shuai.wechat.common.service.ISearchHistoryService;
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
public class SearchHistoryServiceImpl extends ServiceImpl<SearchHistoryMapper, SearchHistory> implements ISearchHistoryService {
  @Resource
  private SearchHistoryMapper  mapper;
}
