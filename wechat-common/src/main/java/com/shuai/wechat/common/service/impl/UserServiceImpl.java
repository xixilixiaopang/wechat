package com.shuai.wechat.common.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.shuai.wechat.common.entity.bo.User;
import com.shuai.wechat.common.entity.dto.LoginInfoDTO;
import com.shuai.wechat.common.entity.result.Result;
import com.shuai.wechat.common.entity.vo.UserVo;
import com.shuai.wechat.common.enums.HttpStatusEnum;
import com.shuai.wechat.common.mapper.UserMapper;
import com.shuai.wechat.common.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shuai.wechat.common.util.Md5Util;
import com.shuai.wechat.common.util.ResultUtil;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
  @Resource
  private UserMapper  mapper;

  /**
   * 用户登录
   * @param loginInfoDTO
   * @return
   */
  @Override
  public Result<UserVo> login(LoginInfoDTO loginInfoDTO) {
    LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<User>();
    userLambdaQueryWrapper.eq(User::getUsername, loginInfoDTO.getUsername());
    User user = this.getOne(userLambdaQueryWrapper);
    String message = "";
    Result result = new Result();
    if (user == null) {
      message = "用户名或密码不正确！";
      result = ResultUtil.successResult(HttpStatusEnum.UNAUTHORIZED.getCode(), message, null);
    } else {
      if (!user.getUserPassword().equals(Md5Util.getMd5(loginInfoDTO.getPassword()))) {
        message = "用户名或密码不正确！";
        result = ResultUtil.successResult(HttpStatusEnum.UNAUTHORIZED.getCode(), message, null);
      } else {
        message = "登录成功！";
        result = ResultUtil.successResult(HttpStatusEnum.OK.getCode(), message, null);
      }
    }
    return result;
  }
}
