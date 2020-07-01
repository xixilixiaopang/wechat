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
 * 微信商城小程序-行政区域表
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Region对象", description = "微信商城小程序-行政区域表")
public class Region extends Model<Region> {

    private static final long serialVersionUID = 1L;
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "行政区域父ID，例如区县的pid指向市，市的pid指向省，省的pid则是0")
    private Integer pid;
    @ApiModelProperty(value = "行政区域名称")
    private String regionName;
    @ApiModelProperty(value = "行政区域类型，如如1则是省， 如果是2则是市，如果是3则是区县")
    private Integer regionType;
    @ApiModelProperty(value = "行政区域编码")
    private Integer regionCode;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
