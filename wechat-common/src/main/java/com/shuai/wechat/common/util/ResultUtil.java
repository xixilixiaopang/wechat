package com.shuai.wechat.common.util;

import com.shuai.wechat.common.entity.result.Result;
import com.shuai.wechat.common.enums.HttpStatusEnum;

/**
 * @Description: TODO
 * @Author: zhengshaoshuai
 * @Date: 2020/3/27 11:27
 */
public final class ResultUtil {

    public static Result successResult(HttpStatusEnum httpStatusEnum) {
        Result result = new Result();
        result.setCode(httpStatusEnum.getCode());
        result.setMsg(httpStatusEnum.getMsg());
        return result;
    }
}
