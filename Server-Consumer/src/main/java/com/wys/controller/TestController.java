package com.wys.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: SpringCloud
 * @Package: com.wys.controller
 * @ClassName: TestController
 * @Author: wangy
 * @Description: ${description}
 * @Date: 2019/3/21 22:19
 * @Version: 1.0
 */
@Slf4j
@RestController
@RequestMapping(value = "test")
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "test")
    public String test() {
        return "************测试测试测试************";
    }

    @GetMapping(value = "port")
    public String hello() {
        return restTemplate.getForEntity("http://server-provider/test/port", String.class).getBody();
    }
}
