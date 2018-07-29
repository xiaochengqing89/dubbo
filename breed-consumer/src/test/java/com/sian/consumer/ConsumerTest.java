package com.sian.consumer;

import com.sian.constant.PayWayConstant;
import com.sian.payplatform.PayService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试方法
 * @version 1.0
 * @Package com.sian.consumer
 * @Project：dubbo
 * @authur：xiaoqing qing.xiao@hnair.com
 * @date：2018/7/29 16:36
 */
public class ConsumerTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        PayService payService = (PayService) context.getBean("payServiceImpl");

        String payWay = payService.toChoosePayWay(1);
        System.out.println(payWay);
    }
}
