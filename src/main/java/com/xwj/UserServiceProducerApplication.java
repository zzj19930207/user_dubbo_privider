package com.xwj;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:user_provider.xml")
//@EnableDubbo
@EnableHystrix
@SpringBootApplication

public class UserServiceProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceProducerApplication.class, args);
    }

}
