package com.shuai.wechat.common.entity.bo;

import java.math.BigDecimal;

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
 * 微信商城小程序-优惠券信息及规则表
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Coupon对象", description = "微信商城小程序-优惠券信息及规则表")
public class Coupon extends Model<Coupon> {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "优惠券名称")
    private String couponName;
    @ApiModelProperty(value = "优惠券介绍，通常是显示优惠券使用限制文字")
    private String couponDesc;
    @ApiModelProperty(value = "优惠券标签，例如新人专用")
    private String tag;
    @ApiModelProperty(value = "优惠券数量，如果是0，则是无限量")
    private Integer total;
    @ApiModelProperty(value = "优惠金额，")
    private BigDecimal discount;
    @ApiModelProperty(value = "最少消费金额才能使用优惠券。")
    private BigDecimal min;
    @ApiModelProperty(value = "用户领券限制数量，如果是0，则是不限制；默认是1，限领一张.")
    private Integer couponLimit;
    @ApiModelProperty(value = "优惠券赠送类型，如果是0则通用券，用户领取；如果是1，则是注册赠券；如果是2，则是优惠券码兑换；")
    private Integer couponType;
    @ApiModelProperty(value = "优惠券状态，如果是0则是正常可用；如果是1则是过期; 如果是2则是下架。")
    private Integer couponStatus;
    @ApiModelProperty(value = "商品限制类型，如果0则全商品，如果是1则是类目限制，如果是2则是商品限制。")
    private Integer goodsType;
    @ApiModelProperty(value = "商品限制值，goods_type如果是0则空集合，如果是1则是类目集合，如果是2则是商品集合。")
    private String goodsValue;
    @ApiModelProperty(value = "优惠券兑换码")
    private String couponCode;
    @ApiModelProperty(value = "有效时间限制，如果是0，则基于领取时间的有效天数days；如果是1，则start_time和end_time是优惠券有效期；")
    private Integer timeType;
    @ApiModelProperty(value = "基于领取时间的有效天数days。")
    private Integer days;
    @ApiModelProperty(value = "使用券开始时间")
    private LocalDateTime startTime;
    @ApiModelProperty(value = "使用券截至时间")
    private LocalDateTime endTime;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
