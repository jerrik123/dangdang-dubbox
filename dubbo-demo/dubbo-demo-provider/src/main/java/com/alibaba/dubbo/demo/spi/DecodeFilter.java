package com.alibaba.dubbo.demo.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Activate;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/13
 * @Description:
 */
@Activate(group = "33" ,value = "decode")
public class DecodeFilter implements IFilter {

    @Override
    public void doFilter() {
        System.out.println("DecodeFilter");
    }

    @Override
    public void setUrl(URL url) {

    }

    @Override
    public void operation(UrlNode urlNode) {

    }
}
