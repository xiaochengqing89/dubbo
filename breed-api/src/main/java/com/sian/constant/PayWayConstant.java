package com.sian.constant;

/**
 * 支付方式枚举
 * @version 1.0
 * @Package com.sian.constant
 * @Project：dubbo
 * @authur：xiaoqing qing.xiao@hnair.com
 * @date：2018/7/29 17:29
 */
public enum PayWayConstant {
    ALIPAY(1, "ALI_PAY"),WAICHATPAY(2, "WEICHAT_PAY");
    /**
     * 支付类型
     */
     private Integer type;
    /**
     * 支付方式
     */
     private String payWay;

    private PayWayConstant() {
    }

    private PayWayConstant(Integer type, String payWay) {
        this.type = type;
        this.payWay = payWay;
    }

    /**
     * 根据支付类型返回支付方式
     * @param type 支付类型
     * @return
     */
    public static String getPayWayByType(Integer type) {
        for (PayWayConstant payWayConstant : PayWayConstant.values()) {
            if (payWayConstant.getType() .equals(type)) {
                return payWayConstant.getPayWay();
            }
        }

        return null;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    @Override
    public String toString() {
        return "PayWayConstant{" +
                "type=" + type +
                ", payWay='" + payWay + '\'' +
                '}';
    }
}
