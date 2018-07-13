package com.alibaba.dubbo.demo.adaptive;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class IFilter$Adpative implements com.alibaba.dubbo.demo.spi.IFilter {

    public void doFilter() {
        throw new UnsupportedOperationException(
                "method public abstract void com.alibaba.dubbo.demo.spi.IFilter.doFilter() of interface com.alibaba.dubbo.demo.spi.IFilter is not adaptive method!");
    }

    public void setUrl(com.alibaba.dubbo.common.URL arg0) {
        throw new UnsupportedOperationException(
                "method public abstract void com.alibaba.dubbo.demo.spi.IFilter.setUrl(com.alibaba.dubbo.common.URL) of interface com.alibaba.dubbo.demo.spi.IFilter is not adaptive method!");
    }

    public void operation(com.alibaba.dubbo.demo.spi.UrlNode arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("com.alibaba.dubbo.demo.spi.UrlNode argument == null");
        }
        if (arg0.getUrl() == null) {
            throw new IllegalArgumentException("com.alibaba.dubbo.demo.spi.UrlNode argument getUrl() == null");
        }
        com.alibaba.dubbo.common.URL url = arg0.getUrl();
        String extName = url.getParameter("i.filter", "logger");
        if (extName == null) {
            throw new IllegalStateException("Fail to get extension(com.alibaba.dubbo.demo.spi.IFilter) name from url(" + url.toString() + ") use keys([i.filter])");
        }
        com.alibaba.dubbo.demo.spi.IFilter extension = (com.alibaba.dubbo.demo.spi.IFilter) ExtensionLoader.getExtensionLoader(com.alibaba.dubbo.demo.spi.IFilter.class)
                .getExtension(extName);
        extension.operation(arg0);
    }
}