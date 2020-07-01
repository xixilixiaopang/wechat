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
 * 微信商城小程序-订单表
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Order对象", description = "微信商城小程序-订单表")
public class Order extends Model<Order> {

    private static final long serialVersionUID = 1L;
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "用户表的用户ID")
    private Integer userId;
    @ApiModelProperty(value = "订单编号")
    private String orderSn;
    @ApiModelProperty(value = "订单状态")
    private Integer orderStatus;
    @ApiModelProperty(value = "收货人名称")
    private String consignee;
    @ApiModelProperty(value = "收货人手机号")
    private String mobile;
    @ApiModelProperty(value = "收货具体地址")
    private String address;
    @ApiModelProperty(value = "用户订单留言")
    private String message;
    @ApiModelProperty(value = "商品总费用")
    private BigDecimal goodsPrice;
    @ApiModelProperty(value = "配送费用")
    private BigDecimal freightPrice;
    @ApiModelProperty(value = "优惠券减免")
    private BigDecimal couponPrice;
    @ApiModelProperty(value = "用户积分减免")
    private BigDecimal integralPrice;
    @ApiModelProperty(value = "团购优惠价减免")
    private BigDecimal grouponPrice;
    @ApiModelProperty(value = "订单费用， = goods_price + freight_price - coupon_price")
    private BigDecimal orderPrice;
    @ApiModelProperty(value = "实付费用， = order_price - integral_price")
    private BigDecimal actualPrice;
    @ApiModelProperty(value = "微信付款编号")
    private String payId;
    @ApiModelProperty(value = "微信付款时间")
    private LocalDateTime payTime;
    @ApiModelProperty(value = "发货编号")
    private String shipSn;
    @ApiModelProperty(value = "发货快递公司")
    private String shipChannel;
    @ApiModelProperty(value = "发货开始时间")
    private LocalDateTime shipTime;
    @ApiModelProperty(value = "用户确认收货时间")
    private LocalDateTime confirmTime;
    @ApiModelProperty(value = "待评价订单商品数量")
    private Integer comments;
    @ApiModelProperty(value = "订单关闭时间")
    private LocalDateTime endTime;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
