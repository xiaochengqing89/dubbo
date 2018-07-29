package com.sian.payplatform;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @version 1.0
 * @Package com.sian.payplatform
 * @Project：dubbo
 * @authur：xiaoqing qing.xiao@hnair.com
 * @date：2018/7/22 21:26
 */
public class TestPayService {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:META-INF/spring/dubbo-provide.xml");
        classPathXmlApplicationContext.start();
        System.out.println("生产服务器已经注册成功！");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
