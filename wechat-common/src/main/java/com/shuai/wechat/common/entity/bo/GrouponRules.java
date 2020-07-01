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
 * 微信商城小程序-团购规则
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "GrouponRules对象", description = "微信商城小程序-团购规则")
public class GrouponRules extends Model<GrouponRules> {

    private static final long serialVersionUID = 1L;
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "商品表的商品ID")
    private Integer goodsId;
    @ApiModelProperty(value = "商品名称")
    private String goodsName;
    @ApiModelProperty(value = "商品图片或者商品货品图片")
    private String picUrl;
    @ApiModelProperty(value = "优惠金额")
    private BigDecimal discount;
    @ApiModelProperty(value = "达到优惠条件的人数")
    private Integer discountMember;
    @ApiModelProperty(value = "团购过期时间")
    private LocalDateTime expireTime;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
