package com.tensquare.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * describe:
 *
 * @author lb
 * @date 2018/12/11
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserApplication.class)
public class UserTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public  void testSend(){
        rabbitTemplate.convertAndSend("itcast","我要红包");
    }

    @Test
    public void testSendQueue(){
        rabbitTemplate.convertAndSend("chuanzhi","", "分列模式走起");

    }
}
