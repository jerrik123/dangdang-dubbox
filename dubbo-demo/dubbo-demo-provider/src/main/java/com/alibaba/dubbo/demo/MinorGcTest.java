package com.alibaba.dubbo.demo;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/16
 * @Description:
 */
public class MinorGcTest {
    final static int _1MB = 1024*1024;



    public static void main(String[] args) throws InterruptedException {
        while(true){
            byte[] buffer = new byte[_1MB];

            TimeUnit.SECONDS.sleep(2);

           // System.gc();
        }
    }
}
