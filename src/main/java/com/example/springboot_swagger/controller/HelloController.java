package com.example.springboot_swagger.controller;

import com.example.springboot_swagger.pojo.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    //Operation接口
    @ApiOperation("访问hello")   //给接口添加说明
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(  String name){
        return "您好,"+name;
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public User user(User user){
        return user;
    }

}
