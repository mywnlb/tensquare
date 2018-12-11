package com.tensquare.user.customer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * describe:
 *
 * @author lb
 * @date 2018/12/11
 */
@Component
@RabbitListener(queues = "itcast")
public class Customer {
    @RabbitHandler
    public void showMessage(String message){
        System.out.println("itcast中的消息是"+message);
    }
}
