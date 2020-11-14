package com.wys.mq;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: SpringCloud
 * @Package: com.wys.mq
 * @ClassName: TopicRabbitConfig
 * @Author: wangy
 * @Description: ${description}
 * @Date: 2020/11/11 21:07
 * @Version: 1.0
 */
@Configuration
public class LonelyRabbitConfig {

    @Bean
    DirectExchange lonelyExchange() {
        return new DirectExchange("lonelyDirectExchange");
    }

}
