package com.wys.mq.exchange.direct;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @ProjectName: SpringCloud
 * @Package: com.wys.mq
 * @ClassName: DirectReceiver
 * @Author: wangy
 * @Description: ${description}
 * @Date: 2020/11/11 20:24
 * @Version: 1.0
 */
@Component
@RabbitListener(queues = "TestDirectQueue")//监听的队列名称 TestDirectQueue
public class DirectReceiver {

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("第一个 -- DirectReceiver消费者收到消息  : " + testMessage.toString());
    }

}
