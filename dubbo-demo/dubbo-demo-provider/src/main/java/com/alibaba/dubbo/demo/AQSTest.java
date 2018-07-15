package com.alibaba.dubbo.demo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Copyright 2018/7/15 lcfarm All Rights Reserved
 * 请添加类/接口的说明：
 *
 * @Package: com.alibaba.dubbo.demo
 * @author: Jerrik
 * @date: 2018/7/15 16:05
 */
public class AQSTest {
    public static void main(String[] args) throws InterruptedException {
       final  ReentrantLock lock = new ReentrantLock();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println("thread1 wait lock");
                    lock.lock();
                    System.out.println("thread-locked");
                    try {
                        TimeUnit.SECONDS.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.unlock();
                }
            }
        }).start();

        /*new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println("thread2 wait lock");
                    lock.lock();
                    System.out.println("thread2-locked");
                    try {
                        TimeUnit.SECONDS.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.unlock();
                }
            }
        }).start();*/

        TimeUnit.SECONDS.sleep(1);
        System.out.println("main 线程进来");

        lock.lock();
        System.out.println("main线程锁定,done!");
    }
}
