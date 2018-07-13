package com.alibaba.dubbo.demo.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/13
 * @Description:
 */
@SPI("logger")
public interface IFilter {

    public void doFilter();

    public void setUrl(URL url);

    @Adaptive(value = {"decode","http"})
    public void operation(UrlNode urlNode);
}
