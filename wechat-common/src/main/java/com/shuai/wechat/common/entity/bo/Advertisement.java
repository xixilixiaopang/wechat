package com.shuai.wechat.common.entity.bo;

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
 * 微信商城小程序-广告表
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Advertisement对象", description = "微信商城小程序-广告表")
public class Advertisement extends Model<Advertisement> {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "广告标题")
    private String advertisementName;
    @ApiModelProperty(value = "所广告的商品页面或者活动页面链接地址")
    private String link;
    @ApiModelProperty(value = "广告宣传图片")
    private String url;
    @ApiModelProperty(value = "广告位置：1则是首页")
    private Integer position;
    @ApiModelProperty(value = "活动内容")
    private String content;
    @ApiModelProperty(value = "广告开始时间")
    private LocalDateTime startTime;
    @ApiModelProperty(value = "广告结束时间")
    private LocalDateTime endTime;
    @ApiModelProperty(value = "是否启动")
    private Boolean enabled;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
