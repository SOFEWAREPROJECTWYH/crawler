package com.lut.demo.service;

import com.lut.demo.bean.User;
import com.lut.demo.utils.ResultUtil;

public interface UserService {
    public int register(User user);
    public ResultUtil login(User user);
}
