package com.alibaba.dubbo.demo.adaptive;

/**
 * Copyright 2018/7/7 lcfarm All Rights Reserved
 * 请添加类/接口的说明：
 *
 * @Package: com.njq.nongfadai.samples.loader.adaptive
 * @author: Jerrik
 * @date: 2018/7/7 0:15
 */

import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class ThreadPool$Adpative implements com.alibaba.dubbo.common.threadpool.ThreadPool {
    public java.util.concurrent.Executor getExecutor(com.alibaba.dubbo.common.URL arg0) {
        if (arg0 == null) throw new IllegalArgumentException("url == null");
        com.alibaba.dubbo.common.URL url = arg0;
        String extName = url.getParameter("threadpool", "fixed");
        if (extName == null)
            throw new IllegalStateException("Fail to get extension(com.alibaba.dubbo.common.threadpool.ThreadPool) name from url(" + url.toString() + ") use keys([threadpool])");
        com.alibaba.dubbo.common.threadpool.ThreadPool extension = (com.alibaba.dubbo.common.threadpool.ThreadPool) ExtensionLoader.getExtensionLoader(com.alibaba.dubbo.common.threadpool.ThreadPool.class).getExtension(extName);
        return extension.getExecutor(arg0);
    }
}
