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
 * 微信商城小程序-收货地址表
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Address对象", description = "微信商城小程序-收货地址表")
public class Address extends Model<Address> {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "收货人名称")
    private String addressName;
    @ApiModelProperty(value = "用户表的用户ID")
    private Integer userId;
    @ApiModelProperty(value = "行政区域表的省ID")
    private String province;
    @ApiModelProperty(value = "行政区域表的市ID")
    private String city;
    @ApiModelProperty(value = "行政区域表的区县ID")
    private String county;
    @ApiModelProperty(value = "详细收货地址")
    private String addressDetail;
    @ApiModelProperty(value = "地区编码")
    private String areaCode;
    @ApiModelProperty(value = "邮政编码")
    private String postalCode;
    @ApiModelProperty(value = "手机号码")
    private String tel;
    @ApiModelProperty(value = "是否默认地址")
    private Boolean isDefault;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
