package com.lut.demo.controller;

import com.lut.demo.bean.User;
import com.lut.demo.service.UserService;
import com.lut.demo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("register")
    public ResultUtil register(User user){
        int i=userService.register(user);
        ResultUtil resultUtil=new ResultUtil();
        if(i!=0){
            resultUtil.setCode(500);
            resultUtil.setMsg("user-add-fail");
            return resultUtil;
        }else{
            resultUtil.setCode(200);
            resultUtil.setMsg("user-add-success");
            return resultUtil;
        }
    }
    @PostMapping("/login")
    public ResultUtil login(User user){
        ResultUtil result=userService.login(user);
        return result;
    }
}
