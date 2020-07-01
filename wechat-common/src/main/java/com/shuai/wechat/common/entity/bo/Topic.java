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
 * 微信商城小程序-专题表
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Topic对象", description = "微信商城小程序-专题表")
public class Topic extends Model<Topic> {

    private static final long serialVersionUID = 1L;
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "专题标题")
    private String title;
    @ApiModelProperty(value = "专题子标题")
    private String subtitle;
    @ApiModelProperty(value = "专题内容，富文本格式")
    private String content;
    @ApiModelProperty(value = "专题相关商品最低价")
    private BigDecimal price;
    @ApiModelProperty(value = "专题阅读量")
    private String readCount;
    @ApiModelProperty(value = "专题图片")
    private String picUrl;
    @ApiModelProperty(value = "排序")
    private Integer sortOrder;
    @ApiModelProperty(value = "专题相关商品，采用JSON数组格式")
    private String goods;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
