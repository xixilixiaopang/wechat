package com.shuai.wechat.common.entity.bo;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 微信商城小程序-订单商品表
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "OrderGoods对象", description = "微信商城小程序-订单商品表")
public class OrderGoods extends Model<OrderGoods> {

    private static final long serialVersionUID = 1L;
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "订单表的订单ID")
    private Integer orderId;
    @ApiModelProperty(value = "商品表的商品ID")
    private Integer goodsId;
    @ApiModelProperty(value = "商品名称")
    private String goodsName;
    @ApiModelProperty(value = "商品编号")
    private String goodsSn;
    @ApiModelProperty(value = "商品货品表的货品ID")
    private Integer productId;
    @ApiModelProperty(value = "商品货品的购买数量")
    private Integer goodsNumber;
    @ApiModelProperty(value = "商品货品的售价")
    private BigDecimal price;
    @ApiModelProperty(value = "商品货品的规格列表")
    private String specifications;
    @ApiModelProperty(value = "商品货品图片或者商品图片")
    private String picUrl;
    @ApiModelProperty(value = "订单商品评论，如果是-1，则超期不能评价；如果是0，则可以评价；如果其他值，则是comment表里面的评论ID。")
    private Integer goodsComment;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
