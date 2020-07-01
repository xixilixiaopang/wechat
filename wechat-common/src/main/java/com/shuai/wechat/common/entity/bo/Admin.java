package com.shuai.wechat.common.entity.bo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;
import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 微信商城小程序-管理员表
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Admin对象", description = "微信商城小程序-管理员表")
public class Admin extends Model<Admin> {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "管理员名称")
    private String username;
    @ApiModelProperty(value = "管理员密码")
    private String adminPassword;
    @ApiModelProperty(value = "最近一次登录IP地址")
    private String lastLoginIp;
    @ApiModelProperty(value = "最近一次登录时间")
    private LocalDateTime lastLoginTime;
    @ApiModelProperty(value = "头像图片")
    private String avatar;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;
    @ApiModelProperty(value = "角色列表")
    private String roleIds;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
