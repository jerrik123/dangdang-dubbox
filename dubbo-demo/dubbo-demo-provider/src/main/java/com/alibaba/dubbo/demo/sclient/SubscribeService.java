package com.alibaba.dubbo.demo.sclient;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.demo.service.IUserService;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/12
 * @Description:
 */
public class SubscribeService {

    public static void main(String[] args){
        // 当前应用配置
        ApplicationConfig application = new ApplicationConfig();
        application.setName("subscribe-service");

        // 连接注册中心配置
        RegistryConfig registry = new RegistryConfig();
        registry.setAddress("zookeeper://localhost:2181");

        // 注意：ReferenceConfig为重对象，内部封装了与注册中心的连接，以及与服务提供方的连接

        // 引用远程服务
        ReferenceConfig<IUserService> reference = new ReferenceConfig<IUserService>(); // 此实例很重，封装了与注册中心的连接以及与提供者的连接，请自行缓存，否则可能造成内存和连接泄漏
        reference.setApplication(application);
        reference.setRegistry(registry); // 多个注册中心可以用setRegistries()
        reference.setInterface(IUserService.class);
        reference.setVersion("1.0.0");

        // 和本地bean一样使用xxxService
        IUserService userService = reference.get(); // 注意：此代理对象内部封装了所有通讯细节，对象较重，请缓存复用
        System.out.println(userService.findAllUserList());
    }
}
