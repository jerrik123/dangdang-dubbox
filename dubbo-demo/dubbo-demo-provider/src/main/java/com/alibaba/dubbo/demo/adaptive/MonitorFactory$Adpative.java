package com.alibaba.dubbo.demo.adaptive;

/**
 * Copyright 2018/7/7 lcfarm All Rights Reserved
 * 请添加类/接口的说明：
 *
 * @Package: com.njq.nongfadai.samples.loader.adaptive
 * @author: Jerrik
 * @date: 2018/7/7 0:13
 */

import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class MonitorFactory$Adpative implements com.alibaba.dubbo.monitor.MonitorFactory {
    public com.alibaba.dubbo.monitor.Monitor getMonitor(com.alibaba.dubbo.common.URL arg0) {
        if (arg0 == null) throw new IllegalArgumentException("url == null");
        com.alibaba.dubbo.common.URL url = arg0;
        String extName = (url.getProtocol() == null ? "dubbo" : url.getProtocol());
        if (extName == null)
            throw new IllegalStateException("Fail to get extension(com.alibaba.dubbo.monitor.MonitorFactory) name from url(" + url.toString() + ") use keys([protocol])");
        com.alibaba.dubbo.monitor.MonitorFactory extension = (com.alibaba.dubbo.monitor.MonitorFactory) ExtensionLoader.getExtensionLoader(com.alibaba.dubbo.monitor.MonitorFactory.class).getExtension(extName);
        return extension.getMonitor(arg0);
    }
}
