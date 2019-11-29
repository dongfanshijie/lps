package com.oel.lps.controller;

import com.oel.lps.LpsApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: lps
 * @description: TestRabbitMQ
 * @author: ws
 * @create: 2019-11-28 15:55
 **/
@SpringBootTest(classes= LpsApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRabbitMQ {

    @Autowired
    private HelloSender helloSender;

    @Test
    public void testRabbit() {
        //helloSender.send();
    }
}