package com.oel.lps.controller;


import com.oel.lps.bean.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: lps
 * @description: Mp
 * @author: ws
 * @create: 2019-11-28 11:54
 **/
@Controller
public class HelloSender {


        @Autowired
        private AmqpTemplate template;

        //发送消息
        @RequestMapping("mp")
                public void send() {
                User user=new User();    //实现Serializable接口
                user.setUsername("hlhdidi");
                user.setPassword("123");
                template.convertAndSend("queue",user);
                }

        //监听消息
        @RabbitListener(queues="queue")    //监听器监听指定的Queue
        public void process1(User user) {    //用User作为参数

                System.out.println("Receive1:"+user.getUsername());
        }

//
//        @RequestMapping("mp2")
//        public void send2() {
//
//                template.convertAndSend("exchange","topic.message","hello,rabbit~~~11");
//                template.convertAndSend("exchange","topic.messages","hello,rabbit~~~22");
//        }
//
//
//        @RabbitListener(queues="topic.message")    //监听器监听指定的Queue
//        public void process1(String str) {
//                System.out.println("message:"+str);
//        }
//        @RabbitListener(queues="topic.messages")    //监听器监听指定的Queue
//        public void process2(String str) {
//                System.out.println("messages:"+str);
//        }

}
