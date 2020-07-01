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
 * 微信商城小程序-意见反馈表
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Feedback对象", description = "微信商城小程序-意见反馈表")
public class Feedback extends Model<Feedback> {

    private static final long serialVersionUID = 1L;
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "用户表的用户ID")
    private Integer userId;
    @ApiModelProperty(value = "用户名称")
    private String username;
    @ApiModelProperty(value = "手机号")
    private String mobile;
    @ApiModelProperty(value = "反馈类型")
    private String feedType;
    @ApiModelProperty(value = "反馈内容")
    private String content;
    @ApiModelProperty(value = "状态")
    private Integer feedbackStatus;
    @ApiModelProperty(value = "是否含有图片")
    private Boolean hasPicture;
    @ApiModelProperty(value = "图片地址列表，采用JSON数组格式")
    private String picUrls;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
