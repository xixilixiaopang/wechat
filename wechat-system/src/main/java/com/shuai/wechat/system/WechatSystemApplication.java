package com.shuai.wechat.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("com.shuai.wechat.*.mapper")
@ComponentScan(basePackages = {"com.shuai.wechat.common", "com.shuai.wechat.system"} )
@EnableAsync
public class WechatSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(WechatSystemApplication.class, args);
    }

}
