package com.shuai.wechat.system.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shuai.wechat.common.entity.dto.SysUserDto;
import com.shuai.wechat.system.WechatSystemApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Date;

/**
 * @Description: TODO
 * @Author: zhengshaoshuai
 * @Date: 2020/3/27 14:01
 */
@Slf4j
@AutoConfigureMockMvc
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SysUserControllerTest extends WechatSystemApplicationTests {
    @Autowired
    private MockMvc mockMvc;
    // 声明Jackson工具类
    public static final ObjectMapper MAPPER = new ObjectMapper();
    @Test
    public void save(){
        SysUserDto dto = new SysUserDto();
        dto.setAvatarurl("http://www.baidu.com");
        dto.setCity("保定市");
        dto.setCountry("定州市");
        dto.setCtime(new Date());
        dto.setProvince("河北省");
        dto.setGender(0);
        dto.setLanguage("Chinese");
        dto.setMobile("18888888888");
        dto.setNickname("shoke");
        try {
            String dtoStr = MAPPER.writeValueAsString(dto);
            MvcResult mvcResult = mockMvc.perform(
                    MockMvcRequestBuilders
                            .post("/sysUser/save")
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(dtoStr))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andReturn();
        } catch (Exception e) {
            log.error("新增用户单元测试失败：" + e);
        }

    }
}
