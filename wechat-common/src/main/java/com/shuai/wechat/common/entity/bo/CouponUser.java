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
 * 微信商城小程序-优惠券用户使用表
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "CouponUser对象", description = "微信商城小程序-优惠券用户使用表")
public class CouponUser extends Model<CouponUser> {

    private static final long serialVersionUID = 1L;
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "用户ID")
    private Integer userId;
    @ApiModelProperty(value = "优惠券ID")
    private Integer couponId;
    @ApiModelProperty(value = "使用状态, 如果是0则未使用；如果是1则已使用；如果是2则已过期；如果是3则已经下架；")
    private Integer couponUserStatus;
    @ApiModelProperty(value = "使用时间")
    private LocalDateTime usedTime;
    @ApiModelProperty(value = "有效期开始时间")
    private LocalDateTime startTime;
    @ApiModelProperty(value = "有效期截至时间")
    private LocalDateTime endTime;
    @ApiModelProperty(value = "订单ID")
    private Integer orderId;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
