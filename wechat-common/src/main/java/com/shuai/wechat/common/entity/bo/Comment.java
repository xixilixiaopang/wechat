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
 * 微信商城小程序-评论表
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Comment对象", description = "微信商城小程序-评论表")
public class Comment extends Model<Comment> {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "如果type=0，则是商品评论；如果是type=1，则是专题评论。")
    private Integer valueId;
    @ApiModelProperty(value = "评论类型，如果type=0，则是商品评论；如果是type=1，则是专题评论；如果type=3，则是订单商品评论。")
    private Integer commentType;
    @ApiModelProperty(value = "评论内容")
    private String content;
    @ApiModelProperty(value = "用户表的用户ID")
    private Integer userId;
    @ApiModelProperty(value = "是否含有图片")
    private Boolean hasPicture;
    @ApiModelProperty(value = "图片地址列表，采用JSON数组格式")
    private String picUrls;
    @ApiModelProperty(value = "评分， 1-5")
    private Integer star;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
