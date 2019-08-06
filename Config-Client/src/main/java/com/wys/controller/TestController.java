package com.wys.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: SpringCloud
 * @Package: com.wys.controller
 * @ClassName: TestController
 * @Author: wangy
 * @Description: ${description}
 * @Date: 2019/8/6 12:42
 * @Version: 1.0
 */
@RefreshScope   // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
@RestController
public class TestController {

    @Value("${wys.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}
