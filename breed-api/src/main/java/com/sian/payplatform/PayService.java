package com.sian.payplatform;

/**
 * @version 1.0
 * @Package com.sian.payplatform
 * @Project：dubbo
 * @authur：xiaoqing qing.xiao@hnair.com
 * @date：2018/7/22 17:36
 */
public interface PayService {
    /**
     * 根据类型选择支付方式
     * @param: [type] 类型
     * @returns java.lang.String
     * @author xiaoqing
     * @date 2018/7/22 17:42
     */
    String toChoosePayWay(Integer type);
}
