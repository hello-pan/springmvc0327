package com.springmvc.user;

import com.springmvc.ljz.demo.model.User;
import com.springmvc.ljz.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/4/12.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:config/spring.xml",
        "classpath*:config/spring-mybatis.xml" })
public class UserTest {

    @Resource
    UserService userService;



    @Test
    public void test1(){
        User user =userService.selectByPrimaryKey(1);

        System.out.println(user.getName());
    }




}
