package com.wys.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: SpringCloud
 * @Package: com.wys.controller
 * @ClassName: TestController
 * @Author: wangy
 * @Description: ${description}
 * @Date: 2019/3/21 22:07
 * @Version: 1.0
 */
@Slf4j
@RestController
@RequestMapping(value = "test")
public class TestController {

    @Value("${server.port}")
    private int port;

    @GetMapping(value = "port")
    public String port() {
        String str = "我的端口号是：" + port;
        log.info(str);
        return str;
    }
}
