package com.wys.mq.exchange.direct;

import com.wys.bean.ProductBean;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

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
@RabbitListener(queues = "productDirectQuene")//监听的队列名称 productDirectQueue
public class DirectReceiverNew {

    @RabbitHandler
    public void process(ProductBean productBean) {
        System.out.println("产品 -- DirectReceiver消费者收到消息  : " + productBean.toString());
    }

}
