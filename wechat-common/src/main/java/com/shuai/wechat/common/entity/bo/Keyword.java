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
 * 微信商城小程序-关键字表
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Keyword对象", description = "微信商城小程序-关键字表")
public class Keyword extends Model<Keyword> {

    private static final long serialVersionUID = 1L;
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "关键字")
    private String keyword;
    @ApiModelProperty(value = "关键字的跳转链接")
    private String url;
    @ApiModelProperty(value = "是否是热门关键字")
    private Boolean isHot;
    @ApiModelProperty(value = "是否是默认关键字")
    private Boolean isDefault;
    @ApiModelProperty(value = "排序")
    private Integer sortOrder;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
