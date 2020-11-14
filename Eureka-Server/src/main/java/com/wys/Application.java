package com.wys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ProjectName: SpringCloud
 * @Package: com.wys
 * @ClassName: Application
 * @Author: wangy
 * @Description: ${description}
 * @Date: 2019/3/11 21:38
 * @Version: 1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
