package com.shuai.wechat.common.service.impl;

import com.shuai.wechat.common.entity.bo.Address;
import com.shuai.wechat.common.mapper.AddressMapper;
import com.shuai.wechat.common.service.IAddressService;
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
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {
  @Resource
  private AddressMapper  mapper;
}
