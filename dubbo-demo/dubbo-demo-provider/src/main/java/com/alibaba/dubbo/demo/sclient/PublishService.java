package com.alibaba.dubbo.demo.sclient;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.alibaba.dubbo.demo.service.IUserService;
import com.alibaba.dubbo.demo.service.impl.UserServiceImpl;
import java.io.IOException;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/12
 * @Description:
 */
public class PublishService {

    public static void main(String[] args) throws IOException {
        // 服务实现
        IUserService userService = new UserServiceImpl();

        // 当前应用配置
        ApplicationConfig application = new ApplicationConfig();
        application.setName("public-user");

        // 连接注册中心配置
        RegistryConfig registry = new RegistryConfig();
        registry.setAddress("zookeeper://localhost:2181");

        // 服务提供者协议配置
        ProtocolConfig protocol = new ProtocolConfig();
        protocol.setName("dubbo");
        protocol.setPort(20880);
        protocol.setThreads(200);

        // 注意：ServiceConfig为重对象，内部封装了与注册中心的连接，以及开启服务端口
        // 服务提供者暴露服务配置
        ServiceConfig<IUserService> service = new ServiceConfig<IUserService>(); // 此实例很重，封装了与注册中心的连接，请自行缓存，否则可能造成内存和连接泄漏
        service.setApplication(application);
        service.setRegistry(registry); // 多个注册中心可以用setRegistries()
        service.setProtocol(protocol); // 多个协议可以用setProtocols()
        service.setInterface(IUserService.class);
        service.setRef(userService);
        service.setVersion("1.0.0");

        // 暴露及注册服务
        service.export();

        System.out.println("--------------------------服务启动--------------------------");
        System.in.read();
    }
}
