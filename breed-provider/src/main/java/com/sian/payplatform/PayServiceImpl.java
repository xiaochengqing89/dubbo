package com.sian.payplatform;

/**
 * @version 1.0
 * @Package com.sian.payplatform
 * @Project：dubbo
 * @authur：xiaoqing qing.xiao@hnair.com
 * @date：2018/7/22 17:51
 */
public class PayServiceImpl implements PayService {

    public String toChoosePayWay(Integer type) {
        return "支付宝";
    }
}
