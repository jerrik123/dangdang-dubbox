package com.alibaba.dubbo.demo.spi;

import com.alibaba.dubbo.common.URL;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/13
 * @Description:
 */
public class HttpFilter implements IFilter {

    @Override
    public void doFilter() {
        System.out.println("HttpFilter");
    }

    @Override
    public void setUrl(URL url) {

    }

    @Override
    public void operation(UrlNode urlNode) {

    }
}
