package com.xwj.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xwj.javaBean.UserAddress;
import com.xwj.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
//注意 这个Service是dubbo的Service
@Service(version = "2.0.0")
public class UserServiceImpl2 implements UserService {
    @Override
    public List<UserAddress> getUserAddress(String userid)  {
        System.out.println("UserServiceImpl2类执行了");
        UserAddress ua = new UserAddress("1","北京时昌平区","1");
        UserAddress ub = new UserAddress("1","营口市站前区","1");
        return Arrays.asList(ua,ub);
    }
}
