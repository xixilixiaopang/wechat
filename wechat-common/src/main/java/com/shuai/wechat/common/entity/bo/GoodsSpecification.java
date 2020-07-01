package com.shuai.wechat.common.entity.bo;

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
 * 微信商城小程序-商品规格表
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "GoodsSpecification对象", description = "微信商城小程序-商品规格表")
public class GoodsSpecification extends Model<GoodsSpecification> {

    private static final long serialVersionUID = 1L;
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "商品表的商品ID")
    private Integer goodsId;
    @ApiModelProperty(value = "商品规格名称")
    private String specification;
    @ApiModelProperty(value = "商品规格值")
    private String goodsSpecificationValue;
    @ApiModelProperty(value = "商品规格图片")
    private String picUrl;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
