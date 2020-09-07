package com.xwj.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xwj.javaBean.UserAddress;
import com.xwj.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;

@Component
//注意 这个Service是dubbo的Service
//@Service(stub = "true",version = "1.0.0")
//@Service(stub = "true",version = "1.0.0")
@Service
public class UserServiceImpl implements UserService {
    @HystrixCommand
    @Override
    public List<UserAddress> getUserAddress(String userid)  {
        System.out.println("UserServiceImpl类执行了");
        if(Math.random()>1){
           throw  new RuntimeException();
        }
        UserAddress ua = new UserAddress("1","北京时昌平区","1");
        UserAddress ub = new UserAddress("1","营口市站前区","1");
        return Arrays.asList(ua,ub);
    }
}
