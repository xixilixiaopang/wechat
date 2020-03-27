package com.shuai.wechat.system;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.security.RunAs;
@Ignore
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WechatSystemApplication.class)
public class WechatSystemApplicationTests {

    @Test
    void contextLoads() {
    }

}
