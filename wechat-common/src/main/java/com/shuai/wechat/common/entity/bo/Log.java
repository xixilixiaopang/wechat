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
 * 微信商城小程序-操作日志表
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Log对象", description = "微信商城小程序-操作日志表")
public class Log extends Model<Log> {

    private static final long serialVersionUID = 1L;
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "管理员")
    private String admin;
    @ApiModelProperty(value = "管理员地址")
    private String ip;
    @ApiModelProperty(value = "操作分类")
    private Integer logType;
    @ApiModelProperty(value = "操作动作")
    private String logAction;
    @ApiModelProperty(value = "操作状态")
    private Boolean logStatus;
    @ApiModelProperty(value = "操作结果，或者成功消息，或者失败消息")
    private String result;
    @ApiModelProperty(value = "补充信息")
    private String logComment;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
