package com.shuai.wechat.common.service;

import com.shuai.wechat.common.entity.bo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shuai.wechat.common.entity.dto.LoginInfoDTO;
import com.shuai.wechat.common.entity.result.Result;
import com.shuai.wechat.common.entity.vo.UserVo;

/**
 * @author zheng
 */
public interface IUserService extends IService<User> {

    Result<UserVo> login(LoginInfoDTO loginInfoDTO);

}
