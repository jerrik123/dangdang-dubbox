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

public class Validation$Adpative implements com.alibaba.dubbo.validation.Validation {
    public com.alibaba.dubbo.validation.Validator getValidator(com.alibaba.dubbo.common.URL arg0) {
        if (arg0 == null) throw new IllegalArgumentException("url == null");
        com.alibaba.dubbo.common.URL url = arg0;
        String extName = url.getParameter("validation", "jvalidation");
        if (extName == null)
            throw new IllegalStateException("Fail to get extension(com.alibaba.dubbo.validation.Validation) name from url(" + url.toString() + ") use keys([validation])");
        com.alibaba.dubbo.validation.Validation extension = (com.alibaba.dubbo.validation.Validation) ExtensionLoader.getExtensionLoader(com.alibaba.dubbo.validation.Validation.class).getExtension(extName);
        return extension.getValidator(arg0);
    }
}
