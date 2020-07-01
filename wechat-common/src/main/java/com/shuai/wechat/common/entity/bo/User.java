package com.shuai.wechat.common.entity.bo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 微信商城小程序-用户表
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "User对象", description = "微信商城小程序-用户表")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "用户名称")
    private String username;
    @ApiModelProperty(value = "用户密码")
    private String userPassword;
    @ApiModelProperty(value = "性别：0 未知， 1男， 1 女")
    private Integer gender;
    @ApiModelProperty(value = "生日")
    private LocalDate birthday;
    @ApiModelProperty(value = "最近一次登录时间")
    private LocalDateTime lastLoginTime;
    @ApiModelProperty(value = "最近一次登录IP地址")
    private String lastLoginIp;
    @ApiModelProperty(value = "0 普通用户，1 VIP用户，2 高级VIP用户")
    private Integer userLevel;
    @ApiModelProperty(value = "用户昵称或网络名称")
    private String nickname;
    @ApiModelProperty(value = "用户手机号码")
    private String mobile;
    @ApiModelProperty(value = "用户头像图片")
    private String avatar;
    @ApiModelProperty(value = "微信登录openid")
    private String weixinOpenid;
    @ApiModelProperty(value = "微信登录会话KEY")
    private String sessionKey;
    @ApiModelProperty(value = "0 可用, 1 禁用, 2 注销")
    private Integer userStatus;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
