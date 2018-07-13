package com.alibaba.dubbo.demo.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;

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

    @Adaptive
    public void setUrl(URL url){
        System.out.println("url: " + url);
    }

    @Override
    public void operation(UrlNode urlNode) {

    }
}
