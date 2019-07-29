package com.wys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: SpringCloud
 * @Package: com.wys
 * @ClassName: Application
 * @Author: wangy
 * @Description: ${description}
 * @Date: 2019/3/11 21:38
 * @Version: 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
