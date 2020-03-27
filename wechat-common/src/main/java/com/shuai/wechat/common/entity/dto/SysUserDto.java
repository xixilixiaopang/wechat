package com.shuai.wechat.common.entity.dto;

import lombok.Data;

import java.util.Date;

/**
 * @Description: TODO
 * @Author: zhengshaoshuai
 * @Date: 2020/3/27 13:07
 */
@Data
public class SysUserDto {
    private String openid;

    private String nickname;

    private String avatarurl;

    private int gender;

    private String country;

    private String province;

    private String city;

    private String language;

    private Date ctime;

    private String mobile;
}
