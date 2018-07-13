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

public class CacheFactory$Adpative implements com.alibaba.dubbo.cache.CacheFactory {
    public com.alibaba.dubbo.cache.Cache getCache(com.alibaba.dubbo.common.URL arg0) {
        if (arg0 == null) throw new IllegalArgumentException("url == null");
        com.alibaba.dubbo.common.URL url = arg0;
        String extName = url.getParameter("cache", "lru");
        if (extName == null)
            throw new IllegalStateException("Fail to get extension(com.alibaba.dubbo.cache.CacheFactory) name from url(" + url.toString() + ") use keys([cache])");
        com.alibaba.dubbo.cache.CacheFactory extension = (com.alibaba.dubbo.cache.CacheFactory) ExtensionLoader.getExtensionLoader(com.alibaba.dubbo.cache.CacheFactory.class).getExtension(extName);
        return extension.getCache(arg0);
    }
}
