package com.wys.mq.exchange.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @ProjectName: SpringCloud
 * @Package: com.wys.exchange.fanout
 * @ClassName: FanoutReceiverC
 * @Author: wangy
 * @Description: ${description}
 * @Date: 2020/11/11 21:41
 * @Version: 1.0
 */

@Component
@RabbitListener(queues = "fanout.C")
public class FanoutReceiverC {

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("FanoutReceiverC消费者收到消息  : " +testMessage.toString());
    }

}
