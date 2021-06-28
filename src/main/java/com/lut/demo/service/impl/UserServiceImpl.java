package com.lut.demo.service.impl;

import com.lut.demo.bean.User;
import com.lut.demo.bean.UserExample;
import com.lut.demo.dao.UserMapper;
import com.lut.demo.service.UserService;
import com.lut.demo.utils.ResultUtil;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public int register(User user){
        String salt=RandomStringUtils.randomAscii(30);
        SimpleHash simpleHash=new SimpleHash("md5",user.getPassword(),salt,100);
        String pwdMD5=simpleHash.toString();
        user.setPassword(pwdMD5);
        user.setSalt(salt);
        int i=userMapper.insertSelective(user);
        return 0;
    }

    @Override
    public ResultUtil login(User user) {
        UserExample example=new UserExample();
        example.createCriteria().andUsernameEqualTo(user.getUsername());
        List<User> users=userMapper.selectByExample(example);
        ResultUtil resultUtil=new ResultUtil();
        if(users.size()==0){
            resultUtil.setCode(300);
            resultUtil.setMsg("User-none");
            return resultUtil;
        }else{
            User u=users.get(0);
            SimpleHash simpleHash=new SimpleHash("md5",user.getPassword(),u.getSalt(),100);
            String pwddMd5FromWeb=simpleHash.toString();
            if(pwddMd5FromWeb.equals(u.getPassword())){
                resultUtil.setCode(200);
                resultUtil.setMsg("user-login-success");
                return resultUtil;
            }else{
                resultUtil.setCode(301);
                resultUtil.setMsg("user-login-pwd-error");
                return resultUtil;
            }
        }
    }
}
