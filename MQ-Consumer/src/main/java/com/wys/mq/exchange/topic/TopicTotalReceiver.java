package com.wys.mq.exchange.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @ProjectName: SpringCloud
 * @Package: com.wys.exchange.topic
 * @ClassName: TopicTotalReceiver
 * @Author: wangy
 * @Description: ${description}
 * @Date: 2020/11/11 21:20
 * @Version: 1.0
 */
@Component
@RabbitListener(queues = "topic.woman")
public class TopicTotalReceiver {

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("TopicTotalReceiver消费者收到消息  : " + testMessage.toString());
    }
}
