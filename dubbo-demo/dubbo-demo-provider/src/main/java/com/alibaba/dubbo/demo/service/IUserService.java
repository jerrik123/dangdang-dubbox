package com.alibaba.dubbo.demo.service;

import com.alibaba.dubbo.demo.bean.User;
import java.util.List;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/12
 * @Description:
 */
public interface IUserService {

    List<User> findAllUserList();

    void updateUserById(Integer id);

    String findPasswd(String userName);
}
