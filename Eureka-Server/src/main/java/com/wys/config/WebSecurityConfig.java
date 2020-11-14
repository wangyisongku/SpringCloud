package com.wys.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @ProjectName: SpringCloud
 * @Package: com.wys.config
 * @ClassName: WebSecurityConfig
 * @Author: wangy
 * @Description: ${description}
 * @Date: 2020/11/13 22:18
 * @Version: 1.0
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);  //加这句是为了访问eureka控制台和/actuator时能做安全控制
        http.csrf().disable();  //关闭csrf
    }
}
