package com.wys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ProjectName: SpringCloud
 * @Package: com.wys
 * @ClassName: Application
 * @Author: wangy
 * @Description: ${description}
 * @Date: 2019/3/11 21:38
 * @Version: 1.0
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
