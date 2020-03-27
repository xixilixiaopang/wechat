package com.shuai.wechat.common.entity.result;

import lombok.Data;

/**
 * @param <T>
 * @Description: TODO
 * @Author: zhengshaoshuai
 * @Date: 2020/3/27 11:00
 */
@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;
}
