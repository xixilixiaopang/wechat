package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.Storage;
import com.shuai.wechat.common.mapper.StorageMapper;
import com.shuai.wechat.common.service.IStorageService;
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
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage> implements IStorageService {
  @Resource
  private StorageMapper  mapper;
}
