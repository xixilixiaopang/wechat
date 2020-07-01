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
 * 微信商城小程序-类目表
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Category对象", description = "微信商城小程序-类目表")
public class Category extends Model<Category> {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "类目名称")
    private String categoryName;
    @ApiModelProperty(value = "类目关键字，以JSON数组格式")
    private String keywords;
    @ApiModelProperty(value = "类目广告语介绍")
    private String categoryDesc;
    @ApiModelProperty(value = "父类目ID")
    private Integer pid;
    @ApiModelProperty(value = "类目图标")
    private String iconUrl;
    @ApiModelProperty(value = "类目图片")
    private String picUrl;
    private String categoryLevel;
    @ApiModelProperty(value = "排序")
    private Integer sortOrder;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
