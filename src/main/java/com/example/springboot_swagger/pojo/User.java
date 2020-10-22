package com.example.springboot_swagger.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户类")   //给类添加说明
public class User {
    @ApiModelProperty("用户名")  //给参数添加说明
    public  String userName;
    @ApiModelProperty("密码")
    public  String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
