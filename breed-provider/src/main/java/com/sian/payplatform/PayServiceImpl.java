package com.sian.payplatform;

import com.sian.constant.PayWayConstant;

/**
 * @version 1.0
 * @Package com.sian.payplatform
 * @Project：dubbo
 * @authur：xiaoqing qing.xiao@hnair.com
 * @date：2018/7/22 17:51
 */
public class PayServiceImpl implements PayService {
    /**
     *
     * @param type 类型
     * @return
     * @authur xiaoqing qing.xiao@hnair.com
     * @date 2018/7/29 17:27
     */
    public String toChoosePayWay(Integer type) {
        return PayWayConstant.getPayWayByType(type);
    }
}
