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
 * 微信商城小程序-文件存储表
 *
 * @author zheng
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Storage对象", description = "微信商城小程序-文件存储表")
public class Storage extends Model<Storage> {

    private static final long serialVersionUID = 1L;
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "文件的唯一索引")
    private String storageKey;
    @ApiModelProperty(value = "文件名")
    private String storageName;
    @ApiModelProperty(value = "文件类型")
    private String storageType;
    @ApiModelProperty(value = "文件大小")
    private Integer size;
    @ApiModelProperty(value = "文件访问链接")
    private String url;
    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
