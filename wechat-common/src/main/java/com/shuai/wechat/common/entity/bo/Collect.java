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
 * 微信商城小程序-收藏表
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Collect对象", description = "微信商城小程序-收藏表")
public class Collect extends Model<Collect> {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "用户表的用户ID")
    private Integer userId;
    @ApiModelProperty(value = "如果type=0，则是商品ID；如果type=1，则是专题ID")
    private Integer valueId;
    @ApiModelProperty(value = "收藏类型，如果type=0，则是商品ID；如果type=1，则是专题ID")
    private Integer collectType;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
