package com.shuai.wechat.common.entity.bo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class SysUser implements Serializable {
    private Integer id;

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

    private static final long serialVersionUID = 1L;

}
