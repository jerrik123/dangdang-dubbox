package com.alibaba.dubbo.demo.service.impl;

import com.alibaba.dubbo.demo.bean.User;
import com.alibaba.dubbo.demo.service.IUserService;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/12
 * @Description:
 */
public class UserServiceImpl implements IUserService {

    @Override
    public List<User> findAllUserList() {
        List<User> userList = new ArrayList<User>();
        userList.add(new User(3,"jerrik","123456",24));
        userList.add(new User(4,"scott","whereis",23));
        userList.add(new User(5,"john","432123",27));
        return userList;
    }

    @Override
    public void updateUserById(Integer id) {
            System.out.println("updateUser id: " + id);
    }

    @Override
    public String findPasswd(String userName) {
        System.out.println("findPasswd userName: " + userName);
        return userName + "_@123";
    }
}
