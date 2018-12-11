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
@RabbitListener(queues = "boil")
public class BoilCustomer {

    @RabbitHandler
    public void getMessage(String message){
        System.out.println("boil中的消息是"+message);
    }
}
