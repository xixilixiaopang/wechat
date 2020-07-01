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
 * 微信商城小程序-品牌商表
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Brand对象", description = "微信商城小程序-品牌商表")
public class Brand extends Model<Brand> {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "品牌商名称")
    private String brandName;
    @ApiModelProperty(value = "品牌商简介")
    private String brandDesc;
    @ApiModelProperty(value = "品牌商页的品牌商图片")
    private String picUrl;
    private Integer sortOrder;
    @ApiModelProperty(value = "品牌商的商品低价，仅用于页面展示")
    private BigDecimal floorPrice;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
