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
 * 微信商城小程序-团购
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Groupon对象", description = "微信商城小程序-团购")
public class Groupon extends Model<Groupon> {

    private static final long serialVersionUID = 1L;
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "关联的订单ID")
    private Integer orderId;
    @ApiModelProperty(value = "参与的团购ID，仅当user_type不是1")
    private Integer grouponId;
    @ApiModelProperty(value = "团购规则ID，关联litemall_groupon_rules表ID字段")
    private Integer rulesId;
    @ApiModelProperty(value = "用户ID")
    private Integer userId;
    @ApiModelProperty(value = "创建者ID")
    private Integer creatorUserId;
    @ApiModelProperty(value = "团购分享图片地址")
    private String shareUrl;
    @ApiModelProperty(value = "是否已经支付")
    private Boolean payed;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
