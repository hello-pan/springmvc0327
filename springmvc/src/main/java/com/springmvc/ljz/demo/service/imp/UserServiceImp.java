package com.springmvc.ljz.demo.service.imp;

import com.springmvc.ljz.demo.dao.UserMapper;
import com.springmvc.ljz.demo.model.User;
import com.springmvc.ljz.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/4/12.
 */
@Service("userService")
public class UserServiceImp implements UserService{

    @Resource
     UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
