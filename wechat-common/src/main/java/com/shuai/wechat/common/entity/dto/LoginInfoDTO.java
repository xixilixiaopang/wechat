package com.shuai.wechat.common.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @Description: 系统登录DTO
 * @Author: zheng
 * @Date: 2020/4/23 14:52
 */
@Data
@ApiModel("系统登录DTO")
public class LoginInfoDTO implements Serializable {

    @ApiModelProperty(value = "*登录名", example = "shoke")
    @NotBlank(message = "登录名为空！")
    private String username;

    @ApiModelProperty(value = "*密码", example = "111111")
    @NotBlank(message = "密码为空")
    private String password;
}
