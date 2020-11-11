package com.wys.exchange.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @ProjectName: SpringCloud
 * @Package: com.wys.mq
 * @ClassName: TopicManReceiver
 * @Author: wangy
 * @Description: ${description}
 * @Date: 2020/11/11 21:11
 * @Version: 1.0
 */
@Component
@RabbitListener(queues = "topic.man")
public class TopicManReceiver {

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("TopicManReceiver消费者收到消息  : " + testMessage.toString());
    }

}
