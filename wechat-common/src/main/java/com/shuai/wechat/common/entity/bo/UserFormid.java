package com.shuai.wechat.common.entity.bo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 微信商城小程序-用户formid
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "UserFormid对象", description = "微信商城小程序-用户formid")
public class UserFormid extends Model<UserFormid> {

    private static final long serialVersionUID = 1L;
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "缓存的FormId")
        @TableField("formId")
    private String formId;
    @ApiModelProperty(value = "是FormId还是prepayId")
    private Boolean isprepay;
    @ApiModelProperty(value = "可用次数，fromId为1，prepay为3，用1次减1")
        @TableField("useAmount")
    private Integer useAmount;
    @ApiModelProperty(value = "过期时间，腾讯规定为7天")
    private LocalDateTime expireTime;
    @ApiModelProperty(value = "微信登录openid")
        @TableField("openId")
    private String openId;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
