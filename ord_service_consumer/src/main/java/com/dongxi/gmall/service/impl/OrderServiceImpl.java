package com.dongxi.gmall.service.impl;

import com.dongxi.gmall.bean.User;
import com.dongxi.gmall.service.OrderService;
import com.dongxi.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class OrderServiceImpl  implements OrderService {

    @Autowired
   private OrderService orderService;

    @Override
    public List<User> initOrder(String userId) {
        if (!StringUtils.isEmpty(userId)) {
            return orderService.initOrder(userId);
        }
        return null;

    }
}
