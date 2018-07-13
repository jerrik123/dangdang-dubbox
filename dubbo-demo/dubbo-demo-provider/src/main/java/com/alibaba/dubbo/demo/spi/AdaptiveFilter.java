package com.alibaba.dubbo.demo.spi;

import com.alibaba.dubbo.common.URL;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/13
 * @Description:
 */
//@Adaptive
public class AdaptiveFilter implements IFilter {

    @Override
    public void doFilter() {
        System.out.println("AdaptiveFilter");
    }

    public void setUrl(URL url){
        System.out.println("url: " + url);
    }

    @Override
    public void operation(UrlNode urlNode) {

    }
}
