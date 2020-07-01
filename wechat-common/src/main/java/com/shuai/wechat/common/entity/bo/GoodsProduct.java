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
 * 微信商城小程序-商品货品表
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "GoodsProduct对象", description = "微信商城小程序-商品货品表")
public class GoodsProduct extends Model<GoodsProduct> {

    private static final long serialVersionUID = 1L;
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "商品表的商品ID")
    private Integer goodsId;
    @ApiModelProperty(value = "商品规格值列表，采用JSON数组格式")
    private String specifications;
    @ApiModelProperty(value = "商品货品价格")
    private BigDecimal price;
    @ApiModelProperty(value = "商品货品数量")
    private Integer productNumber;
    @ApiModelProperty(value = "商品货品图片")
    private String url;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
