package com.dongxi.gmall.service.impl;

import com.dongxi.gmall.bean.User;
import com.dongxi.gmall.dao.mapper.IUserDao;
import com.dongxi.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//spring的Service注解
@Service
//dubbo的Service注解
@com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl implements UserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public User getUser(String userId) {
       User user = userDao.selectByPrimaryKey(userId);
       if (user != null){
           return user;
       }
       return null;
    }

    @Override
    public List<User> getUserAddressList() {
        List userList = userDao.selectAll();
        if (userList!= null && userList.size()>0){
            return userList;
        }
        return null;
    }

}
