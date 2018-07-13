package com.alibaba.dubbo.demo.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import java.util.List;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/13
 * @Description:
 */
public class ExtensionLoaderClient {

    public static void main(String[] args){
        System.out.println(ExtensionLoader.getExtensionLoader(IFilter.class).getAdaptiveExtension());

        ExtensionLoader.getExtensionLoader(IFilter.class).getDefaultExtension().doFilter();

        System.out.println(ExtensionLoader.getExtensionLoader(IFilter.class).getDefaultExtensionName());

        ExtensionLoader.getExtensionLoader(IFilter.class).getExtension("http").doFilter();

        URL url = new URL("dubbo", "localhost:8080", 20880, "decode");
        url = url.addParameter("xxx","decode");

        System.out.println("----> " + url.getParameter("xxx"));
        List<IFilter> list = ExtensionLoader.getExtensionLoader(IFilter.class).getActivateExtension(url,"xxx","main");
        System.out.println(list);
    }
}
