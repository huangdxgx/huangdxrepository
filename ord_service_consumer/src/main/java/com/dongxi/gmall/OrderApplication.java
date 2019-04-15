package com.dongxi.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import com.dongxi.gmall.service.OrderService;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
@EnableDubbo
public class OrderApplication {

    public static  void main(String[] args) throws IOException {
       /* ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService= ioc.getBean(OrderService.class);
        orderService.initOrder("");
        System.out.println("调用完成++++++");
        System.in.read();//阻塞一下*/

        SpringApplication.run(OrderApplication.class,args);
    }
}
